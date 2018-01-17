package com.michael.algorithm.graphs;

/**
 * Created by michael on 16-8-13.
 */
public class KosarajuSCC {
    public static void main(String[] args) {
        // 0 1
        // 0 5
        // 2 0
        // 2 3
        // 3 2
        // 4 2
        // 4 3
        // 5 4
        // 6 0
        // 6 4
        // 6 9
        // 7 6
        // 7 8
        // 8 7
        // 8 9
        // 9 10
        // 9 11
        // 10 12
        // 11 4
        // 11 12
        // 12 9

        Digraph G = new Digraph(13);
        G.addEdge(0 ,1);
        G.addEdge(0, 5);
        G.addEdge(2, 0);
        G.addEdge(2, 3);
        G.addEdge(3, 2);
        G.addEdge(4, 2);
        G.addEdge(4, 3);
        G.addEdge(5, 4);
        G.addEdge(6, 0);
        G.addEdge(6, 4);
        G.addEdge(6, 9);
        G.addEdge(7, 6);
        G.addEdge(7, 8);
        G.addEdge(8, 7);
        G.addEdge(8, 9);
        G.addEdge(9, 10);
        G.addEdge(9, 11);
        G.addEdge(10, 12);
        G.addEdge(11, 4);
        G.addEdge(11, 12);
        G.addEdge(12, 9);
        KosarajuSCC scc =  new KosarajuSCC(G);

        scc.showAll();

//        int[] ids = {0, 1, 2, 3};
//        for (int i: ids) {
//            System.out.println("i = " + i);
//
//        }













    }

    private boolean marked[];
    private int[] id;
    private int count;

    public KosarajuSCC(Digraph G)  {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        DepthFirstOrder order = new DepthFirstOrder((G.reverse()));
        for (int s : order.reversePost()) {
            if (!marked[s]) {
                dfs(G, s);
                count++;
//                System.out.println("count = " + count);
            }
        }
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }

    public void showAll() {
//        System.out.println(count + " components");
        for (int i = 0; i < count; i++) {
            System.out.println("component " + i + ": ");
            for (int j = 0; j < id.length; j++) {
                if (id[j] == i) {
                    System.out.printf(j + " ");
                }
            }
            System.out.println();

        }
    }









}
