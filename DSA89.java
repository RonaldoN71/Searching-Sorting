public class DSA89 {
    static void Product(int a[]){
        int []b = new int[a.length];
        for(int i=0;i<a.length;i++){
            int value=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    value = value * a[j];
                }
            }
            b[i] = value;
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
