package HW7;

import java.util.LinkedList;

public abstract class PathAlgorithm {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;


    public PathAlgorithm(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];

        path(g, source);
    }

    public abstract void path(Graph g, int source);

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
