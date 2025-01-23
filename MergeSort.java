public class MergeSort {
    static void Merge(int []arr,int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int k =0;
        int []left = new int[n1];
        int []right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = arr[low];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1];
        }
        int i=0;int j=0;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] =right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            k++;i++;
        }
        while(j<n2){
            arr[k] = right[j];
            k++;j++;
        }
    }
    static void mergeSort(int []arr,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid+1);
            mergeSort(arr,mid+1,right);

            Merge(arr,left,mid,right);
        }
    }
    public static void main(String[]args){
        int[] arr = {12, 11, 13, 5, 6, 7};
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call merge sort on the array
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
