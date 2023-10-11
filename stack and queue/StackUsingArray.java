public class StackUsingArray {
    stack s;

    public static class stack {
        public int top;
        public int size;
        public int[] arr;

        stack(int s) {
            this.size = s;
            this.arr = new int[s];
        }

        public void push(int key) {
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

        public void isEmpty() {
            if (top == -1) {
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
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
  
        public void getIndex(int key) {
            for (int i = 0; i <= top; i++) {
                if (arr[i] == key) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println("key not in stack");
        }

        public void peek(int key) {
            if (key > top) {
                System.out.println("sorry stack is only filled upto " + top + " for now");
                return;
            }
            System.out.println("The value at given index is " + arr[key]);
        }
    }

    public static void main(String[] args) {
        stack s = new stack(30);
        s.top = -1;
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        s.getIndex(2);
        s.isEmpty();
        s.isFull();

        s.printStack();
    }
}