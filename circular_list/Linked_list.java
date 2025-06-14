package circular_list;

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

    // Insert at end
    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }

    // Print the circular linked list
    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Linked_list cl = new Linked_list();
        cl.insert_at_end(10);
        cl.insert_at_end(20);
        cl.insert_at_end(30);
        cl.printList();  // Output: 10 20 30
    }
}