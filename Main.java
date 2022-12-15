public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');
        graph.addNode('D');
        graph.addNode('E');

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

        graph.addConnection('A', 'B', 1);
        graph.addConnection('A', 'D', 3);
        graph.addConnection('B', 'A', 1);
        graph.addConnection('B', 'C', 2);
        graph.addConnection('B', 'D', 1);
        graph.addConnection('C', 'B', 2);
        graph.addConnection('C', 'D', 2);
        graph.addConnection('C', 'E', 1);
        graph.addConnection('D', 'A', 3);
        graph.addConnection('D', 'B', 1);
        graph.addConnection('D', 'C', 2);
        graph.addConnection('D', 'E', 3);
        graph.addConnection('E', 'D', 3);
        graph.addConnection('E', 'C', 1);

        graph.printGraph();
        System.out.println();

        graph.getShortestPath('A');
    }
}