public class ReverseKNodesInLL {
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

    public int getLLlength(){
        int l = 0;
        node temp = head;
        if (head == null){
            return l;
        }
        while(temp != null){
            l += 1;
            temp = temp.next;
        }
        return l;
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

    public node ReverseKNodesLL(node h, int key) {
        node current = h;
        node nextptr = null;
        node prevptr = null;
        int count = 0;
        while (current.next != null && count < key) { 
            nextptr = current.next;
            current.next = prevptr;
            prevptr = current;  
            current = nextptr;
            key++;
        }
        if(nextptr != null){
            h.next = ReverseKNodesLL(nextptr, key);
        }
        return prevptr;
        }

    public void printList() {
        node temp = head;
        // if (temp == null) {
        //     return;
        // }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ReverseKNodesInLL ll = new ReverseKNodesInLL();
        ll.push_start(6);
        ll.push_start(5);
        ll.push_start(4);
        ll.push_start(3);
        ll.push_start(2);
        ll.push_start(1);
        ll.printList();
        System.out.println();
        ll.head = ll.ReverseKNodesLL(ll.head, 2);
        ll.printList();
    }
}