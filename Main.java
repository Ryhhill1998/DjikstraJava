public class Main {
    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//
//        graph.addNode('A');
//        graph.addNode('B');
//        graph.addNode('C');
//        graph.addNode('D');
//        graph.addNode('E');

//        graph.addConnection('A', 'B', 5);
//        graph.addConnection('A', 'C', 1);
//        graph.addConnection('B', 'A', 5);
//        graph.addConnection('B', 'C', 2);
//        graph.addConnection('B', 'E', 1);
//        graph.addConnection('C', 'A', 1);
//        graph.addConnection('C', 'B', 2);
//        graph.addConnection('C', 'D', 1);
//        graph.addConnection('D', 'C', 1);
//        graph.addConnection('D', 'E', 3);
//        graph.addConnection('E', 'B', 1);
//        graph.addConnection('E', 'D', 3);

//        graph.addConnection('A', 'B', 1);
//        graph.addConnection('A', 'D', 3);
//        graph.addConnection('B', 'A', 1);
//        graph.addConnection('B', 'C', 2);
//        graph.addConnection('B', 'D', 1);
//        graph.addConnection('C', 'B', 2);
//        graph.addConnection('C', 'D', 2);
//        graph.addConnection('C', 'E', 1);
//        graph.addConnection('D', 'A', 3);
//        graph.addConnection('D', 'B', 1);
//        graph.addConnection('D', 'C', 2);
//        graph.addConnection('D', 'E', 3);
//        graph.addConnection('E', 'D', 3);
//        graph.addConnection('E', 'C', 1);

        Graph graph = new Graph(8);

        graph.addNode('H');
        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');
        graph.addNode('D');
        graph.addNode('E');
        graph.addNode('F');
        graph.addNode('S');

        graph.addConnection('H', 'A', 3);
        graph.addConnection('H', 'B', 2);
        graph.addConnection('H', 'C', 5);
        graph.addConnection('A', 'H', 3);
        graph.addConnection('A', 'D', 3);
        graph.addConnection('B', 'H', 2);
        graph.addConnection('B', 'D', 1);
        graph.addConnection('B', 'E', 6);
        graph.addConnection('C', 'H', 2);
        graph.addConnection('C', 'E', 2);
        graph.addConnection('D', 'A', 3);
        graph.addConnection('D', 'B', 1);
        graph.addConnection('D', 'F', 4);
        graph.addConnection('E', 'C', 2);
        graph.addConnection('E', 'B', 6);
        graph.addConnection('E', 'F', 1);
        graph.addConnection('E', 'S', 4);
        graph.addConnection('F', 'D', 4);
        graph.addConnection('F', 'E', 1);
        graph.addConnection('F', 'S', 2);
        graph.addConnection('S', 'E', 4);
        graph.addConnection('S', 'F', 2);

        graph.printGraph();
        System.out.println();

        graph.getShortestPath('H', 'S');
    }
}