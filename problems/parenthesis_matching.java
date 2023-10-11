package problems;

public class parenthesis_matching {
    // stack s;

    public static class stack {
        public int top;
        public int size;
        public char[] arr;

        stack(int s) {
            this.size = s;
            this.arr = new char[s];
        }

        public void push(char key) {
            if (top == size) {
                System.out.println("Stack is full");
                return;
            }
            arr[top + 1] = key;
            top = top + 1;
        }

        public int pop() {
            int pop_value;
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            pop_value = arr[top];
            top -= 1;
            return pop_value;
        }

        public void printStack() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " <-- ");
            }
        }

        public boolean isEmpty() {
            if (top == -1) {
                // System.out.println("Yes");
                return true;
            }
            return false;
            // System.out.println("No");
        }

        public void isFull() {
            if (top == size) {
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }

        public void spaceLeft() {
            System.out.println(size - top);
        }
  
        public void getIndex(char key) {
            for (int i = 0; i <= top; i++) {
                if (arr[i] == key) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println("key not in stack");
        }

        public void peek(char key) {
            if (key > top) {
                System.out.println("sorry stack is only filled upto " + top + " for now");
                return;
            }
            // System.out.println("The value at given index is " + arr[key]);
        }
    }
    public static boolean parenthesisMatching(stack ss, String ex){
            for(int i = 0; i<ex.length(); i++){
                if(ex.charAt(i) == '{'){
                    ss.push('{');
                }
                else if(ex.charAt(i) == '}'){
                    if(ss.isEmpty()){
                        return false;
                    }
                    ss.pop();
                }
            }
            if (ss.isEmpty()){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        stack s = new stack(30);
        String exp = "8*(9)";
        System.out.println();
        if(parenthesisMatching(s, exp)){
            System.out.println("Valid format");
        }
        else{
            System.out.println("Invalid Format");
        }
        
    }
}


    

   

