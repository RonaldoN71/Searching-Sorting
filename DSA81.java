public class DSA81 {
    static void findPair(int []a,int x){
        int n = a.length;
        int i =0;
        int j = 1;
        while(i<n && j< n){
            if(i!=j && a[i]-a[j]==x || a[j]-a[i]==x){
                System.out.println("The pair : "+a[i]+", "+a[j]);
                return;
            }
            else if(a[j]-a[i]<x){
                j++;
            }else{
                i++;
            }
        }
        System.out.println("No such pair found");
        return;
    }
    public static void main(String[]args){
        int[] arr = { 1, 8, 30, 40, 100 };
        int x = 1;
        findPair(arr,x);
    }
}
