
public class insertion_sort {
    public static void insertionSort(int[] arr){
        int l = arr.length;
        int element, j;
        for(int i = 1; i < l; i++){
            element = arr[i];
            j = i - 1;
            while(j >= 0 && element < arr[j]){
                arr[j+1] = arr[j];
                j = j - 1; 
            }
            arr[j+1] = element;
        }
        
    }

    

    public static void main(String[] args) {
        int[] ar = {3, 5, 2, 4, 7};
        insertionSort(ar);
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " --> ");
        }
    }
}
