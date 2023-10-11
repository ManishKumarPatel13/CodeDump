public class TowerOfHanoi {

    public static void TowerofHanoi(int n, char src, char dest, char helper){
        if (n==0){
            // System.out.println(0);
            return;
        }
        TowerofHanoi(n-1, src, helper, dest);
        System.out.println("Move from " + src + " to " + dest);
        // System.out.println(n);
        TowerofHanoi(n-1, helper, dest, src);
        // System.out.println("h");
    }

    public static void main(String[] args) {
        TowerofHanoi(2, 'C', 'A', 'B');    
    }
}
