// public class DSA85 {
//     static void Merge(int a[],int b[]){
//         int n = a.length;
//         int m = b.length;
//         int i=0,j =0,k=0;
//         int arr[] = new int[n+m];
//         while(i<n&& j<m){
//             if(a[i]<b[j]){
//                 arr[k] = a[i];
//                 k++;i++;
//             }
//             else{
//                 arr[k] = b[j];              TC = O(n+m) + O(n+m)  SC = O(n+m)
  
//                 k++;j++;
//             }
//         }
//         while(i<n){
//             arr[k] = a[i];
//             k++;i++;
//         }
//         while(j<m){
//             arr[k] = a[j];
//             k++;j++;
//         }
//        for(int c =0;c<n+m;c++){
//         if(c<n) {a[c] = arr[c];}
//         else{
//             b[c-n] = arr[c];
//         }
//     }
//     }
//     public static void main(String[]args){
//         int a[] = {2,4,7,10};
//         int b[] = {2,3};
//         Merge(a,b);
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+ " ");
//         }
//         System.out.println();
//         for(int j=0;j<b.length;j++){
//             System.out.print(b[j]+ " ");
//         }
//     }
// }

// import java.util.Arrays;

// public class DSA85 {
//     static void swap(int a[],int b[],int i,int j){
//         int temp = a[i];
//         a[i] = b[j];
//         b[j] = temp;
//     }
//     static void Merge(int a[],int b[]){
//         int n = a.length;
//         int m = b.length;
//         int left = n-1;
//         int right =0;
//         while(left>=0 && right<m){
//             if(a[left]>a[right]){
//                 swap(a,b,left,right);
//                 left--;right++;
//             }
//             else{
//                 break;
//             }
//         }
//         Arrays.sort(a);
//         Arrays.sort(b);
//     }
    
//     public static void main(String[]args){
//         int a[] = {2,4,7,10};
//         int b[] = {2,3};
//         Merge(a,b);
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+ " ");
//         }
//         System.out.println();
//         for(int i=0;i<b.length;i++){
//             System.out.print(b[i]+ " ");
//         }
//     }
// }


// public class DSA85 {
//     static void swap(int a[],int b[],int i,int j){
//         if(a[i]>b[j]){
//         int temp = a[i];
//         a[i] = b[j];
//         b[j] = temp;
//         }
        
//     }
//     static void Merge(int a[],int b[]){
//         int n = a.length;
//         int m = b.length;
//        int len = n+m;
//        int gap = len/2 + len%2;
//        while(true){
//         int left = 0;
//         int right = left+gap;
//         while(right<len){
//             // arr1 and arr2
//             if(left<n && right>=n){
//                 swap(a,b,left,right-n);
//             }
//             // arr2 and arr2
//             else if(left>=n){
//                 swap(b,b,left-n,right-n);
//             }
//             // arr1 and arr1
//             else {
//                 swap(a,a,left,right);
//             }
//             left++;right++;
            
//         }
//         if(gap==1){
//                 break;
//             }
//             gap = gap/2 + gap%2;
//        }
//     }
    
//     public static void main(String[]args){
//         int a[] = {2,4,7,10};
//         int b[] = {2,3};
//         Merge(a,b);
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+ " ");
//         }
//         System.out.println();
//         for(int i=0;i<b.length;i++){
//             System.out.print(b[i]+ " ");
//         }
//     }
// }
class DSA85{
    static void swapifG(int []a,int []b,int i, int j){
        if(a[i]>b[j]){
            int temp = a[i];
             a[i] = b[j];
             b[j] = temp;
        }
    }
    static void Merge(int []a,int []b){
        int n = a.length;
        int m = b.length;
        int len = m+n;
        int gap = len/2 + len%2;
        while(gap>0){
            int left = 0;
            int right = left + gap;
            while(right<len){
                //arr1 and arr2
                if(left<n && right>=n){
                    swapifG(a,b,left,right-n);
                }
                //arr2 and arr2
                else if(left>=n){
                    swapifG(b,b,left-n,right-n);             
                }
                //arr1 and arr1
                else{
                    swapifG(a,a,left,right);
                }
                left++;right++;
            }
            if(gap==1){
                break;
            }
            gap = gap/2 + gap%2;
        }
    }
    public static void main(String[]args){
        int a[] = {2,4,7,10};
        int b[] = {2,3};
        Merge(a,b);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
    }
}
}