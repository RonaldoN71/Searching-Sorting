import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DSA92 {
   
    static void findQuadruples(int[] a, int d) {
        int n = a.length;
        List<List<Integer>> result = new ArrayList<>();
        // Iterating over all quadruples
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int[] quad = {a[i], a[j], a[k], a[l]};
                        int sum = a[i] + a[j] + a[k] + a[l];

                        // Check if the sum equals 'd' and the quadruple is sorted
                        if (sum == d) {
                            List<Integer> list = Arrays.asList(a[i],a[j],a[k],a[l]);
                            Collections.sort(list);
                            if(!result.contains(list)){
                                result.add(list);
                            }
                        }
                    }
                }
            }
        }
        for(List lis:result){
            System.out.print("(");
            for(int i=0;i<lis.size();i++){
                System.out.print(lis.get(i)+",");
            }
            System.out.println(")");
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 11, 10, 12, 11};
        int d = 43;
        findQuadruples(a, d);
    }
}
