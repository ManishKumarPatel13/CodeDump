public class StackUsingLinkedList {
    public static class node{
        public int data;
        public node next;

        node(int d){
            this.data = d;
        }
    }

    public static class StackL{
        public node head;
        private int size = 30;

        public void push(int key){
            if (size == 0){
                System.out.println("Stack is full");
                return;
            }
            node new_node = new node(key);
            if(head == null){
                head = new_node;
                size -= 1;
                return;
            }
            size -= 1;
            new_node.next = head;
            head = new_node;
        }

        public int pop(){
            int pop_value;
            if(head.next == null){
                pop_value = head.data;
                head = null;
                return pop_value;
            }
            else if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            pop_value = head.data;
            head = head.next;
            return pop_value;
        }

        public void printStack(){
            if(head == null){
                System.out.println("Stack is empty");
                return;
            }
            while(head != null){
                System.out.print(head.data + " --> ");
                head = head.next;
            }
        }



        public void peek(int key){
            node temp = head;
            while(key > 0 && temp != null){
                temp = temp.next;
                key -= 1;
            }
            if (temp == null){
                System.out.println("Sorry Stack is not that much filled");
                return;
            }
            System.out.println(temp.data);
        }

        public int stackTop(){
            if (head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public void isEmpty(){
            if(size == 30){
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }

        public void isFull(){
            if(size == 0){
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }

        public int stackBottom(){
            node temp = head;
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            while(temp.next != null){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        StackL s = new StackL();
        s.push(6);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.peek(3);
        s.pop();

        s.printStack();
    }    
}
