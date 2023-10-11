public class LinkedList {
    node head;

    public class node {
        public int data;
        public node next = null;

        // public node prev = null;
        node(int value) {
            data = value;
        }
    }

    public void insert_at_beginning(int value) {
        node new_node = new node(value);
        new_node.next = head;
        head = new_node;
    }

    public void insert_at_index(int index, int value) {
        node beginning_node = head;
        while (index >= 2) {
            head = head.next;
            index = index - 1;
        }
        node new_node = new node(value);
        node temp_node = head.next;
        head.next = new_node;
        new_node.next = temp_node;
        head = beginning_node;
    }

    public void insert_after_value(int node_data, int value) {
        if (head == null) {
            head = new node(value);
        }
        while (head.data != node_data) {
            head = head.next;
        }
        node new_node = new node(value);
        node temp_node = head.next;
        head.next = new_node;
        new_node.next = temp_node;

    }

    public void insert_at_end(int value) {
        node beginning_node = head;
        while (head.next != null) {
            head = head.next;
        }
        node new_node = new node(value);
        head.next = new_node;
        head = beginning_node;
    }

    public void delete(int value) {
        node temp = head, prev = null;

        if (temp != null && temp.data == value) {
            head = temp.next;
            return;
        }
        while (temp.data != value && temp != null) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        prev.next = temp.next;

    }

    public void printList() {
        node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " --> ");
            tnode = tnode.next;
        }
    }

    public void delete_from_end() {
        node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    public int getlength() {
        int count = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            count += 1;
        }
        return count;
    }

    public void sortLL() {
        // Implement this method
        node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
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

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insert_at_beginning(5);
        llist.insert_at_beginning(4);
        llist.insert_at_beginning(3);
        llist.insert_at_beginning(1);
        llist.insert_after_value(1, 2);
        llist.insert_at_index(5, 6);
        llist.insert_at_end(7);
        try {
            llist.delete(0);
        } catch (Exception e) {
            System.out.println("key not in linked list");
        }
        int c = llist.getlength();
        System.out.println(c);

        // llist before sorting
        llist.printList();

        System.out.println();
        // llist after sorting
        llist.sortLL();
        llist.delete_from_end();
        c = llist.getlength();
        System.out.println(c);
        llist.printList();

    }
}
