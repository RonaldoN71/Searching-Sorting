public class DSA90 {
    static void FindMax(int []a){
        int n = a.length;
        int result =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum += Math.abs(a[i]-a[j]);
                }
            }
            if(result>sum){
                result = sum;
            }
        }

        System.out.println("The value is "+ result);
    }
    public static void main(String[]args){
        int []a = {4,6};
        FindMax(a);
    }
}
