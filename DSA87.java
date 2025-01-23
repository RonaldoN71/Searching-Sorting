
// import java.util.HashSet;

// public class DSA87 {
//     static void findDupli(int[]a){
//         HashSet<Integer> map = new HashSet<>();
//         for(int i=0;i<a.length-1;i++){
//             for(int j=i+1;j<a.length;j++){
//                 if(a[i]==a[j]){
//                     map.add(a[i]);
//                 }
//             }
//         }
//         System.out.print("The duplicates are: ");
//         for(int num: map){
//             System.out.print(num + " ");
//         }
//     }
//     public static void main(String[]args){
//         int a[] = {1, 2, 3, 6, 3, 6,3, 1};
//         findDupli(a);
//     }
// }

// import java.util.HashMap;
// class DSA87{
//     public static void main(String[]args){
//         int a[] = {1, 2, 3, 6, 3, 6,3, 1};
    
//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int ele: a){
//             map.put(ele,map.getOrDefault(ele,0)+1);
//         }
//         System.out.print("The duplicates are: ");
//         for(int key: map.keySet()){
//             if(map.get(key)>1){
//                 System.out.print(key + " ");
//             }
//         }
        
//     }
// }

class DSA87{
    public static void main(String[]args){
        int a[] = {1, 2, 3, 6, 3, 6,3, 1};
        int n = a.length;
        System.out.println("The duplicates are: ");
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+ " ");
                    break;
                }
            }
        }
    }
}