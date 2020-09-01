public class BinarySearchTree {
    private class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertRecursive(root, value);
        }
    }

    public void insertRecursive(Node current, int value) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                insertRecursive(current.left, value);
            }

        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                insertRecursive(current.right, value);
            }
        }
    }

    public Node find(int value) {
        if (root == null) {
            return null;
        }

        return findRecursive(root, value);
    }

    public Node findRecursive(Node current, int value) {
        if (current != null) {

            if (value == current.value) {
                return current;
            }

            if (value < current.value) {
                return findRecursive(current.left, value);
            }

            if (value > current.value) {
                return findRecursive(current.right, value);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(15);
        bst.insert(7);
        bst.insert(4);
        bst.insert(20);

        System.out.println(bst.find(40).value);
    }
}
