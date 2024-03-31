import java.util.*;

class myGeneric<T1>{
    int val = 433;
    private T1 t1;

    public myGeneric(int val, T1 t1){
        this.val = val;
        this.t1= t1;
    }
}

public class Genericss {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>(); // - this Integer is generic
        // arraylist.add("str1");
        arraylist.add(34);
        arraylist.add(54);
        int a = arraylist.get(1);

    }
}

//  it is like template in c++
