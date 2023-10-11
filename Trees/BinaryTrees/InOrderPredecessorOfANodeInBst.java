public class InOrderPredecessorOfANodeInBst {
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

    // code to find inorder predecessor of a node in a binary Search tree
    public static node inOrderPre(node r) {
        node temp = root;
        node pre = null;
        while(temp!=null){
            if(r.data > temp.data){
                pre = temp;
                temp = temp.right;
            }
            else if(temp.data > r.data){
                temp = temp.left;
            }
            else if(temp.data == r.data){
                if(r.left!=null){
                    temp = temp.left;
                }
                else{
                    return pre;
                }
            }
        }
        return pre;
    }
    

    public void initialize(int key) {

        node new_node = new node(key);
        if (root == null) {
            root = new_node;
        }
    }

    public static void main(String[] args) {
        InOrderPredecessorOfANodeInBst bt = new InOrderPredecessorOfANodeInBst();
        bt.initialize(5);
        node s = new node(3);
        node t = new node(7);
        node sl = new node(2);
        node sr = new node(4);
        node tr = new node(8);
        node tl = new node(6);
        node trr = new node(9);
        // node sll = new node(1);
        // node sllr = new node(3);

        root.left = s;
        root.right = t;
        s.left = sl;
        s.right = sr;
        t.left = tl;
        t.right = tr;
        tr.right = trr;
        // sl.left = sll;
        // sll.right = sllr;
        node in = inOrderPre(root);
        System.out.println(in.data);
    }
}
