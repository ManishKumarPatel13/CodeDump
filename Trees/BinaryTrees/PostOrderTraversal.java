public class PostOrderTraversal {
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

    public void postOrderTraversal(node r){
        if(r == null){
            return;
        }
        postOrderTraversal(r.left); 
        postOrderTraversal(r.right);
        System.out.print(r.data + " ");
    
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
        PostOrderTraversal bt = new PostOrderTraversal();
        bt.initialize(1);
        node s = new node(2);
        node t = new node(5);
        node sl = new node(3);
        node sr = new node(4);
        root.left = s;
        root.right = t;
        s.left = sl;
        s.right = sr;
        bt.postOrderTraversal(root);
        // System.out.println(root.right.data); 
        
    }
}
 