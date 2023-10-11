public class IsBinarySearchTree {
    public static class node{
        public int data;
        public node left;
        public node right;

        node(int d){
            this.data = d;
            left = right = null;
        }
    }

    // public static node prev;
    // public static boolean isBST(node r){
    //    if(r!=null){
    //     if(!isBST(r.left)){ // Here it is checking for the left subtree of the root node 
    //         return false;
    //     }
    //     if (prev!=null && r.data <= prev.data){
    //         return false;
    //     }

    //     prev = r;
    //     return isBST(r.right);   
    //    }
    //    return true;
    // }

    // OR

    public static boolean isBST(node r, int min, int max){ // min and max are the ranges for a node 
        // base case 
        if (r == null){
            return true;
        }

        if (r.data >= min && r.data <= max){
            boolean lef = isBST(r.left, min, r.data);
            boolean righ = isBST(r.right, r.data, max);

            if (lef == true && righ == true){
                return true;
            }
        }
        return false;
    
    }
 
    public static void main(String[] args) {
        node r = new node(5);
        node s = new node(3);
        node t = new node(7);
        node sl = new node(2);
        node sr = new node(4);
        node srr = new node(15);
        node tr = new node(8);
        node tl = new node(6);

        r.left = s;
        r.right = t;
        s.left = sl;
        sl.left = srr;
        s.right = sr;
        t.left = tl;
        t.right = tr;
        
        System.out.println(isBST(r, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
