// public class DSA82 {
//     static void FindMaj(int a[]){
//         int n = a.length;
//         for(int i =0;i<n;i++){
//             int count = 0;
//             for(int  j = 0;j<n;j++){
//                 if(a[i]==a[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 System.out.println(a[i]+" is the majority and count is: "+ count);
//                 return;
//             }
//         }
//         System.out.println("No Majority found");
//         return;
//     }
//     public static void main(String[]args){
//         int a[] = {1, 1, 2, 1, 3, 5, 1};
//         FindMaj(a);
//     }
// }

import java.util.Arrays;

public class DSA82{
    static int FindMaj(int a[] ){
        Arrays.sort(a);
        int n = a.length;
        if(n==1){
            return a[0];
        }
        int count = 1;
        for(int i=1;i<n;i++){
            if(a[i-1]==a[i]){
                count++;
            }else{
                if(count>n/2){
                    return a[i-1];
                }
                count = 1;
            }
            if(count>n/2){
                return a[i];
            }
        }
        return -1;
        
    }
    public static void main(String[]args){
        int a[] = { 1, 2, 1, 3, 5, 1,1};
        System.out.println(FindMaj(a));
    }
}