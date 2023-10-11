public class DoublyLinkedList {
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

    public void printList() {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push_start(3);
        dll.push_start(2);
        dll.push_start(1);
        dll.push_end(4);
        dll.push_end(5);
        dll.push_end(6);
        dll.push_end(7);
        dll.delete(5);

        // dll.sortDLL();

        dll.printList();
    }
}