package com.michael.algorithm.graphs;

/**
 * Created by michael on 16-8-13.
 */
public class Topological {
    public static void main(String[] args) {
        Digraph G = new Digraph(13);
        G.addEdge(0, 6);
        G.addEdge(0, 1);
        G.addEdge(0, 5);
        G.addEdge(2, 3);
        G.addEdge(2, 0);
        G.addEdge(3, 5);
        G.addEdge(5, 4);
        G.addEdge(6, 9);
        G.addEdge(6, 4);
        G.addEdge(7, 6);
        G.addEdge(8, 7);
        G.addEdge(9, 12);
        G.addEdge(9, 10);
        G.addEdge(9, 11);
        G.addEdge(11, 12);

//        DepthFirstOrder order = new DepthFirstOrder(G);
//        order.showAll();

        Topological t = new Topological(G);
        t.showAll();





    }

    private Iterable<Integer> order;

    public Topological(Digraph G) {
        // check if has order
        // get reversePost
        DirectedCycle cycle = new DirectedCycle(G);
        if (!cycle.hasCycle()) {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }

    public Iterable<Integer> order() {
        return order;
    }

    public boolean isDAG() {
        return order == null;
    }

    public void showAll() {
        for (int i : order) {
            System.out.printf(i + " ");
        }
        System.out.println();





    }








}
