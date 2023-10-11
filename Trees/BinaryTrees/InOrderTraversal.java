public class InOrderTraversal {
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

    // public int getTreeHieght(){
         
    // }

    public void inOrderTraversal(node r){
       if(r == null){
        return;
       }
       inOrderTraversal(r.left);
       System.out.print(r.data + " "); // In all the traversals you just have to change the print position and the rest is same
       inOrderTraversal(r.right);
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

/*
 *         5
          / \
         /   \
        3     7
       / \   / \
      2   4 6   8

suppose this is our binary tree so the function first runs for the left subtree like the first current node will be 2 and prev node will be null
then 2 > null so now on second call the current node will be 3 because inorder goes like left root right so then the condition 3 > 2 so it will be ok
then current will be 4 prev 3 so same condition then current will be 5 prev will 3 so works then it will come to the right sub tree of root 
where current will go to 6 nd its prev will be 5 then current will 7 prev 6 then current will be 8 prev 7 then like this whole binary tree would be traversed and we have got that it is
a binary tree 
 * 
 */


    public static void main(String[] args) {
        InOrderTraversal bt = new InOrderTraversal();
        bt.initialize(5);
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
        // System.out.println(root.right.data); 
        bt.inOrderTraversal(root);
    }
}
