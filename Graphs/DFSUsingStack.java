import javax.xml.transform.Templates;

public class DFSUsingStack {
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

        public boolean isEmpty() {
            if (top == -1) {
                // System.out.println("Yes");
                return true;
            }
            // System.out.println("No");
            return false;
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

    public static void dfs(int[][] am, int i){
          stack s = new stack(am.length);
          int[] visited = new int[am.length];
          s.push(i);
        //   System.out.print(i + " ");
          while(!s.isEmpty()){
                int u = s.pop();
                for (int j = 0; j<am.length; j++){
                    if(am[u][j] == 1 && visited[j] == 0){
                        System.out.print(j + " ");
                        visited[j] = 1;
                        s.push(j);
                    }
                }
          } 
    }
    public static void main(String[] args) {
        int[][] am =  {{0, 1, 0, 1, 0, 0, 0}, {1,0,0,0,1,0,0}, {0,0,0,1,0,0,0},
         {1,0,1,0,0,0,0}, {0,1,0,0,0,1,1}, {0,0,0,0,1,0,0}, {0,0,0,0,1,0,0}};

        dfs(am, 1);
    }
}
