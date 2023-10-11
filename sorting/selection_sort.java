
public class selection_sort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int smallest; 
        int index = 0;
        for (int i = 0; i < n; i++) {
            smallest = arr[i];
            for (int j = i; j < n; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                    // System.out.println(smallest + " " + arr[j] + " " + arr[i]);
                }
            }
            // System.out.println(smallest + " " + arr[i]+ " "+ index);
            if (arr[i] != smallest) {
                int temp = arr[i];
                arr[i] = smallest;
                arr[index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = { 3, 5, 1, 6, 8, 9, 4, 4, 89, 93, 77 };
        selectionSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
