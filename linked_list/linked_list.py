 # Define a Node class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Define LinkedList class
class LinkedList:
    def __init__(self):
        self.head = None

    # Insert at end
    def insert_at_end(self, data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = newnode

    # Print the list (optional helper method)
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

# Usage
ll = LinkedList()
ll.insert_at_end(10)
ll.insert_at_end(20)
ll.insert_at_end(30)
ll.display()