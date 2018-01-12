package com.pop900.algorithm.graphs;

/**
 * Created by michael on 16-8-12.
 */
public class DirectedDFS {

    public static void main(String[] args) {
        // 4 2
        // 2 3
        // 3 2
        // 6 0
        // 0 1
        // 2 0
        // 11 12
        // 12 9
        // 9 10
        // 9 11
        // 8 9
        // 10 12
        // 11 4
        // 4 3
        // 3 5
        // 7 8
        // 8 7
        // 5 4
        // 0 5
        // 6 4
        // 6 9
        // 7 6
        // 13 vertices
        // 22 edges

        Digraph digraph = new Digraph(13);
        digraph.addEdge(4, 2);
        digraph.addEdge(2, 3);
        digraph.addEdge(3, 2);
        digraph.addEdge(6, 0);
        digraph.addEdge(0, 1);
        digraph.addEdge(2, 0);
        digraph.addEdge(11, 12);
        digraph.addEdge(12, 9);
        digraph.addEdge(9, 10);
        digraph.addEdge(9, 11);
        digraph.addEdge(8, 9);
        digraph.addEdge(10, 12);
        digraph.addEdge(11, 4);
        digraph.addEdge(4, 3);
        digraph.addEdge(3, 5);
        digraph.addEdge(7, 8);
        digraph.addEdge(8, 7);
        digraph.addEdge(5, 4);
        digraph.addEdge(0, 5);
        digraph.addEdge(6, 4);
        digraph.addEdge(6, 9);
        digraph.addEdge(7, 6);

//        digraph.showAll();


        // get 2 isReachable
        DirectedDFS dfs = new DirectedDFS(digraph, 0);
        DirectedDFS dfss = new DirectedDFS(digraph, 9);
        DirectedDFS dfs6 = new DirectedDFS(digraph, 6);
//        boolean isReachable = dfs.marked(2);
//        System.out.println(2 + "isReachable = " + isReachable);
    }



    private boolean[] marked; // is reachable

    // construct
    // dfs
    // isMarked

    public DirectedDFS(Digraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
        System.out.println();
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        System.out.printf(v + " ");
        for (int w : G.adj(v)) {
            if (!marked(w)) {
                dfs(G, w);
            }
        }
    }

    public boolean marked(int v) {
        return marked[v];
    }












}
