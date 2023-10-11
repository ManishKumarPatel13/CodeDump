public class InOrderSuccessorOfANodeInBT {
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

    // code to find inorder successor of a node in a binary tree
    public static node inOrderSucc(node r) {
        node temp = root;
        node succ = null;
        while(temp!=null){
            if(r.data > temp.data){
                temp = temp.right;
            }
            else if(temp.data > r.data){
                succ = temp;
                temp = temp.left;
            }
            else if(temp.data == r.data){ // This is for left subtree coz we will reach the given node first in left subtree
                if(r.right!=null){
                    temp = temp.right;
                }
                else{
                    return succ;
                }
            }
        }
        return succ;
    }
    

    public void initialize(int key) {

        node new_node = new node(key);
        if (root == null) {
            root = new_node;
        }
    }

    public static void main(String[] args) {
        InOrderSuccessorOfANodeInBT bt = new InOrderSuccessorOfANodeInBT();
        bt.initialize(5);
        node s = new node(3);
        node t = new node(7);
        node sl = new node(2);
        node sr = new node(4);
        node tr = new node(8);
        node tl = new node(6);
        // node trr = new node(9);
        // node sll = new node(1);
        // node sllr = new node(3);

        root.left = s;
        root.right = t;
        s.left = sl;
        s.right = sr;
        t.left = tl;
        t.right = tr;
        // tr.right = trr;
        // sl.left = sll;
        // sll.right = sllr;
        node in = inOrderSucc(tr);
        System.out.println(in.data);
    }
}
