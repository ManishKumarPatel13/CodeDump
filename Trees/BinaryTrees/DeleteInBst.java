public class DeleteInBst {
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
    public static node prev;
    public static node delete(node r, int key){
        node temp;
        if(r == null){
            return r;
        }
        else if(r.data > key){
            prev = r;
            r.left = delete(r.left, key);
            return r; // return the value
        }
        else if(r.data < key){
            prev = r;
            r.right = delete(r.right, key);
            return r;
        }
        // if one child is null
        if(r.left == null){
            temp = r.right;
            return temp;
        }
        else if(r.right == null){
            temp = r.left;
            return temp;
        }
        // if both child is null
        else if(r.left == null && r.right == null){
            if(prev.data > r.data){
                prev.left = null;
                return prev;
            }
            else if(prev.data < r.data){
                prev.right = null;
                return prev;
            }
        }
        // if both child exist
        else{
            // finding the successor of the node which have to be deleted it is the leftmost child of the right subtree of node
            node succParent = r; 
            node succ = r.right;
            while(succ.left!=null){
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != r){
                succParent.left = succ.right; // if the parent successor not equals to the node we want to delete then make parent successor's left value to the successor value right
                //  because it will be greater the successor  which will be the successor value 
                                              // 
            }
            else{
                succParent.right = succ.right; // if root and successparent is same them make the right of it the next greater value
            }
            r.data = succ.data; // change the data of node to be deleted to its just greater value in tree
        }
        return r;


        }
        

    public static void main(String[] args) {
        DeleteInBst in = new DeleteInBst();
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
        delete(root, 7);
        inOrderTraversal(root);

    }
}

/*         5
          / \
         /   \
        3     7
       / \   / \
      2   4 6   8
*/