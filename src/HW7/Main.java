package HW7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,5);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,9);
        graph.addEdge(5,6);
        graph.addEdge(6,7);
        graph.addEdge(6,8);
        graph.addEdge(8,9);

        PathAlgorithm bfp = new BreadthFirstPath(graph, 3);
        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));
        System.out.printf("Shortest path length: %d", bfp.pathTo(9).size());

    }
}
