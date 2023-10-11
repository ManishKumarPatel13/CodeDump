public class practise{
    static node root;
    public static class node{
        public int data;
        public node right;
        public node left;

        node(int d){
            this.data = d;
        }  
    }

    public static boolean isBST(node r){
        node prev = null;
        if (root!=null){
        if(!isBST(r.left)){ // this is for the left subtree and code will go the root node after this
            return false;
        }
        if(prev != null && r.data <= prev.data){
            return false;
        }
        prev = r;
        return isBST(r.right); // this starts to run for the right subtree
    }
    return true; // we will return true if the above conditions are true then it is a bst
    }

public static void main(String[] args){
    
    }
}