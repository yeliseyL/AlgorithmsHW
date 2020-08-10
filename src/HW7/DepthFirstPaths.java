package HW7;

import java.util.LinkedList;

public class DepthFirstPaths extends PathAlgorithm {
    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
    }

    @Override
    public void path(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                path(g, w);
            }
        }
    }
}
