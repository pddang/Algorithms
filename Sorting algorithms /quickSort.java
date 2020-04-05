
public class quickSort {

    public static void main(String[] args) {
        int arr[] = { 7,6,5,3,2,1,8,9,11};
        QuickSort(arr, 0, arr.length - 1);
        for(int item: arr){
            System.out.print(item + " ");
        }

    }

public static void QuickSort(int[] arr, int start, int end){
    if(start < end){
        int partitionIndex = partition(arr, start, end);
        QuickSort(arr, start, partitionIndex-1);
        QuickSort(arr, partitionIndex +1, end);
    }

}

static int partition(int arr[], int low, int high) 
{ 
    int pivot = arr[high];  
    int i = (low-1); // index of smaller element 
    for (int j=low; j<high; j++) 
    { 
        // If current element is smaller than the pivot 
        if (arr[j] < pivot) 
        { 
            i++; 
            // swap arr[i] and arr[j] 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
    } 

    // swap arr[i+1] and arr[high] (or pivot) 
    int temp = arr[i+1]; 
    arr[i+1] = arr[high]; 
    arr[high] = temp; 

    return i+1; 
} 



}
