public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,5,3,8,3,2,1,6,7,8,3,4,3,2,11,4,8,9,0,9};
        mergeSortAlg(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    //recursive alg, divide to two array with base case n = 1; 
    public static void mergeSortAlg(int[] arr){
        int n = arr.length;
        int mid = n /2; 
        if(n < 2) return;
        int[] left = new int[mid];
        
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        mergeSortAlg(left);
        mergeSortAlg(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr){
        int i=0, j=0, k = 0;
        while(i < left.length && j < right.length ){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}