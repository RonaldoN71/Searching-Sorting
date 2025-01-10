import java.util.Arrays;
import java.util.Collections;

public class DSA76 {
    static boolean permute(int []a,Integer []b,int k){
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        for(int i =0;i<a.length;i++){
            if(a[i]+b[i]>= k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int a[] = {2,1,3};
        Integer b[] = {7,8,9};
        int k = 11;
        if(permute(a,b,k)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
