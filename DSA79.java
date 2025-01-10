public class DSA79 {
    static int Searchnum(int a[],int x,int k){
        int i =0;
        int n = a.length;
        while(i<n){
            if(a[i]==x){
                return i;
            }
            i += Math.max(1,Math.abs(a[i]-x)/k);
        }
        System.out.println("No such element found");
        return -1;
    }
    public static void main(String[]args){
        int a[] = {20, 40, 50, 70, 70, 60};
        int x = 60;
        int k = 20;
        int i = Searchnum(a,x,k);
        if(i != -1){
            System.out.println("The element is present at index: "+ i);
        }

    }
}
