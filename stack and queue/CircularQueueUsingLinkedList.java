public class CircularQueueUsingLinkedList {
    public static class node{
        int data;
        node link;
        node(int d){
            this.data = d;
        }
    }

    public static class CQL{
        protected int size;
        public node head;
        public node end;
        // public node rear;

        CQL(int s){
            this.size = s; 
        }

        public void enQueue(int key){
            if (!isFull()){
                node new_node = new node(key);
                if(head == null){
                    end = new_node;
                    head = new_node;
                    // end = new_node;
                    size -= 1;
                    return;
                }
                end.link = new_node;
                end = new_node;
                end.link = head;
                
            }
        }

        public void deQueue(){
            if(!isEmpty()){
                if(head == end){
                    head = null;
                    end = null;
                    size += 1;
                    return;
                }
                head = head.link;
                end.link = head;

                size +=1;
            }
        }

        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        public boolean isFull(){
            if(size == 0){
                return true;
            }
            return false;
        }

        public void printCql(){
            node temp = head;
            while(temp.link != head){
                System.out.print(temp.data + " <-- ");
                temp = temp.link;
            }
            System.out.println(temp.data);
        }

        public void peek(){
            if(!isEmpty()){
            System.out.println(head.data);
            return;
            }
            System.out.println("Queue is Empty");
        }


    }

    public static void main(String[] args) {
        CQL cq = new CQL(30);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.deQueue();
        cq.printCql();
    }
}
