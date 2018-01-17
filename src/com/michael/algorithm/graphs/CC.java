package com.michael.algorithm.graphs;

/**
 * Created by michael on 16-8-12.
 */
public class CC {
    public static void main(String[] args) {
        // construct graph
        // construct connected components
        // show all id
        // 0 5
        // 4 3
        // 0 1
        // 9 12
        // 6 4
        // 5 4
        // 0 2
        // 11 12
        // 9 10
        // 0 6
        // 7 8
        // 9 11
        // 5 3
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

//        G.showAll();
        CC cc = new CC(G);
        cc.showAllId();











    }

    // marked
    // id for count
    // count
    public boolean[] marked;
    private int[] id;
    private int count;



    // construct
    // dfs
    // is connected
    // getId
    // getCount
    // showAllId

    public CC(Graph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        for (int s = 0; s < G.V(); s++) {
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
        }
    }

    public void dfs(Graph G, int V) {
        marked[V] = true;
        id[V] = count;

        for (int w : G.adj(V)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }

    }

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public void showAllId() {
        for (int i = 0; i < id.length; i++) {
            System.out.printf(id[i] + " ");
        }







    }

    public int count() {
        return count;
    }








}
