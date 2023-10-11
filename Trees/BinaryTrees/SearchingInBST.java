public class SearchingInBST {
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

    public void initialize(int key) {
        node new_node = new node(key);
        if (root == null) {
            root = new_node;
        }
    }

    // public static void bstSearch(node r, int key){ 
    //         if(r.data == key){
    //             System.out.println(r.data);
    //             return;
    //         }   
    //         else if(r.data > key){
    //             bstSearch(r.left, key);
    //         }
    //         else if(r.data < key){
    //             bstSearch(r.right, key);
    //         }
    //         else if(r.left == null && r.right == null){
    //             return;
    //         }
    //     }

    // Iterative method
    public static node bstSearch(node r, int key){
        if(r != null){
            while(r != null){
                if(r.data == key){
                    return r;
                }
                else if(r.data < key){
                    r = r.right;
                }
                else if(r.data > key){
                    r = r.left;
                }
            }
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
        SearchingInBST sbst = new SearchingInBST();
        sbst.initialize(5);
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

        node searched = bstSearch(root,8);
        System.out.println(searched.data);
    }
}
