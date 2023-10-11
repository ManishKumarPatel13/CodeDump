public class InsertionInBst {
    static node root;

    public static class node {
        public int data;
        public node right;
        public node left;

        node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void inOrderTraversal(node r){
        node temp = r;
        if(temp == null){
         return;
        }
        inOrderTraversal(temp.left);
        System.out.print(temp.data + " "); // In all the traversals you just have to change the print position and the rest is same
        inOrderTraversal(temp.right);
     }

    public void initialize(int key) {
        node new_node = new node(key);
        if (root == null) {
            root = new_node;
        }
    }


    public static void insertInBst(node r, int key){
        node prev = null;
        node new_node = new node(key);
        while(r != null){
            if (r.data == key){
                return;
            }
            else if(r.data > key){
                prev = r;
                r = r.left;
            }
            else if (r.data < key){
                prev = r;
                r = r.right;
            }
        }
        if(key > prev.data){
            prev.right = new_node;
        }
        else{
            prev.left = new_node;
        }
        // inOrderTraversal(r);
        // r = beginning;
    }

    public static void main(String[] args) {
        InsertionInBst in = new InsertionInBst();
        in.initialize(5);
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
        // inOrderTraversal(root);
        // System.out.println();
        insertInBst(root, 1);
        insertInBst(root, 9);
        inOrderTraversal(root);
        // node n = insertInBst(root, 1);
        // inOrderTraversal(n);
        
        
    }
} 
