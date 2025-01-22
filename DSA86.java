class DSA86 {
    static void CountInversion(int []a){
        int count =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
        }
        System.out.println("Count is : "+count);
    }
    public static void main (String[]args){
        int []a ={ 2, 4, 1, 3, 5};
        CountInversion(a);
    }
}