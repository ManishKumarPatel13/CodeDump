import java.util.Stack;

public class CheckForStability {
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

        public static int mod(int i){
            if (i< 0){
                return -1*i;
            }
            return i;
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

        public static boolean checkForStabilityOfNode(node r){
            int h = mod(height(r.left) - height(r.right));
            if (h != 1 && h != 0){
                return false;
            }
            return true;
        }

        // public static node getUnstableNode(node r){
        //     int h = mod(height(r.left) - height(r.right));
        //     if (h != 1 && h != 0){
        //         return r;
        // }   
    // }

        public static node checkForStabilityOfTree(node r){
           if(root == null){
           return null;
        }
        Stack<node> stack = new Stack<node>();
        node curr = r;

        while(curr != null || stack.size() > 0){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(!checkForStabilityOfNode(curr)){
                return curr;
            }
            curr = curr.right;

        }
        return null;
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
            CheckForStability hd = new CheckForStability();
            hd.initialize(5);
            node s = new node(3);
            node t = new node(7);
            node sl = new node(2);
            node sr = new node(4);
            node tr = new node(8);
            node tl = new node(6);
            node sll = new node(9);
            // node slll = new node(10);
            // node sllll = new node(1);
            // node slllll = new node(3);
    
            root.left = s;
            root.right = t;
            s.left = sl;
            s.right = sr;
            t.left = tl;
            t.right = tr;
            
            sl.left = sll;
            // sll.left = slll;
            // slll.left = sllll;
            // sllll.left = slllll;
    
    
            // int d = Diameter(root);
            // System.out.println(d);
            // int h = height(root);
            // System.out.println(h);
            System.out.println(checkForStabilityOfTree(root).data);
            
        }

    
}