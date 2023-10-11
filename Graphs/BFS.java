public class BFS {
    public static class queue {
        public int size;
        public int[] arr = new int[size];
        public int insert = -1;
        public int delete = -1;

        queue(int s) {
            this.size = s;
            this.arr = new int[size];
        }
        public void enqueue(int key) {
            if (!isFull()) {
                if (insert == -1) {
                    delete += 1;
                    insert += 1;
                    arr[insert] = key;
                    // System.out.println(arr[insert]);  
                    return;
                }
                insert++;
                arr[insert] = key;
            }

        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            else if(delete == insert){
                insert = delete = -1;
                return arr[0];
            }
            // arr[delete] = 0000;
            delete += 1;
            return arr[delete - 1];
        }

        public boolean isEmpty() {
            if (insert == -1 && delete == -1) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if(insert == size - 1){
                return true;
            }
            return false;
        
        }

        public void printQueue() {
            if (!isEmpty()) {
                int i = delete;
                while(i != insert + 1) {
                    System.out.print(arr[i] + " <-- "); 
                    if(i == size){
                        i = 0;
                    }
                    i++;
                }
            }
        }
    } 

    // BFS Implementation
    public static void bfs(int[][] a, int i){
        int u;
        int[] visited = new int[a.length];
        queue q = new queue(a.length + 1);
        
        System.out.print(i + " ");
        visited[i] = 1;
        q.enqueue(i);

        while(!q.isEmpty()){
            u = q.dequeue();
            for (int j = 0; j < a.length; j++){
                if(a[u][j] == 1 && visited[j] == 0){ // Checking if the node is connected and is already visited or not 
                    System.out.print(j + " ");
                    visited[j] = 1; // Adding the node in the visited list
                    q.enqueue(j); // adding the node in the exploration queue
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] am =  {{0, 1, 0, 1, 0, 0, 0}, {1,0,0,0,1,0,0}, {0,0,0,1,0,0,0},
         {1,0,1,0,0,0,0}, {0,1,0,0,0,1,1}, {0,0,0,0,1,0,0}, {0,0,0,0,1,0,0}};

        bfs(am, 0);
    }
}
