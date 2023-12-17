public class RadixSort {

    public static int getIndex(int[] ar, int e){
        int i = 0;
        // finding the correct index of the element according to its value in the array
        for (int j=0; j<ar.length; j++){
            if (ar[j] < e){
                i++;
            }
        }
        return i;
    }

    public static int getMax(int[] ar){
        int max = ar[0];
        for (int n: ar) {
            if (n > max) {
                max = n;
                }
        }
        return max;
    }

    public static int[] divarr(int[] ar, int div, int l){
        // cloning our original array so that operations don't affect original array
        int[] temp = ar.clone();
        for (int j = 0; j < l; j++){
            // getting the digit place of the array and it depends upon the value of div if div = 1 ones if 10 tens
            temp[j] = (temp[j]%(div*10))/(div);
        }
        return temp;
    }

    public static int[] clearArray(int[] ar){
        // Making every element in the array as 0
        for (int i = 0; i < ar.length; i++){
            ar[i] = 0;
        }
        return ar;
    }

    // 170, 45, 75, 90, 23, 89 -> after first iteration
    // 23, 45, 170, 75, 89, 90 -> after second iteration
    // 23, 45, 75, 89, 90, 170 -> sorted
    public int[] radixsort(int[] arr){
        // Getting the max value from the array
        int max = getMax(arr);
        int l = arr.length;
        // Creating an auxiliary array to hold each digit of elements in input array
        int[] newarr = new int[l];
        // i is our divisor value 
        int i = 1;
        // iterating for each digit in the array
        while(max > 0){
            // digit array stores the current place value digits of all elements in our array 
            int[] digit = divarr(arr, i, l);
            // iterating for every element in our array
            for (int j = 0; j < l;j++){
                // adding the current element's digit at its correct position in the auxilary array
                int index = getIndex(digit, digit[j]);
                // Checking if two elements have same digits at there place value or not 
                if (newarr[index] != 0){
                    // iterating till we get a empty space for our element 
                    while(newarr[index] != 0){
                        index++;
                    }
                }
                // storing the value of arr at its correct position according to its digit place
                newarr[index] = arr[j];
            }
            max = max/10;
            arr = newarr.clone();
            // increasing our divisor
            i = i*10;
            // clearing our new array so that we don't have any error when indexing
            newarr = clearArray(newarr);
        }
        return arr;
    } 
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 23, 89};
        RadixSort rs = new RadixSort();
        System.out.println("Given array");
        for (int i : arr) {     
            System.out.print(i + " ");
            }
    System.out.println("\nSorted array");
    arr = rs.radixsort(arr);
    for (int i : arr) {
        System.out.print(i + " ");
        }
    }
}