public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,5,3};
        bubleSortAlg(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void bubleSortAlg(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int flag = 0;
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) break;
        }

    }

}
