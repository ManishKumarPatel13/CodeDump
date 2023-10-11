public class CircularLinkedList {
     node head;

     public class node{
        public int data;
        public node next = null;
        public node tail;

        node(int d){
            this.data = d;
        }

     }

     public void printList(){
        node temp = head;
        if(head != null){
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp.next.tail != head);
     }
    }

     public void push_at_last(int key){
        if(head == null){
            head.data = key;
            head.next = head;
        }
        else{
            node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            node new_node = new node(key);
            temp.next = new_node;
            new_node.next = head;

        }

     }
 
     public void push_at_beginning(int key){
        if (head == null){
            node new_node = new node(key);
            head = new_node;
        }


        else{
        node new_node = new node(key);
        // node temp = head;  
        head.tail = new_node;
        System.out.println(head.tail.data);
        new_node.next = head;
        System.out.println(new_node.next.tail.data);
        head = new_node;
        System.out.println(head.next.tail.data);
        // new_node.next = head;
        
        // new_node.tail = new_node;
        // System.out.println(head.tail.data);
        }
        // System.out.println(head.data + " " + new_node.data);
     }


     public static void main(String[] args) {
        CircularLinkedList cllist = new CircularLinkedList();
        cllist.push_at_beginning(3);
        cllist.push_at_beginning(2);
        // cllist.push_at_beginning(1);
        // cllist.push_at_beginning(0);
        // cllist.push_at_last(3);
        // cllist.push_at_last(4);
        // cllist.push_at_last(5);
        cllist.printList();
     }
}
