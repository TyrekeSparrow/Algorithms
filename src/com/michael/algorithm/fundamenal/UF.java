package com.michael.algorithm.fundamenal;

/**
 * Created by michael on 16-8-8.
 */
public class UF {
    private static final int[][] pq = {{4, 3}, {3, 8}, {6, 5}, {9, 4}, {2, 1}, {5, 0}, {7, 2}, {6, 1},};

    public static void main(String[] args) {
        // initialize N components
        // for each p and q
        // if p and q is connected ignore
        // else union p and q
        // print p and q
        final int l = pq.length;
        final UF uf = new UF(10);
        for (int i = 0; i < l; i++) {
            final int p = pq[i][0];
            final int q = pq[i][1];
            if (uf.connected(p, q)) {
                continue;
            } else {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
        System.out.println(uf.count + " components");
    }

    private int[] id;
    private int count;

    // initialize N sites with integer names(0 to N-1)
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // add connection between p and q
    public void union(int p, int q) {
        final int pID = find(p);
        final int qID = find(q);
        if (pID == qID) {
            return;
        } else {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pID) {
                    id[i] = qID;
                }
            }
            count--;
        }
    }

    // quick find
    // component identifier for p(0 to N-1)
    public int find(int p) {
        return id[p];
    }

    /*
    // find pRoot
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        // find root
        // if pRoot == qRoot return
        // else id[pRoot] = qRoot
        // count--;
        final int pRoot = find(p);
        final int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        } else {
            id[pRoot] = id[qRoot];
            count--;
        }
    }
*/




    // return true if p and q are in the same component
    public boolean connected(int p, int q) {
        final boolean isConnected = id[p] == id[q];
        return isConnected;
    }

    // number of components
    public int count() {
        return count;
    }








}
