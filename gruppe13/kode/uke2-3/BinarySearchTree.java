public class BinarySearchTree {
    public class Node {
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
        return findRecursive(root, value);
    }

    public Node findRecursive(Node current, int value) {
        if (current != null) {
            if (current.value == value) {
                return current;
            } else if (value < current.value) {
                return findRecursive(current.left, value);
            } else {
                return findRecursive(current.right, value);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        tree.insert(6);
        tree.insert(3);
        tree.insert(5);

        System.out.println(tree.find(30).value);
    }
}
