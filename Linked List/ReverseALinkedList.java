public class ReverseALinkedList {
    node head;

    public class node {
        public int data;
        public node next;
        public node prev;

        node(int d) {
            this.data = d;
        }
    }

    public void push_start(int key) {
        node new_node = new node(key);
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
            // System.out.println(head.prev.data);
        }
    }

    public void push_end(int key) {
        node new_node = new node(key);
        node temp = head;
        if (head == null) {
            head = new_node;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }

    public void push_behind_node(int value, int key) {
        node new_node = new node(key);
        node temp = head;
        if (head.data == value) {
            push_start(key);
            return;
        }
        while (temp.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) { // if node not present in dll
            return;
        }
        temp.prev.next = new_node;
        new_node.prev = temp.prev;
        new_node.next = temp;
        temp.prev = new_node;

        System.out.println(temp.data);

    }

    public void sortDLL() {
        if (head == null || head.next == null) {
            return;
        } else {
            node current = head, index = null;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        int temp;
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void delete(int value) {
        node temp = head;
        if (head.data == value) {
            head = head.next;
            head.prev = null;
        } else {
            while (temp.data != value) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void ReverseLL() {
        node current = head;
        node temp;
        while (current.next != null) { 
            if (current == head) { // we have to write differently for head because if we try to access next it will raise null value error
                temp = current.next;
                current.next = null;
                current.prev = temp;
                current = temp;
            }
            temp = current.next; // storing the next nodes value
            current.next = current.prev; // changing the value of next of the current node to its prev node
            current.prev = temp; // Now making the prev node equal to the former next node
            current = temp; // increasing current
        }
        current.next = current.prev; // the next value of a node last node is null but we are making it equal to the its prev node 
        current.prev = null; // making the previous value of last node to null
        head = current; // making last node the head node;
    }

    public void printList() {
        node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        ReverseALinkedList llist = new ReverseALinkedList();
        // llist.push_start(6);
        // llist.push_start(5);
        llist.push_start(4);
        llist.push_start(3);
        llist.push_start(2);
        llist.push_start(1);
        llist.printList();
        System.out.println();
        llist.ReverseLL();
        llist.printList();

    }
}