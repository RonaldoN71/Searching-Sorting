// public class DSA89 {
//     static void Product(int a[]){
//         int []b = new int[a.length];
//         for(int i=0;i<a.length;i++){
//             int value=1;
//             for(int j=0;j<a.length;j++){
//                 if(i!=j){
//                     value = value * a[j];
//                 }
//             }
//             b[i] = value;
//         }

//         System.out.print("The new array: ");
//         for(int val: b){
//             System.out.print(val+" ");
//         }
//     }
//     public static void main(String[]args){
//         int a[] = {10, 3, 5, 6, 2};
//         Product(a);
//     }
// }
// public class DSA89 {
//     static void Product(int a[]){
//         int n = a.length;
//         int []b = new int[a.length];
//         int []pre = new int[a.length];
//         int []suf = new int[a.length];

//         pre[0] = 1;
//         for(int i=1;i<n;i++){
//             pre[i] = pre[i-1] * a[i-1];
//         }
//         suf[n-1] = 1;
//         for(int i=n-2;i>=0;i--){
//             suf[i] = suf[i+1]*a[i+1];
//         }

//         for(int i=0;i<n;i++){
//             b[i] = pre[i]*suf[i];
//         }


//         System.out.print("The new array: ");
//         for(int val: b){
//             System.out.print(val+" ");
//         }
//     }
//     public static void main(String[]args){
//         int a[] = {10, 3, 5, 6, 2};
//         Product(a);
//     }
// }

public class DSA89 {
    static void Product(int a[]){
        int n = a.length;
        int []b = new int[a.length];
        b[0] = 1;
        for(int i=1;i<n;i++){
            b[i] = b[i-1]*a[i-1];
        }
        int suf = 1;
        for(int j=n-2;j>=0;j--){
            suf *= a[j+1];
            b[j] *= suf;
            
        }
        System.out.print("The new array: ");
        for(int val: b){
            System.out.print(val+" ");
        }
    }
    public static void main(String[]args){
        int a[] = {10, 3, 5, 6, 2};
        Product(a);
    }
}
