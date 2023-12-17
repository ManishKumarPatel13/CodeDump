public class MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        // Copy data to temp arrays
        int merged[] = new int[ei - si + 1];
        int index1 = si; // starting index for the left sub-array
        int index2 = mid + 1; // starting index for right sub-array
        int i = 0; // iterator for the merge array

        // Merging the sub-arrays into one array in ascending order
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[i++] = arr[index1++];
            } else {
                merged[i++] = arr[index2++];
            }
        }
        // If first half is remaining then copy that to the sorted array.
        while (index1 <= mid) {
            merged[i++] = arr[index1++];
        }
        // The second half is remaining then copy that to the sorted array.
        while (index2 <= ei) {
            merged[i++] = arr[index2++];
        }
        for (int x=0, j = si; x<merged.length; x++, j++){ // x is for the starting index of the merge array and j for the original array 
            arr[j] = merged[x];
        }

    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public int[] mergeSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] inputArray = {9, 5, 6, 8, 3, 7};
        divide(inputArray, 0, inputArray.length - 1);
        for (int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
    }
}
