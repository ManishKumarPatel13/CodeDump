// This one is insertion rejected one

public class DoubleEndedQueueUsingArray {

    public static class DEQueue{
        public int rear = -1;
        public int front = -1;
        public int size;
        public int[] arr;

        DEQueue(int s){
            this.size = s;
            this.arr = new int[size];
        }
        
        public boolean isFull(){
            if (rear == size - 1 && front == 0){
                return true;
            }
            else if(rear == size - 1 && front != 0){
                rear = 0;
                return false;
            }
            else if (rear == front -1){
                return true;
            }
            return false;
        }

        public void enQueue(int key){
            if(!isFull()){
                if(isEmpty()){
                    front = rear = 0;
                    arr[rear] = key;
                    size -= 1;
                    return;
                }
                rear++;
                arr[rear] = key;
                size -= 1;
            }
        }

        public boolean isEmpty(){
            if(front == -1 && rear == -1){
                return true;
            }
            return false;
        }

        public int deQueueF(){
            int dumped;
            if(!isEmpty()){
                if(front == rear){
                    dumped = arr[front];
                    front = rear = -1;
                    size++;
                    return dumped;
                }
                else if(front == size - 1){
                    dumped = arr[front];
                    front = 0;
                    size++;
                    return dumped;
                }
                front++;
                size++;
            }
            return -1;
        }

        public int deQueueR(){
            int dumped;
            if(!isEmpty()){
                if(front == rear){
                    dumped = arr[front];
                    front = rear = -1;
                    size++;
                    return dumped;
                }
                else if(rear == 0 && front > 0){
                    dumped = arr[rear];
                    rear = size -1;
                    size ++;
                    return dumped;
                }
                dumped = arr[rear];
                rear--;
                size++;
                return dumped;
            }
            return -1;
        }

        public void printQueue(){
            int i = front;
            while(i != rear + 1){
                if (i == size -1){
                    System.out.print(arr[i] + " <-- ");
                    i = 0;
                }
                System.out.print(arr[i] + " <-- ");
                i++;
            }
        }
    }
     public static void main(String[] args) {
        DEQueue dq = new DEQueue(30);
        dq.enQueue(1);
        dq.enQueue(2);
        dq.enQueue(3);
        dq.enQueue(4);
        dq.enQueue(5);
        dq.deQueueR();
        dq.printQueue();

     }
}
