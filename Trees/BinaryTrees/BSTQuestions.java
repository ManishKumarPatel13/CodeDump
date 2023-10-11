import java.util.*;

public class BSTQuestions {
    static node root;
    public static class node{
        public int data;
        public node right;
        public node left;

        node(int d){
            this.data = d;
            left = right = null;
        }

    }    
        
    public static void initialize(int key){
            node new_node = new node(key);
            if(root == null){
                root = new_node;
            }
        }
    static int i;
    public static node kSmallest(node r, int k){

        // Base case
        if (r == null){
            return null;
        }

        node lef = kSmallest(r.left, k);  // Checking if the kth smallest element is in the left subtree

        if(lef != null){  // if the left is not null it means it got the kth smallest element
            return lef; // returning the kth smallest element
        }

        i++; // incrementing the value of i because in inorder traversal the root is visited after left;
        if (i == k){ // if the value of i becomes equal to the value of k it means we have our kth smallest node
            return r;
        }

        return kSmallest(r.right, k); // if the kth element is greater then the height of left so it will search for it in the right subtree

    }

    public static void util(node r, List<Integer> l){
        if (r==null){
            return;
        }
        util(r.left, l);
        l.add(r.data);
        util(r.right, l);
    }

    public static int kSmallestele(node r, int k){
        List<Integer> l = new ArrayList<Integer>();
        util(r, l);
        return l.get(k-1);
    }


    


    public static void main(String[] args) {
        // InOrderTraversal bt = new InOrderTraversal();
        initialize(5);
        node s = new node(3);
        node t = new node(7);
        node sl = new node(2);
        node sr = new node(4);
        node tr = new node(8);
        node tl = new node(6);

        root.left = s;
        root.right = t;
        s.left = sl;
        s.right = sr;
        t.left = tl;
        t.right = tr;

        int smallest = kSmallestele(root, 3);
        System.out.println(smallest);
        // node sm = kSmallest(root, 3);
        // System.out.println(sm.data);

        // System.out.println(kSmallest(root, 0, 3));
        // System.out.println(cmll(root,3));
        // cmll(root, 3);
    }

}
