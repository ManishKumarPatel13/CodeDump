public class CircularQueueUsingArray {
    public static class CircularQueue{
        protected int size;
        protected int[] arr;
        public int front = -1;
        public int rear = -1;

        CircularQueue(int s){
            this.size = s;
            this.arr = new int[size];
        }

        public void enQueue(int key){
            if(!isFull()){
                if(front == -1 && rear == -1){
                    front = rear = 0;
                    arr[rear] = key;
                }
                else{
                rear ++;
                arr[rear] = key;
                }
            }
        }

        public boolean isFull(){
            if(rear == size - 1 && front == 0){
                return true;
            }
            else if(rear == size - 1 && front != 0){
                rear = 0;
                return false;
            }
            else if(rear == front - 1){
                return true;
            }
            return false;
        }

        public boolean isEmpty(){
            if (front == -1 && rear == -1){
                return true;
            }
            return false;
        }

        public void deQueue(){
            if(!isEmpty()){
                if(front == size - 1){
                    front = 0;
                    return;
                }
                front++;
                return;
            }
            if(front == rear){
                front = rear = -1;
            }
        }

        public void peek(){
            System.out.println(arr[front]);
        }

        public void printCQueue(){
            int i = front;
            while(i != rear + 1){
                if (i == size - 1){
                    i = 0;
                }
                System.out.print(arr[i] + " <-- ");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(30);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(6);
        cq.enQueue(7);
        cq.deQueue();
        cq.peek();
        cq.printCQueue();

    }
}
