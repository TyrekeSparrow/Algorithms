package com.michael.algorithm.graphs;

import com.michael.algorithm.fundamenal.Stack;

/**
 * Created by michael on 16-8-11.
 */
public class DepthFirstPaths {
    // test
    // get path to 5
    public static void main(String[] args) {
        // 0 5
        // 2 4
        // 2 3
        // 1 2
        // 0 1
        // 3 4
        // 3 5
        // 0 2
        Graph G = new Graph(6);
        G.addEdge(0, 5);
        G.addEdge(2, 4);
        G.addEdge(2, 3);
        G.addEdge(1, 2);
        G.addEdge(0, 1);
        G.addEdge(3, 4);
        G.addEdge(3, 5);
        G.addEdge(0, 2);
//        G.showAll();

        DepthFirstPaths dfp = new DepthFirstPaths(G, 0);
        Iterable<Integer> path = dfp.pathTo(5);
        for (int v: path) {
            System.out.printf(v + " ");
            
        }

    }



    // source
    // marked vertex
    // last vertex to this vertex
    private final int s;
    private boolean[] marked;
    private int[] edgeTo;



    // construct
    // dfs
    // hasPathTo
    // pathTo
    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        // dfs
        dfs(G, s);
    }

    public void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int i = v; i != s; i = edgeTo[i]) path.push(i);
        path.push(s);
        return path;
    }


























}
