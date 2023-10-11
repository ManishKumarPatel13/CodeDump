import java.util.Stack;
public class LLAndRR_Rotation {
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
    public static boolean checkForStabilityOfNode(node r){
            int h = mod(height(r.left) - height(r.right));
            if (h != 1 && h != 0){
                return false;
            }
            return true;
        }

/**
 * Returns the first unstable node in the tree rooted at r.
 * An unstable node is a node that fails the stability check.
 * If no unstable node is found, returns null.
 */
        public static node getUnstableNode(node r){
           if(root == null){
           return null;
        }
        Stack<node> stack = new Stack<node>();
        node curr = r;

        while(curr != null || stack.size() > 0){
            // traverse to the leftmost child 
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
            int lef = height(r.left);
            int righ = height(r.right);
            return Math.max(lef, righ) + 1;
    
        }

        public static void util(node r, node unbalanced){
            if (r == null || r == unbalanced){
                return;
            }
            util(r.left, unbalanced);
            util(r.right, unbalanced);
        }

        public static void inOrderT(node r){
            if(r == null){
                return;
            }
            inOrderT(r.left);
            System.out.print(r.data + " ");
            inOrderT(r.right);
        }

        public static node getParent(node r, node n){
            if(r == null || r == n){
                return null;
            }
            else{
                while (r!=null){
                    if (r.left == n || r.right == n){
                        return r;
                    }
                    else if(r.data > n.data){
                        r = r.left;
                    }
                    else if(r.data < n.data){
                        r = r.right;
                    }
                }

            }
            return r;
        }

        public static void llRotation(node r){

            // Getting the first unbalanced node in the tree
            node unbal = getUnstableNode(r); 
            node p;
            // getting the parent node of the unbalanced tree
            p = getParent(r, unbal);

            // traversing through the tree till we get to the unbalanced node
            util(r, unbal);
            
            // making the left child of unbalanced node root and unbalanced node its right
            node temp;
            temp = unbal.left; 
            unbal.left = temp.right;
            temp.right = unbal;

            // if the root node is the unbalanced node then temp will be made the new root of the tree
            if(p == null){
                root = temp;
                return;
            }

            // connecting the newly formed subtree to the parent
            p.left = temp;
        }

    //      7
    //     / \
    //    /   \
    //   5     9
    //  / \   / \
    // 3   6 8   10    
//    / \         
//   2   4         
//                  
//                   


        public static void rrRotation(node r){
            node unbal = getUnstableNode(r);
            node p;
            p = getParent(r, unbal);
            util(r, unbal);
            node temp;
            temp = unbal.right;
            unbal.right = temp.left;
            temp.left = unbal;

            if (p == null){
                root = temp;
                return;
            }
            p.right = temp;
            
        }

    public static void main(String[] args) {
            LLAndRR_Rotation l = new LLAndRR_Rotation();
            l.initialize(5);
            node s = new node(3);
            node t = new node(7);
            node sl = new node(2);
            node sr = new node(4);
            node tr = new node(8);
            node tl = new node(6);
            node srr = new node(9);
            node srrr = new node(10);
            // node sllll = new node(1);
            // node slllll = new node(3);
    
            root.left = s;
            root.right = t;
            s.left = sl;
            s.right = sr;
            t.left = tl;
            t.right = tr;

            tr.right = srr;
            srr.right = srrr;
            // inOrderT(root);
            // llRotation(root);
            rrRotation(root);
            inOrderT(root);
            rrRotation(root);
            System.out.println();
            inOrderT(root);
            


    
    }
}
