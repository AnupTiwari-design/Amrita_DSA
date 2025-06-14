class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoubleList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_at_end(self, data):
        newnode = Node(data)
        if self.head is None:
            self.head = self.tail = newnode
        else:
            self.tail.next = newnode
            newnode.prev = self.tail
            self.tail = newnode

    def insert_at_beg(self, data):
        newnode = Node(data)
        if self.head is None:
            self.head = self.tail = newnode
        else:
            newnode.next = self.head
            self.head.prev = newnode
            self.head = newnode

    def backward_traversal(self):
        if self.tail is None:
            print("List is empty")
            return
        temp = self.tail
        while temp:
            print(temp.data, end=' ')
            temp = temp.prev
        print()