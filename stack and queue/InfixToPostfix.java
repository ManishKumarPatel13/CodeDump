public class InfixToPostfix {
    public static class node {
        public char data;
        public node next;

        node(char d) {
            this.data = d;
        }
    }

    public static class StackL {
        public node head;
        private int size = 30;

        public void push(char key) {
            if (size == 0) {
                System.out.println("Stack is full");
                return;
            }
            node new_node = new node(key);
            if (head == null) {
                head = new_node;
                size -= 1;
                return;
            }
            size -= 1;
            new_node.next = head;
            head = new_node;
        }

        public char pop() {
            char pop_value;
            if (head.next == null) {
                pop_value = head.data;
                head = null;
                return pop_value;
            } else if (head == null) {
                // System.out.println("Stack is empty");
                return '~';
            }
            size += 1;
            pop_value = head.data;
            head = head.next;
            return pop_value;
        }

        public void printStack() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }
            while (head != null) {
                System.out.print(head.data + " --> ");
                head = head.next;
            }
        }

        public void peek(char key) {
            node temp = head;
            while (key > 0 && temp != null) {
                temp = temp.next;
                key -= 1;
            }
            if (temp == null) {
                System.out.println("Sorry Stack is not that much filled");
                return;
            }
            System.out.println(temp.data);
        }

        public char stackTop() {
            if (head == null) {
                // System.out.println("Stack is empty");
                return '~';
            }
            return head.data;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (size == 0) {
                return true;
            }
            return false;
            
        }

        public int stackBottom() {
            node temp = head;
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.data;
        }
    }


    public static int precedence(char p){
        if(p == '*' || p == '/'){
            return 3;
        }
        else if(p == '+' || p == '-'){
            return 2;
        }
        return 0;
    }

    public static boolean isOperator(char o){
        if(o == '+' || o== '-' || o =='*' || o =='/'){
            return true;
        }
        return false;
    }


    public static String infix_To_Postfix(StackL s, String expression){
        String postfix = "";
        int i = 0;
        // int j = 0;
        while(i < expression.length()){
            if(!isOperator(expression.charAt(i))){
                postfix += expression.charAt(i);
                i++;
            }
            else{
                if(s.isEmpty()){
                    s.push(expression.charAt(i));
                    // System.out.println(expression.charAt(i));
                    // System.out.println(s.stackTop());
                    i++;
                }
                else if (precedence(expression.charAt(i)) > precedence(s.stackTop())){
                    s.push(expression.charAt(i));
                    i++;
                }

                else{
                    // System.out.println(s.pop());
                    postfix+= s.pop();
                }
            }

        }
        while(!s.isEmpty()){
            postfix += s.pop();
        }
        // s.printStack();
        return postfix;
    }

    public static void main(String[] args) {
        StackL ss = new StackL();
        String exp = "a*b+c*d";
        String po = infix_To_Postfix(ss, exp);
        System.out.println("Postfix Expression: " + po);
    }
}