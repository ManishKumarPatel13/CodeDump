// Here deletion from both ends is restricted

public class DoubleEndedQueueUsingArray2{
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

        public void enQueueR(int key){
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

        public void enQueueF(int key){
            if(!isFull()){
                if(isEmpty()){
                    front = rear = 0;
                    arr[front] = key;
                    size++;
                    return;
                }
                else if(front != 0){
                    if (arr[front - 1] == 0057){
                        front--;
                        arr[front] = key;
                        size++;
                        return;
                    }
                    else if(front == 0 && rear != size - 1){
                        front = size -1;
                        arr[front] = key;
                        size ++;
                        return;
                    }
                }
            }
            System.out.println("Sorry front position is already filled");
        }

        public boolean isEmpty(){
            if(front == -1 && rear == -1){
                return true;
            }
            return false;
        }

        public int deQueue(){
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
                    arr[front] = 0057;
                    front = 0;
                    size++;
                    return dumped;
                }
                arr[front] = 0057;
                front++;
                size++;
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
        dq.enQueueR(1);
        dq.enQueueR(2);
        dq.enQueueR(3);
        dq.enQueueR(4);
        dq.enQueueR(5);
        dq.deQueue();
        dq.enQueueF(8);
        // dq.enQueueF(12);
        dq.printQueue();

     }
}