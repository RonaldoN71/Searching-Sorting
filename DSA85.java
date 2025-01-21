public class DSA85 {
    static void Merge(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int i=0,j =0,k=0;
        int arr[] = new int[n+m];
        while(i<n&& j<m){
            if(a[i]<b[j]){
                arr[k] = a[i];
                k++;i++;
            }
            else{
                arr[k] = b[j];
                k++;j++;
            }
        }
        while(i<n){
            arr[k] = a[i];
            k++;i++;
        }
        while(j<m){
            arr[k] = a[j];
            k++;j++;
        }
       for(int c =0;c<n+m;c++){
        if(c<n) {a[c] = arr[c];}
        else{
            b[c-n] = arr[c];
        }
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
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+ " ");
        }
    }
}
