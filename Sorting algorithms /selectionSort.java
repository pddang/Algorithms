
public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,5,3};
        selectionSortAlg(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void selectionSortAlg(int [] arr){
        for(int i  = 0; i < arr.length -1 ; i++){
            int minIndex = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}