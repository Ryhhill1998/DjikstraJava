import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {

    ArrayList<Node> nodeList;
    int[][] adjacencyMatrix;

    public Graph(int numberOfNodes) {
        nodeList = new ArrayList<>();
        adjacencyMatrix = new int[numberOfNodes][numberOfNodes];
    }

    public void addNode(char letter) {
        Node nodeToAdd = new Node(letter);
        nodeList.add(nodeToAdd);
    }

    public void addConnection(char letter1, char letter2, int cost) {
        Node node1 = findNode(letter1);
        Node node2 = findNode(letter2);

        int row = convertLetterToIndex(letter1);
        int col = convertLetterToIndex(letter2);
        adjacencyMatrix[row][col] = cost;
    }

    private Node findNode(char letter) {
        Node foundNode = null;

        for (int i = 0; i < nodeList.size(); i++) {
            Node n = nodeList.get(i);

            if (n.getLetter() == letter) {
                foundNode = n;
                break;
            }
        }

        return foundNode;
    }

    private int convertLetterToIndex(char letter) {
        return letter - 'A';
    }

    private char convertIndexToLetter(int index) {
        return (char) (index + 'A');
    }

    private void printColumnLetters() {
        System.out.print("  ");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            char rowLetter = (char) (i + 'A');
            System.out.print(rowLetter + " ");
        }
        System.out.println();
    }

    public void printGraph() {
        printColumnLetters();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            char rowLetter = (char) (i + 'A');
            System.out.print(rowLetter + " ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void getShortestPath(char startLetter) {
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        Node startNode = findNode(startLetter);
        startNode.setTotalCost(0);
        nodes.offer(startNode);

        while (!nodes.isEmpty()) {
            Node nodeBeingExpanded = nodes.poll();

            int rowIndex = convertLetterToIndex(nodeBeingExpanded.getLetter());
            int[] row = adjacencyMatrix[rowIndex];

            for (int i = 0; i < row.length; i++) {
                if (row[i] == 0) {
                    continue;
                }

                char currentLetter = convertIndexToLetter(i);
                Node currentNode = findNode(currentLetter);

                if (currentNode.isVisited()) {
                    continue;
                }

                int cost = nodeBeingExpanded.getTotalCost() + row[i];

                if (cost < currentNode.getTotalCost()) {
                    currentNode.setPreviousLetter(nodeBeingExpanded.getLetter());
                    currentNode.setTotalCost(cost);
                }

                if (!nodes.contains(currentNode)) {
                    nodes.offer(currentNode);
                }
            }

            nodeBeingExpanded.setVisited(true);
        }

        printNodeList();
    }

    public void printNodeList() {
        for (Node n : nodeList) {
            System.out.println(n);
        }
    }
}
