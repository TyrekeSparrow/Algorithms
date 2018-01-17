package com.michael.algorithm.others;

import com.michael.algorithm.fundamenal.Bag;
import com.michael.algorithm.graphs.Digraph;

/**
 * Created by michael on 16-9-8.
 */
public class DirectedDFS {
    public static void main(String[] args) {
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

        DirectedDFS directedDFS = new DirectedDFS(digraph, 0);

        Bag<Integer> bag= new Bag<Integer>();
        for (int v = 0; v < digraph.V(); v++) {
            if (directedDFS.marked(v)) {
                bag.add(v);
            }
        }
        for (int v : bag) {
            System.out.printf(v + " ");
        }
        System.out.println();





    }


    // marked;
    private boolean[] marked;

    // construct
    public DirectedDFS(Digraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    // dfs
    public void dfs(Digraph G, int s) {
        marked[s] = true;
        for (int v : G.adj(s)) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }

    }

    // marked
    public boolean marked(int v) {
        return marked[v];
    }
}
