public class StringBuffer_tut {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.insert(5, "Java");
        sb.replace(5, 6, " J");
        // sb.reverse(); // reverses char wise
        String message = sb.toString();
        System.out.println(message);
    }
}


/* String Buffers are Mutable not like the String class objects which are immutable */
