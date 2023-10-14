public class Stringss {
    public static void main(String[] args) {
        // Two types of creating string
        char str[] = { 'h', 'a', 'r', 'r', 'y' };
        String s = new String(str);
        System.out.println(s);
        // This will be same as
        String ss = "harry";
        int a = 8;
        System.out.println(ss);
        // String sss = "harry";

        // difference between both;
        // System.out.println(ss == s); // This will return false because these are two
        // different objects in heap
        // System.out.println(ss = sss); // This will return true because these are just
        // refering to the same object

        // And it is not good practise to compare two strings using == operator is java
        // so solve this case we use equals() function
        // System.out.println(s.equals(ss)); // now this one will return true

        // Different ways to print in java
        // System.out.print(); // this will have no new line at the end
        // System.out.println(); // this will have a new line at the end
        System.out.printf("The value of a and b is %d and %s", a, s); // Here %d and %s are format identifiers
        // [%d for int, %s for string, %f for float, %c for char]

    }
}

/*
 * java.lang.String class is used to create string object
 * 
 * String is a class but it can also be used as a datatype
 */
