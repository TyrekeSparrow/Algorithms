package com.pop900.algorithm.others;

import com.pop900.algorithm.graphs.Digraph;

/**
 * Created by michael on 16-9-9.
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


        Topological topological = new Topological(G);
        Iterable<Integer> iterable = topological.order;
        for (int v : iterable) {
            System.out.printf(v + " ");
        }
        System.out.println();





    }

    // order
    private Iterable<Integer> order;

    // construct
    public Topological(Digraph G) {
        DirectedCycle cycle = new DirectedCycle(G);
        if (!cycle.hasCycle()) {
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.reversePost();
        }
    }

    // order
    public Iterable<Integer> order() {
        return order;
    }

    // is a dag
    public boolean isDAG() {
        return order == null;
    }



}


