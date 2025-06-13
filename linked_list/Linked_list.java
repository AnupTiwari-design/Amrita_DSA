package linked_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Linked_list {

    Node head;

    Linked_list() {
        head = null;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void insert_at_beg(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insert_at_pos(int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void delete_at_beg() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linked_list ob = new Linked_list();
        ob.insert_at_end(10);
        ob.insert_at_end(20);
        ob.insert_at_end(30);
        ob.insert_at_beg(7);
        ob.insert_at_beg(5);
        ob.insert_at_pos(15, 3);
        ob.printList();
        ob.delete_at_beg();
        ob.printList();
        ob.reverse();
        ob.printList();
    }
}