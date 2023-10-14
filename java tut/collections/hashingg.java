public class hashingg {

}

/*
 * hashing is a technique to change range of key values to range of indices
 * 
 * it uses a hash function to give indices to a given value
 * 
 * like f(x) = x%10
 * for element 43 its index will be 43%10 = 3 will be its index but if we also
 * have 53 then its index will also be 3
 * and this is called collision in hashing
 * to solve this problem we use chaining or open addressing
 * 
 * open addressing - leaving empty spaces in the list to fill the elements if
 * they collide then the next element is stored to the next open space
 * 
 * chaining - it creates a linked list of elements in the index where they where
 * colliding and points to the elements
 * 
 * collection of hashing classes used in java
 * 1. HashSet
 * 2. HashMap
 * 3. HashTable
 * 4. LinkedHashMap
 */
