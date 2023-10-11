import java.util.Stack;

public class RLAndLR_Rotation {
    static node root;
        public static class node{
            public int data;
            public node right;
            public node left;
            public int height;
    
            node(int d){
                this.data = d;
                left = right = null;
            }  
        }
    
        public static void initialize(int key){
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
            int h = height(r.left) - height(r.right);
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

        public static int balanceFactor(node r){
            return height(r.left) - height(r.right);
        }

        public static node leftRotate(node r){
            node temp = r.right;
            r.right = temp.left;
            temp.left = r;
            return temp;
        }

        public static node rightRotate(node r){
            node temp = r.left;
            r.left = temp.right;
            temp.right = r;
            return temp;
        }

        public static node insert(node r, int key){
            // node new_node = new node(key);
            // node prev = null;
            node temp = r;
            if(r == null){
                r = new node(key);
                return r;
            }

            if(key < temp.data){
                temp.left = insert(temp.left, key);
            }

            else if(key > temp.data){
                temp.right = insert(temp.right, key);
            }

            else{
                return r;
            }

            // while(temp!=null){
             //     if (temp.data > key){
            //         prev = temp;
            //         temp = temp.left;
            //     }
            //     else if(temp.data < key){
            //         prev = temp;
            //         temp = temp.right;
            //     }
            //     else {
            //         break;
            //     }
            // }
            // temp = new_node;
            // if(key > prev.data){
            //     prev.right = temp;
            // }
            // else if(key < prev.data){
            //     prev.left = temp;
            // }

            // if(getUnstableNode(r) == null){
            //     return r;
            // }

            int bf = balanceFactor(temp );

            // left left condition
            if(bf > 1 && key < temp.left.data){
                rightRotate(temp);
            }

            // Right Right condition
            if(bf < -1 && key > temp.right.data){
                leftRotate(temp);
            }

            // Left Right condition
            if(bf > 1 && key > temp.left.right.data){
                temp.left = leftRotate(temp.left);
                rightRotate(temp); 
            }

            // Right Left condition
            if(bf < -1 && key < temp.right.left.data){
                temp.right = rightRotate(temp.right);
                leftRotate(temp);
            }

            
            return temp;
        }

        
    public static void main(String[] args) {
        // RLAndLR_Rotation l = new RLAndLR_Rotation();
            // initialize(5);
            // node s = new node(3);
            // node t = new node(7);
            // node sl = new node(2);
            // node sr = new node(4);
            // node tr = new node(8);
            // node tl = new node(6);
            // node srr = new node(9);
            // node srrr = new node(10);
            // // node sllll = new node(1);
            // // node slllll = new node(3);
    
            // root.left = s;
            // root.right = t;
            // s.left = sl;
            // s.right = sr;
            // t.left = tl;
            // t.right = tr;

            // tr.right = srr;
            // srr.right = srrr;

            // insert(root, 5);
            root = insert(root, 3);
            root = insert(root, 4);
            root = insert(root, 2);
            root = insert(root, 7);
            root = insert(root, 6);
            root = insert(root, 8);
            // System.out.println(root.data);
            inOrderT(root);
    }
}
