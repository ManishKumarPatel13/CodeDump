import java.lang.Math;
public class HeightAndDiameterOfBT {
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

    public void initialize(int key){
        node new_node = new node(key);
        if(root == null){
            root = new_node;
        }
    }

    public static int Diameter(node r){
        if((r == null)){
            return 0;
        }
        
                
        int lefth = height(r.left);
        int righth = height(r.right);
        int currentd =  (lefth+righth) + 1;

        int leftD =  Diameter(r.left);
        int rightD = Diameter(r.right);

        return Math.max(currentd,Math.max(leftD , rightD));
    }

//      5
//     / \
//    /   \
//   3     7
//  / \   / \
// 2   4 6   8
  

    public static int height(node r){
        if (r == null){ 
            return 0;
        }
        // h = 0;
        int lef = height(r.left);
        int righ = height(r.right);
        return Math.max(lef, righ) + 1;

    }
    public static void main(String[] args) {
        HeightAndDiameterOfBT hd = new HeightAndDiameterOfBT();
        hd.initialize(5);
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


        int d = Diameter(root);
        System.out.println(d);
        // int h = height(root);
        // System.out.println(h);
    }
}
