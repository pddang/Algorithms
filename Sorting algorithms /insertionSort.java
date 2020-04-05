class insertionSort{
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,5,3};
        insertionSortAlg(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void insertionSortAlg(int [] arr){
        for(int i = 1; i < arr.length; i++){
            int val =  arr[i];
            int hole = i; 
            while(hole > 0 && arr[hole -1] > val){
                arr[hole] = arr[hole-1];
                hole = hole - 1; 
            }
            arr[hole] = val;
        }
    }
}