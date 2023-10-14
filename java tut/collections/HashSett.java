import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        // syntax to make a new HashSet
        HashSet<Integer> hs1 = new HashSet<>(16, 0.5f); // its initial capacity is 16 and load factor is 0.75
    }
}

/*
 * hashset is like set and set is a collection of unique items
 * load factor is the measure that decides when to increase the capacity of the
 * map default is 75% means 0.75
 */