import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFS {
    static class Node {
        String id;
        List<Node> edges = new ArrayList<>();
        boolean visited = false;

        // TODO representere kanter, visited

        public Node(String id) {
            this.id = id;
        }

        public void addEdge(Node edgeNode) {
            edges.add(edgeNode);
        }

        public String toString() {
            return id;
        }
    }

    public static void bfs(Node start) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(start);
        start.visited = true;

        while (!queue.isEmpty()) {
            Node current = queue.removeFirst();
            System.out.println(current.toString());

            for (Node edge : current.edges) {
                if (!edge.visited) {
                    queue.addLast(edge);
                    edge.visited = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");
        Node node7 = new Node("7");

        node0.addEdge(node1);
        node0.addEdge(node2);

        node1.addEdge(node0);
        node1.addEdge(node5);
        node1.addEdge(node6);

        node2.addEdge(node0);
        node2.addEdge(node3);
        node2.addEdge(node4);

        node3.addEdge(node2);

        node4.addEdge(node2);

        node5.addEdge(node1);
        node5.addEdge(node6);

        node6.addEdge(node1);
        node6.addEdge(node5);
        node6.addEdge(node7);

        node7.addEdge(node6);

        bfs(node0);
    }

}
