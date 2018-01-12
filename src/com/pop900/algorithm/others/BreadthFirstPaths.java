package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Queue;
import com.pop900.algorithm.fundamenal.Stack;
import com.pop900.algorithm.graphs.Graph;

/**
 * Created by michael on 16-9-6.
 */
public class BreadthFirstPaths {

    public static void main(String[] args) {

//        Graph G = new Graph(6);
//        G.addEdge(0, 5);
//        G.addEdge(2, 4);
//        G.addEdge(2, 3);
//        G.addEdge(1, 2);
//        G.addEdge(0, 1);
//        G.addEdge(3, 4);
//        G.addEdge(3, 5);
//        G.addEdge(0, 2);

        Graph G = new Graph(6);
        G.addEdge(0, 5);
        G.addEdge(2, 4);
        G.addEdge(2, 3);
        G.addEdge(1, 2);
        G.addEdge(0, 1);
        G.addEdge(3, 4);
        G.addEdge(3, 5);
        G.addEdge(0, 2);

        System.out.println(G.V());
        // pathTo 3: 0 2 3
        // pathTo 4: 0 2 4
        BreadthFirstPaths bfp = new BreadthFirstPaths(G, 0);
        Iterable<Integer> pathTo3 = bfp.pathTo(3);
        System.out.println("print pathTo3");
        for (int p : pathTo3) {
            System.out.printf(p + " ");
        }
        System.out.println();
        Iterable<Integer> pathTo4 = bfp.pathTo(4);
        for (int p : pathTo4) {
            System.out.printf(p + " ");
        }
        System.out.println();









    }

    private final int s;
    private boolean[] marked;
    private int[] edgeTo;

    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    public void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(s);
        marked[s] = true;
        // dequeue each
        // enqueue subtree
        // for each marked and edgeTo
        while (!queue.isEmpty()) {
            int x = queue.dequeue();
            for (int w: G.adj(x)) {
                if (!marked[w]) {
                    queue.enqueue(w);
                    marked[w] = true;
                    edgeTo[w] = x;
                }
            }
        }
    }



    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            System.out.println("no path to " + v);
            return null;
        }
        System.out.println("has path to " + v);

        Stack<Integer> stack = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            stack.push(x);
        }
        stack.push(s);
        return stack;
    }
}
