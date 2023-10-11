public class bubble_sort {
    public static void bubbleSort(int[] ar){
        int n = ar.length;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(ar[i] < ar[j]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 7, 6, 5};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }   
    }
}
