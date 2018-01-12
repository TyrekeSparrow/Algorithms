package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Stack;
import com.pop900.algorithm.graphs.Digraph;

/**
 * Created by michael on 16-9-9.
 */
public class DirectedCycle {
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

        DirectedCycle cycle = new DirectedCycle(digraph);
        System.out.println("hasCycle = " + cycle.hasCycle());
        if (cycle.hasCycle()) {
            Iterable<Integer> iterable= cycle.cycle();
            for (int i : iterable) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }





    }

    // marked
    private boolean[] marked;
    // edgeTo
    private int[] edgeTo;
    // cycle
    private Stack<Integer> cycle;
    // onStack
    private boolean[] onStack;

    // construct for each vertex unmarked dfs
    public DirectedCycle(Digraph G) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        onStack = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }
    }

    // dfs
    public void dfs(Digraph G, int v) {
        onStack[v] = true;
        marked[v] = true;
        for (int w: G.adj(v)) {
            if (hasCycle()) {
                return;
            } else if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            } else if (onStack[w]) {
                // get cycle
                cycle = new Stack<Integer>();
                for (int x = v; x != w; x = edgeTo[x]) {
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
        onStack[v] = false;
    }


    // hasCycle
    public boolean hasCycle() {
        return cycle != null;
    }

    // cycle
    public Iterable<Integer> cycle() {
        return cycle;
    }





}
