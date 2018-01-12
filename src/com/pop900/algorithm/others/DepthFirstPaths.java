package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Stack;
import com.pop900.algorithm.graphs.Graph;

/**
 * Created by michael on 16-9-5.
 */
public class DepthFirstPaths {
    public static void main(String[] args) {
//        int[] array = new int[3];
//        System.out.println("array[0] = " + array[0]);
        // path to 5 4 1


        Graph G = new Graph(6);
        G.addEdge(0, 5);
        G.addEdge(2, 4);
        G.addEdge(2, 3);
        G.addEdge(1, 2);
        G.addEdge(0, 1);
        G.addEdge(3, 4);
        G.addEdge(3, 5);
        G.addEdge(0, 2);

        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(G, 0);
        Iterable<Integer> pathTo4 = depthFirstPaths.pathTo(4);
        for (int p : pathTo4) {
            System.out.printf(p + " ");
        }
        System.out.println();
        for (int p : depthFirstPaths.pathTo(5)) {
            System.out.printf(p + " ");
        }
        System.out.println();
        for (int p : depthFirstPaths.pathTo(1)) {
            System.out.printf(p + " ");
        }
        System.out.println();






    }

    // vertex marked states
    private boolean[] marked;
    // last vertex edge
    private int[] edgeTo;
    // source
    private final int s;

    // construct
    public DepthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G, s);
    }

    // dfs
    public void dfs(Graph G, int v) {
        // marked
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    // hasPathTo
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    // path to
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            stack.push(x);
        }
        stack.push(s);
        return stack;
    }







}
