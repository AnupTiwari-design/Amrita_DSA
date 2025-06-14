 def print_list(self):
        if self.head is None:
            print("List is empty")
            return

        temp = self.head
        while True:
            print(temp.data, end=" ")
            temp = temp.next
            if temp == self.head:
                break
        print()
def is_circular(head):
    if head is None:
        return False

    temp = head.next
    while temp is not None and temp != head:
        temp = temp.next

    return temp == head