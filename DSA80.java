public class DSA80 {
    static int Ceiling(int a[],int x){
        int i = 0;
        int n = a.length;
        if(x<a[i]){
            return a[i];
        }

        while(i<n){
            if(a[i]== x){
                return a[i];
            }
            if(x> a[i] && a[i+1]>x){
                return a[i+1];
            }
            i++;
        }
        return -1;

    }
    public static void main(String[]args){
        int a[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 18;
        int n = Ceiling(a,x);
        System.out.println("The Ceil of the the no. "+ x +" is: "+n);

    }
}
