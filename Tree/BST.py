class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BST:
    def insert(self, root, data):
        if root is None:
            return TreeNode(data)
        if data < root.data:
            root.left = self.insert(root.left, data)
        elif data > root.data:
            root.right = self.insert(root.right, data)
        return root

    def search(self, root, key):
        if root is None:
            return False
        if root.data == key:
            return True
        if key < root.data:
            return self.search(root.left, key)
        return self.search(root.right, key)

    def get_min(self, node):
        while node.left is not None:
            node = node.left
        return node

    def delete(self, root, key):
        if root is None:
            return None
        if key < root.data:
            root.left = self.delete(root.left, key)
        elif key > root.data:
            root.right = self.delete(root.right, key)
        else:
            if root.left is None and root.right is None:
                return None
            elif root.left is None:
                return root.right
            elif root.right is None:
                return root.left
            else:
                min_node = self.get_min(root.right)
                root.data = min_node.data
                root.right = self.delete(root.right, min_node.data)
        return root

    def inorder(self, root):
        if root:
            self.inorder(root.left)
            print(root.data, end=" ")
            self.inorder(root.right)

# Example usage
if __name__ == "__main__":
    bst = BST()
    root = None
    values = [50, 30, 70, 20, 40, 60, 80]
    for val in values:
        root = bst.insert(root, val)

    print("Inorder before deletion:")
    bst.inorder(root)

    root = bst.delete(root, 70)

    print("\nInorder after deleting 70:")
    bst.inorder(root)