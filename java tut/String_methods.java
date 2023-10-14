public class String_methods {
    public static void main(String[] args) {
        String s = "Hey, My name is manish!!";
        String ss = "hey, My name is manish!!";

        // STRING METHODS

        // to get length of string
        System.out.println(s.length()); // This will give the length of string

        System.out.println(s.toLowerCase() + "W"); // This will convert the whole string to lowercase same we can use
        // uppercase

        System.out.println(s.trim() + "W"); // tHIS will remove all leading or trailing spaces

        System.out.println(s.substring(5)); // This will print the string from index 5 onwards

        System.out.println(s.substring(5, 7)); // This will print the char between 5 and 7 index

        // This will replace the manish in the string to vicky
        System.out.println(s.replace("manish", "vicky"));

        System.out.println(s.startsWith("Hey,", 0)); // This will return true if the word is same as in the string
                                                     // before a backspace

        System.out.println(s.charAt(1)); // This will give the char at given index position

        System.out.println(s.indexOf('a', 10)); // This will give the index of a after 10th index of the string

        System.out.println(s.lastIndexOf('S', 0)); // This will give the last index of the char in the string

        System.out.println(s.equals(ss)); // This will return false because the first h is uppercase in s and lowercase
                                          // in ss
        System.out.println(s.equalsIgnoreCase(ss)); // This will return true because it just checks the characters not
                                                    // thier case

        // ESCAPE SEQUENCE CHARACTERS
        /*
         * /n for newline, /t for tab, /
         */

    }
}
