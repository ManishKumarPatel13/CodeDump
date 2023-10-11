public class CheckBalance{
    class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} 

    public static int height(Node r){
        if (r==null){
            return 0;
        }
        return Math.max(height(r.right), height(r.left)) + 1;
    }

    public static boolean c_bal(Node r){
        if (r== null){
            return true;
        }
        if(Math.abs(height(r.right) - height(r.left))> 1){
            return false;
        }
            


        return c_bal(r.left) && c_bal(r.right);

    }

    
    public static void main(String[] args) {
        
    }
}