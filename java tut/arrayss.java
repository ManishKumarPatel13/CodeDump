public class arrayss {
    public static void main(String[] args) {
        // There are three ways to create array in java
        // 1. Declaration and then memory allocation
        // int[] marks;
        // marks = new int[5];

        // 2. Declaration and memory allocation
        // int[] marks = new int[5];

        // 3. declaration , memory allocation and initialization
        int[] marks = { 89, 43, 22 };

        // Unlike c and c++ we can use length function in java array because it isa
        // object in java
        System.out.println(marks); // This will give the memory location only

        // Printing an array

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
