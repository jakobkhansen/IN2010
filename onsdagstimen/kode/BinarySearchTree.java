public class BinarySearchTree {
    public class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }

        public String toString() {
            return "Node with value " + value;
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

    private void insertRecursive(Node current, int value) {
        if (value >= current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                insertRecursive(current.right, value);
            }
        } else if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                insertRecursive(current.left, value);
            }
        }
    }

    public Node find(int value) {
        if (root == null) {
            return null;
        }

        return findRecursive(root, value);
    }

    private Node findRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        

        if (value > current.value) {
            return findRecursive(current.right, value);

        } else if (value < current.value) {
            return findRecursive(current.left, value);
        }

        return current;
    }



    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(3);
        tree.insert(5);
        tree.insert(4);
        tree.insert(2);


        System.out.println(tree.find(11));
    }
}
