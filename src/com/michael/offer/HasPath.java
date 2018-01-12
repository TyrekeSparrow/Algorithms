package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class HasPath {
    public static void main(String[] args) {
        char[] matrix = {'a', 'b', 't', 'g', 'c', 'f', 'c', 's', 'j', 'd', 'e', 'h'};
        // bfce
        // abfb

//        char[] str = "bfce".toCharArray();
        char[] str = "abfb".toCharArray();

        int rows = 3;
        int cols = 4;

        boolean hasPath = hasPath(matrix, rows, cols, str);
        System.out.printf("hasPath = " + hasPath);

    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean hasPath = hasPathCore(matrix, rows, cols, visited, i, j, str, 0);
                if (hasPath) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean hasPathCore(char[] matrix, int rows, int cols, boolean[] visited, int i, int j, char[] str, int k) {
        // i
        // j
        // visited
        // equals

        if (i < 0 || i >= rows) return false;
        if (j < 0 || j >= cols) return false;
        int index = i * cols + j;
        if (visited[index]) return false;
        if (matrix[index] != str[k]) return false;

        visited[index] = true;
        if (k == str.length - 1) return true;

        // left top right bottom
        if (hasPathCore(matrix, rows, cols, visited, i - 1, j, str, k + 1)
                || hasPathCore(matrix, rows, cols, visited, i, j - 1, str, k + 1)
                || hasPathCore(matrix, rows, cols, visited, i + 1, j, str, k + 1)
                || hasPathCore(matrix, rows, cols, visited, i, j + 1, str, k + 1)) {
            return true;
        } else {
            visited[index] = false;
            return false;
        }
    }



}
