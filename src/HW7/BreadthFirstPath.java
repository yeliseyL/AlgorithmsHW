package HW7;

import java.util.LinkedList;

public class BreadthFirstPath extends PathAlgorithm {

    public BreadthFirstPath(Graph g, int source) {
        super(g, source);
    }

    @Override
    public void path(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
