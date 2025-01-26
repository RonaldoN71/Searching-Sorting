
//BRUTE FORCE
public class DSA91 {
    static void reverseArr(int []b,int start,int end){
        while(start<end){
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
            start++;end--;
        }
    }
    static boolean isSort(int []b){
        for(int i=1;i<b.length;i++){
            if(b[i]<b[i-1]){
                return false;
            }
        }
        return true;
    }
    static boolean isSubSort(int []a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int []b = a.clone();
                reverseArr(b,i,j);
                if(isSort(b)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int a[] = {5,4,3,2,1};
        if(isSubSort(a)){
            System.out.println("The array has subset that when we reverse, a sort array is formed");
        }
        else{
            System.out.println("it doesn't form sorted array ");
        }
    }
}
