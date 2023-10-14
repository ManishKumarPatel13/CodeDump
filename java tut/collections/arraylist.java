import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        // syntax to declare an arraylist
        // ArrayList<datatype> name = new ArrayList<>(); // this will create an
        // arraylist of name = name

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        // Methods of arraylist
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(4, 5); // this will insert element at 4th index
        System.out.println(arr);
        arr.remove(2);// this will remove the element at given index
        System.out.println(arr);

        System.out.println(arr.contains(4)); // this will return true if the given object is present in the array

        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arr2.add(6);
        // arr.addFirst(9);
        arr.addAll(arr2); // this will add all the elements of arr2 to the end of arr
        System.out.println(arr);

        System.out.println(arr.indexOf(6)); // this will print the index of first occurrence of the given element and
                                            // return -1 if not present
        System.out.println(arr.lastIndexOf(6)); // this prints the index of last occurrence
        System.out.println(arr.size()); // this gives the length of arr
        arr.clear(); // this will remove all the elements in the arr
        System.out.println(arr);

    }
}

/*
 * Arraylist class is the dynamic array found in the java.util package
 * 
 * 
 * the size of normal array can not be changed but arraylist provides us the
 * ability to increase or decrease the size
 * 
 * arraylist is slower than the standard array, but it helps us to manipulate
 * the data easily
 */ 