public class QueueUsingArray {
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
                System.out.println(arr[insert]);
            }

        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            else if(delete == insert){
                insert = delete = -1;
                return;
            }
            // arr[delete] = 0000;
            delete += 1;
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

    public static void main(String[] args) {
        queue q = new queue(30);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        // q.enqueue(5);
        q.dequeue();
        q.dequeue();
        q.printQueue();
    }

}
