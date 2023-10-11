public class LinkedRepresentationofBT {
    static node root;
    public static class node{
        public int data;
        public node right;
        public node left;

        node(int d){
            this.data = d;
        }  
    }

    // public int getTreeHieght(){
         
    // }

    public void preOrderTraversal(node r){
        if(r!=null){
        System.out.print(r.data + " --> ");
        preOrderTraversal(r.left); // it will call this function recursively till it reaches a null left leaf ;
        preOrderTraversal(r.right); // as soon as it gets a left leaf it will go the last parent node and start with right subtree of the parent
    }
    }

 /*
            1
           / \
          2   5
         / \
        3   4
 */   

    public void initialize(int key){
            node new_node = new node(key);
            if(root == null){
                root = new_node;
            }
        }
    public static void main(String[] args) {
        LinkedRepresentationofBT bt = new LinkedRepresentationofBT();
        bt.initialize(1);
        node s = new node(2);
        node t = new node(5);
        node sl = new node(3);
        node sr = new node(4);
        root.left = s;
        root.right = t;
        s.left = sl;
        s.right = sr;
        // System.out.println(root.right.data); 
        bt.preOrderTraversal(root);
    }
}
