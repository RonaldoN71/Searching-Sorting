
class DSA83 {
    static void FindTriplet(int a[],int x ){
        int n = a.length;
        System.out.println("The triplets: ");
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]<x){
                        System.out.println("("+a[i]+","+a[j]+","+a[k]+") ");
                    }
                }
            }
        }
    }
    public static void main(String[]args){
        int a[] = {-2, 0, 1, 3};
        int x = 2;
        FindTriplet(a,x);
    }
}