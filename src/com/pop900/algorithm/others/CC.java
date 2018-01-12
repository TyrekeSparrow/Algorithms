package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Bag;
import com.pop900.algorithm.graphs.Graph;

/**
 * Created by michael on 16-9-7.
 */
public class CC {
    public static void main(String[] args) {
        Graph G = new Graph(13);
        G.addEdge(0 ,5);
        G.addEdge(4, 3);
        G.addEdge(0, 1);
        G.addEdge(9, 12);
        G.addEdge(6, 4);
        G.addEdge(5, 4);
        G.addEdge(0, 2);
        G.addEdge(11, 12);
        G.addEdge(9, 10);
        G.addEdge(0, 6);
        G.addEdge(7, 8);
        G.addEdge(9, 11);
        G.addEdge(5, 3);
        // print component count
        CC cc = new CC(G);
        System.out.println("component counts = " + cc.count());
        // print each component
        Bag<Integer>[] ccs = new Bag[cc.count()];
        for (int i = 0; i < cc.count(); i++) {
            ccs[i] = new Bag<Integer>();
        }

        for (int i = 0; i < G.V(); i++) {
            ccs[cc.id(i)].add(i);
        }

        for (Bag<Integer> ccc : ccs) {
            for (int v: ccc) {
                System.out.printf(v + " ");

            }
            System.out.println();
        }





    }

    // markeds
    // ids
    // count
    public boolean[] marked;
    public int[] id;
    public int count;
    public int[] edgeTo;

    // construct
    // id
    // count
    // connected
    // dfs
    public CC(Graph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        edgeTo = new int[G.V()];
        // for each unmarked vertex, dfs, count++
        for (int s = 0; s < G.V(); s++){
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w: G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }
}
