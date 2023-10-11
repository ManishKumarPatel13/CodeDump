import java.util.*;

public class HashmapinJava {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("Maths", 89);
        map.put("oops", 89);
        map.put("DSA", 89);
        map.put("communication", 89);
        map.put("Maths", 89);
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()); 
        }
    }
}

