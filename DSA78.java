import java.util.ArrayList;
import java.util.HashMap;

class DSA78{
    public static ArrayList<Integer> check(int a[],int b[],int c[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : a){
            map.put(ele,1);
        }
        for(int ele:b){
            if(map.containsKey(ele)&& map.get(ele)==1){
                map.put(ele,2);
            }
        }
        for(int ele:c){
            if(map.containsKey(ele) && map.get(ele)==2){
                map.put(ele,3);
            }
        }
        ArrayList common = new ArrayList<>();
        for(int ele:map.keySet()){
            if(map.get(ele)==3){
                common.add(ele);
            }
        }
        return common;
    }
    public static void main(String[]args){
        int a[] = {2,3,5,6};
        int b[] = {5,6,3,4};
        int c[] = {5,4};
        ArrayList<Integer> list = check(a,b,c);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

