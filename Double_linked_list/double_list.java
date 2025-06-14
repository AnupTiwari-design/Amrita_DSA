package Double_linked_list;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class double_list {

    Node head, tail;

    double_list() {
        head = tail = null;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    void backward_traversal() {
        if (tail == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insert_at_beg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    void delete_at_beg() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
}
void delete_at_end() {
    if (tail == null) {
        System.out.println("List is empty");
        return;
    }

    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
}

    public static void main(String[] args) {
        double_list ob = new double_list();
        ob.insert_at_beg(10);
        ob.insert_at_beg(20);
        ob.backward_traversal(); // Output: 10 20
        ob.insert_at_end(1);
        ob.insert_at_end(4);
        ob.backward_traversal(); // Output: 4 1 10 20
    }
}