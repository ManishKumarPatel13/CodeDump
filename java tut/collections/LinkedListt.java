package collections;

import java.util.LinkedList;

public class LinkedListt extends Thread {
    public static void main(String[] args) {
        // Syntax to make a new linked list in java
        // LinkedList<data type> name = new LinkedList<>();

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(2, 4);
        l1.remove(2);
        l1.set(2, 4); // it changes the given element at given index so now we have 4 at index 2
        l1.addLast(5); // adds element at last
        l1.addFirst(0); // adds element at first
        System.out.println(l1);
        // same you can use addall method
        System.out.println(l1.size());

    }
}

/*
 * we can not access a element directly in linked list we have to traverse the
 * whole list
 * 
 * but insertion and deletion in linked list can be done in constant time
 * 
 * Arraylist Vs Linked list
 * insertion and deletion is better in linked list and accessing elements is
 * easier in arraylist
 * 
 */
