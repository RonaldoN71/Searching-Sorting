// public class DSA84 {
//     static int FindMaxSubse(int a[],int n){
//         if(n<=0){
//             return 0;
//         }
//         if(n==1){
//             return a[0];
//         }
//         int pick = a[n-1] + FindMaxSubse(a,n-2);
//         int notPick = FindMaxSubse(a,n-1);

//         return Math.max(pick,notPick);
//     }
//     public static void main(String[]args){
//         int a[] = {6, 7, 1, 3, 8, 2, 4};
//         int n = a.length;
//         System.out.println(FindMaxSubse(a,n));
//     }
// }

public class DSA84 {
    static int FindMaxSubse(int a[],int n){
       int prev1 = a[0];
       int prev2 = 0;
        for(int i=1;i<n;i++){
            int curr = Math.max(a[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
       }
       return prev1;
        
    }
    public static void main(String[]args){
        int a[] = {6, 7, 1, 3, 8, 2, 4};
        int n = a.length;
        System.out.println(FindMaxSubse(a,n));
    }
}
