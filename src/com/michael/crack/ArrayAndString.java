package com.michael.crack;

import com.michael.offer.List;
import com.michael.offer.Node;
import com.michael.offer.Tree;
import com.michael.algorithm.strings.KMPPP;
import com.michael.offer.Tree.TreeNode;

import java.util.*;

public class ArrayAndString {
    public static void main(String[] args) {

//        final String str = "abcdef";
////        final String str = "abcdeff";
//        boolean isUnique = isUniqueChars(str);
//        System.out.println("isUnique: " + isUnique);
        // ======================================================================
//        final String s1 = "I love U";
//        final String s2 = "U I vleo";
//        final boolean anagram = permutation(s1, s2);
//        System.out.println("anagram: " + anagram);
        // ========================================================================
//        final String str = "I love U";
//        final char[] array = new char[str.length() + 100];
//        final int length = str.length();
////        System.out.println(length);
//        final char[] content = str.toCharArray();
//        for (int i = 0; i < length; i++) {
//            array[i] = content[i];
//        }
//        replaceSpaces(array, length);
        // ========================================================================
//        char c = '\u0048';
//        System.out.println(c);
        // ========================================================================
//        final String str = "aabcccccaaa";
//        final String compressStr = compressString(str);
//        System.out.println(compressStr);
        // ========================================================================
//        final int[][] matrix = {{1, 2, 3, 4, 5},
//                                {6, 7, 8, 9, 10},
//                                {11, 12, 13, 14, 15},
//                                {16, 17, 18, 19, 20},
//                                {21, 22, 23, 24, 25}
//        };
//        final int length = 5;
//        rotateMatrix(matrix, length);
//        printAllMatrix(matrix);
        // ========================================================================
//        final int[][] matrix = {{1, 2, 3, 0, 5},
//                                {6, 7, 8, 9, 10},
//                                {11, 12, 0, 0, 15},
//                                {16, 17, 18, 19, 20},
//                                {21, 22, 23, 0, 25}
//        };
//        printAllMatrix(matrix);
//        setZeros(matrix);
//        printAllMatrix(matrix);
        // ========================================================================
//        final String s1 = "waterbottle";
//        final String s2 = "erbottlewat";
//        final boolean isRotation = isRotation(s1, s2);
//        System.out.println(isRotation);
        // ========================================================================

//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node30 = new Node(3);
//        Node node31 = new Node(3);
//        Node node32 = new Node(3);
//        Node node4 = new Node(4);
//        Node node50 = new Node(5);
//        Node node51 = new Node(5);
//        Node node7 = new Node(2);
//        Node node8 = new Node(4);
//        Node node9 = new Node(9);
//        node1.next = node2;
//        node2.next = node30;
//        node30.next = node31;
//        node31.next = node32;
//        node32.next = node4;
//        node4.next = node50;
//        node50.next = node51;
//        node51.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//
//        List list = new List(node1);
//        list.printAll();
////        deleteDups(list);
//        deleteDupsRunner(list);
//        list.printAll();
        // ========================================================================

//        Node node0  = new Node(0);
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        Node node7 = new Node(7);
//        Node node8 = new Node(8);
//        Node node9 = new Node(9);
//
//        node0.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//
//        List list = new List(node0);
//
////        final Node kthToLastNode = getKthToLastNode(list, 4);
//        final Node kthToLastNode = getKthToLastNodeRunner(list, 4);
//        if (kthToLastNode != null) {
//            System.out.println(kthToLastNode.value);
//        }
        // ========================================================================

//        Node node0  = new Node(0);
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        Node node7 = new Node(7);
//        Node node8 = new Node(8);
//        Node node9 = new Node(9);
//
//        node0.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//        node9.next = node7;
//
//        List list = new List(node0);
//        final Node beginning = findBeginning(list);
//        if (beginning != null) {
//            System.out.println(beginning.value);
//        }
        // ========================================================================
//        Node node0  = new Node(0);
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
////        Node node3 = new Node(2);
//        Node node4 = new Node(1);
//        Node node5 = new Node(0);
//
//        node0.next = node1;
//        node1.next = node2;
////        node2.next = node3;
////        node3.next = node4;
//        node2.next = node4;
//        node4.next = node5;
//
//        List list = new List(node0);
//        final boolean isPalindrome = isPalindrome(list);
//        System.out.println(isPalindrome);
        // ========================================================================


//        final Stack origin = new Stack();
//        origin.push(9);
//        origin.push(8);
//        origin.push(7);
//        origin.push(6);
//        origin.push(5);
//        origin.push(4);
//        origin.push(3);
//        origin.push(2);
//        origin.push(1);
//        final int n = 9;
//        final Stack destination = new Stack();
//        final Stack buffer = new Stack();
//
////        while (origin.size() > 0) {
////            System.out.println(origin.pop());
////        }
//        System.out.println();
//
//        moveDisks(n, origin, destination, buffer);
//
////        System.out.println(destination.size());
//        while (destination.size() > 0) {
//            System.out.println(destination.pop());
//        }

        // ========================================================================

//        TreeNode node1 = new TreeNode(1);
//        TreeNode node21 = new TreeNode(21);
//        TreeNode node22 = new TreeNode(22);
//        TreeNode node31 = new TreeNode(31);
//        TreeNode node32 = new TreeNode(32);
//        TreeNode node33 = new TreeNode(33);
//        TreeNode node34 = new TreeNode(34);
//
//        node1.left = node21;
//        node1.right = node22;
//        node21.left = node31;
//        node21.right = node32;
//        node22.left = node33;
//        node22.right = node34;
//
////        TreeNode node41 = new TreeNode(41);
////        TreeNode node51 = new TreeNode(51);
////        node31.left = node41;
////        node41.left = node51;
//
//        Tree tree = new Tree(node1);
//
//        final boolean isBalanced = isBalanced(tree);
//        System.out.println(isBalanced);
        // ========================================================================

//        final int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
//        final Tree tree = createMinimalNode(array);
//        tree.printTreeBread();

        // ========================================================================
//        TreeNode node1 = new TreeNode(300);
//        TreeNode node21 = new TreeNode(21);
//        TreeNode node22 = new TreeNode(220);
//        TreeNode node31 = new TreeNode(Integer.MIN_VALUE);
//        TreeNode node32 = new TreeNode(32);
//        TreeNode node33 = new TreeNode(133);
//        TreeNode node34 = new TreeNode(Integer.MAX_VALUE);
//
//        node1.left = node21;
//        node1.right = node22;
//        node21.left = node31;
//        node21.right = node32;
//        node22.left = node33;
//        node22.right = node34;
//
////        TreeNode node41 = new TreeNode(41);
////        TreeNode node51 = new TreeNode(51);
////        node31.left = node41;
////        node41.left = node51;
//
//        Tree tree = new Tree(node1);
//        final boolean isBST = isBST(tree);
//        System.out.println(isBST);
        // ========================================================================

//        TreeNode<Character> nodeA = new TreeNode<>('a');
//        TreeNode<Character> nodeB = new TreeNode<>('b');
//        TreeNode<Character> nodeC = new TreeNode<>('c');
//        TreeNode<Character> nodeD = new TreeNode<>('d');
//        TreeNode<Character> nodeE = new TreeNode<>('e');
//        TreeNode<Character> nodeF = new TreeNode<>('f');
//        TreeNode<Character> nodeG = new TreeNode<>('g');
//        TreeNode<Character> nodeH = new TreeNode<>('h');
//        TreeNode<Character> nodeI = new TreeNode<>('i');
//
//        nodeA.left = nodeB;
//        nodeB.parent = nodeA;
//        nodeA.right = nodeC;
//        nodeC.parent = nodeA;
//        nodeB.left = nodeD;
//        nodeD.parent = nodeB;
//        nodeB.right = nodeE;
//        nodeE.parent = nodeB;
//
//        nodeE.left = nodeH;
//        nodeH.parent = nodeE;
//        nodeE.right = nodeI;
//        nodeI.parent = nodeE;
//        nodeC.left = nodeF;
//        nodeF.parent = nodeC;
//        nodeC.right = nodeG;
//        nodeG.parent = nodeC;
//
//        Tree tree = new Tree(nodeA);
//        final TreeNode inorderNext = inorderSucc(nodeI);
//        System.out.println(inorderNext.value);

        // ========================================================================

//        Tree.TreeNode treeNode4 = new Tree.TreeNode(4);
//        Tree.TreeNode treeNode7 = new Tree.TreeNode(7);
//        Tree.TreeNode treeNode2 = new Tree.TreeNode(2);
////        treeNode2.left = treeNode4;
////        treeNode2.right = treeNode7;
//        Tree.TreeNode treeNode9 = new Tree.TreeNode(9);
//        Tree.TreeNode treeNode8111111 = new Tree.TreeNode(800);
//        treeNode8111111.left = treeNode9;
//        treeNode8111111.right = treeNode2;
//        Tree.TreeNode treeNode77 = new Tree.TreeNode(7);
//        Tree.TreeNode<Integer> root = new Tree.TreeNode(8);
//        root.left = treeNode8111111;
//        root.right = treeNode77;
//
//        Tree tree = new Tree(root);
//
//        Tree.TreeNode<Integer> treeNode99 = new Tree.TreeNode(9);
//        Tree.TreeNode<Integer> treeNode22 = new Tree.TreeNode(2);
//        Tree.TreeNode<Integer> treeNode8888888 = new Tree.TreeNode(800);
//
//        treeNode8888888.left = treeNode99;
//        treeNode8888888.right = treeNode22;
//
////        Tree subtree = new Tree(treeNode8888888);
//        Tree subtree = new Tree(treeNode4);
//
//        final boolean isSubTree = isSubTree(tree, subtree);
//        System.out.println(isSubTree);

        // ========================================================================

//        final int n = 3334;
//        final int ways = countWays(n);
//        System.out.println(ways);


//        final int n = 5;
//        final int ways = countWaysLoop(n);
//        System.out.println(ways);

        // ========================================================================

//        final int row = 3;
//        final int column = 3;
//        final int[][] paths = new int[row][column];
//        final int count = countPaths(paths, row, column);
//        System.out.println(count);


//        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
//        final int magicIndex = getMagicIndex(array);
//        System.out.println(magicIndex);
//        System.out.println(array[magicIndex]);

        // ========================================================================
//        final int[] array = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
//        final int magic = getMagic(array);
//        System.out.println(magic);
//        System.out.println(array[magic]);

        // ========================================================================

//        final ArrayList<Character> list = new ArrayList<Character>();
//        list.add('a');
//        list.add('b');
//        list.add('c');
//        list.add('d');
////        list.add('e');
////        list.add('f');
//
//        final ArrayList<ArrayList<Character>> subsets = getSubsets(list);
//        for (ArrayList<Character> set : subsets) {
//            if (set.size() == 0) {
//                System.out.printf(" { } ");
//            }
//
//            for (Character c : set) {
//                System.out.printf(" {" + c + "} ");
//            }
//            System.out.println();
//        }
        // ========================================================================

//        final String str = "abc";
//        final ArrayList<String> allPermutations = getAllPermutations(str);
//        for (String permutation : allPermutations) {
//            System.out.println(permutation);
//        }

        // ========================================================================
//        final int count = 3;
//        final ArrayList<String> generateParent = generateParens(count);
//        System.out.println(generateParent);
        // ========================================================================
//        final int n = 100;
//        final int ways = getWays(n);
//        System.out.println(ways);

//        final int count = 8;
//        final LinkedList<java.util.List<Position>> ways = getQueenWays(count);
//        System.out.println(ways.size());
//        System.out.println(ways);
        // ========================================================================
//        final int a = 13;
//        final int b = 15;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println();
//        swap(a, b);
        // ========================================================================

//        int number = 11;
//        final int count = countFactZeros(number);
//        System.out.println("count = " + count);
//
//        int result = 1;
//        while (number > 0) {
//            System.out.println(number);
//            result *= number;
//            number--;
//        }
//        System.out.println(result);

        // ========================================================================

//        final int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
//        getUnOrderedInterval(array);

        // ========================================================================
//        final int[] array = {2, 3, -8, -1, 2, 4, -2, 3};
//        final int maxSum = getMaxSum(array);
//        System.out.println(maxSum);

        // ========================================================================

//        final TreeNode node4 = new TreeNode(4);
//        final TreeNode node2 = new TreeNode(2);
//        final TreeNode node5 = new TreeNode(5);
//        final TreeNode node1 = new TreeNode(1);
//        final TreeNode node3 = new TreeNode(3);
//        final TreeNode node6 = new TreeNode(6);
//        final TreeNode node0 = new TreeNode(0);
//
//        node4.left = node2;
//        node4.right = node5;
//
//        node2.left = node1;
//        node2.right = node3;
//        node5.right = node6;
//
//        node1.left = node0;
//
//        TreeNode node = toList(node4);
//
//        while (node != null) {
//            System.out.println(node.value);
//            node = node.left;
//        }


        // ========================================================================
//        final double base = -3;
//        final int exponent = 8;
//
//        final double power = power(base, exponent);
//        System.out.println("power = " + power);
//        System.out.println("power");

//        System.out.println(3 >> 1);

        // ========================================================================

        final int count = 8;
        final ArrayList<Integer[]> results = placeAllQueens(count);
        System.out.println("size: " + results.size());
//        showResult(results);

    }

    private static void showResult(ArrayList<Integer[]> results) {
//        for (Integer[] columns : results) {

            int temp = 0;
            for (Integer column : results.get(0)) {
                while (temp < column) {
                    System.out.printf(" ");
                }
                temp = 0;
                System.out.printf(column + "");
                System.out.println();
            }



//            System.out.println();
//            System.out.println();
//            System.out.println();
//        }
    }

    private static ArrayList<Integer[]> placeAllQueens(int count) {
        ArrayList<Integer[]> results = new ArrayList<Integer[]>();
        Integer[] columns = new Integer[count];
        placeColumn(results, columns, 0);
        return results;
    }

    private static void placeColumn(ArrayList<Integer[]> results, Integer[] columns, int row) {
        if (row == columns.length) {
//            for (Integer column : columns) {
//                System.out.println(column);
//            }
//            System.out.println();
//            System.out.println();

            results.add(columns.clone());
            return;
        }

        for (int column = 0; column < columns.length; column++) {
            if (isValid(columns, row, column)) {
//                System.out.println("valid row: " + row);
//                System.out.println("valid column: " + column);
//                System.out.println();

                columns[row] = column;
//                System.out.println(row + 1);
//                if (row + 1 == columns.length) {
                    placeColumn(results, columns, row + 1);
//                    break;
//                }
            }
        }
    }

    private static boolean isValid(Integer[] columns, int currentRow, int currentColumn) {
        for (int row = 0; row < currentRow; row++) {
            if (columns[row] == currentColumn) {
                return false;
            }

            final int columnDistance = Math.abs(columns[row] - currentColumn);
            final int rowDistance = currentRow - row;

            if (rowDistance == columnDistance) {
                return false;
            }
        }
        return true;
    }

    private static TreeNode toList(TreeNode node4) {
        TreeNode rightMostNode = null;
        rightMostNode = toList(node4, rightMostNode);
        return rightMostNode;
    }

    private static TreeNode toList(TreeNode node, TreeNode rightMostNode) {
//        System.out.println(node.value);

        if (node.left == null) {
            if (rightMostNode != null) {
                rightMostNode.right = node;
            }
            node.left = rightMostNode;
            return node;
        }

        // left
        if (node.left != null) {
            rightMostNode = toList(node.left, rightMostNode);
        }

        // middle
        if (rightMostNode != null) {
            rightMostNode.right = node;
        }
        node.left = rightMostNode;
        rightMostNode = node;

        // right
        if (node.right != null) {
            rightMostNode = toList(node.right, rightMostNode);
        }

        return rightMostNode;
    }

    private static double power(double base, int exponent) {
        if (base == 0) return 0;
        if (base == 1) return 1;

        final int absExponent = Math.abs(exponent);
        double power = powerImpl(base, absExponent);

        if (exponent < 0) {
            power = 1.0 / power;
        }

        return power;
    }

    private static double powerImpl(double base, int absExponent) {
        double result = 1;

        System.out.println("absExponent = " + absExponent);
        if (absExponent == 0) return 1;
        if (absExponent == 1) return base;

        result = powerImpl(base, absExponent >> 1);
        result *= result;

        if ((absExponent & 0x1) == 1) {
            result *= base;
        }
        System.out.println(result);
        return result;
    }

    private static int getMaxSum(int[] array) {
        if (array == null) return 0;
        if (array.length == 0) return 0;

        int startIndex = 0;
        int endIndex = 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (currentSum + array[i] <= 0) {
                startIndex = i + 1;
                endIndex = i + 1;
                currentSum = 0;
            } else {
                endIndex = i;
                currentSum += array[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }



        if (maxSum < 0) {
            return 0;
        } else {
            System.out.println(array[startIndex]);
            System.out.println(array[endIndex]);
            return maxSum;
        }





    }

    private static void getUnOrderedInterval(int[] array) {
        if (array == null) return;
        if (array.length == 1) return;

        int startIndex = array.length;
        int endIndex = 0;
        int previous = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= previous) {
                previous = array[i];
                continue;
            } else {
                System.out.println(array[i]);
                endIndex = i;
                final int swapIndex = getSwapIndex(array, i - 1, i);
                System.out.println(swapIndex);
                System.out.println("startIndex = " + startIndex);
                if (swapIndex < startIndex) {
                    startIndex = swapIndex;
                }
                System.out.println();
                continue;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(startIndex);
        System.out.println(endIndex);
        //        System.out.println(array[startIndex]);
//        System.out.println(array[endIndex]);

    }

    private static int getSwapIndex(int[] array, int previousIndex, int currentIndex) {
        // {1, 2, 4, 7, 10, 11, 7,
        // previousIndex 11's index
        // currentIndex 7's index


        while (previousIndex > 0 && array[previousIndex] > array[currentIndex]) {
            previousIndex--;
        }

        if (array[previousIndex] <= array[currentIndex]) {
            final int swapIndex = previousIndex + 1;
            final int temp = array[swapIndex];
            array[swapIndex] = array[currentIndex];
            array[currentIndex] = temp;
            return swapIndex;
        } else {
            return -1;
        }
    }


    private static int countFactZeros(int number) {
        if (number < 0) return -1;

        int count = 0;

        for (int factor = 5; number / factor > 0; factor *= 5) {
            count += number / factor;
        }

        return count;
    }

    private static void swap(int a, int b) {
        b = b - a;
        a = a + b;
        b = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    private static LinkedList<java.util.List<Position>> getQueenWays(int queens) {
        LinkedList<java.util.List<Position>> ways = new LinkedList<java.util.List<Position>>();
        final boolean[][] isValid = new boolean[queens][queens];
        Position[] positions = new Position[queens];
        placeQueues(ways, isValid, positions, 0);
        return ways;
    }

    private static void placeQueues(LinkedList<java.util.List<Position>> ways, boolean[][] hasQueen, Position[] positions, int queenIndex) {
        if (queenIndex == positions.length) {
            final java.util.List list = Arrays.asList(positions);
            ways.add(list);
            clearQueues(hasQueen);
            return;
        }

        boolean isPositionValid = false;
        for (int column = 0; column < positions.length; column++) {
            final Position position = new Position(queenIndex, column);
            isPositionValid = isPositionValid(hasQueen, position);
            if (isPositionValid) {
                System.out.println(position.row);
                System.out.println(position.column);
                positions[queenIndex] = position;
                updateHasQueen(hasQueen, position);
                placeQueues(ways, hasQueen, positions, queenIndex + 1);
            }
            System.out.println();
        }
        if (!isPositionValid) {
            clearQueues(hasQueen);
        }
    }

    private static void clearQueues(boolean[][] hasQueen) {
        for (int i = 0; i < hasQueen.length; i++) {
            for (int j = 0; j < hasQueen[i].length; j++) {
                hasQueen[i][j] = false;
            }
        }
    }

    private static void updateHasQueen(boolean[][] hasQueen, Position position) {
        // row
        for (int column = 0; column < hasQueen[0].length; column++) {
            hasQueen[position.row][column] = true;
        }

        // column
        for (int row = 0; row < hasQueen.length; row++) {
            hasQueen[row][position.column] = true;
        }

        // left up
        int row = position.row;
        int column = position.column;
        while (row > 0 && column > 0) {
            row--;
            column--;
            hasQueen[row][column] = true;
        }

        // right down
        row = position.row;
        column = position.column;
        while (row < hasQueen.length - 1 && column < hasQueen[0].length - 1) {
            row++;
            column++;
            hasQueen[row][column] = true;
        }

        // up right
        row = position.row;
        column = position.column;
        while (row > 0 && column < hasQueen[0].length - 1) {
            row--;
            column++;
            hasQueen[row][column] = true;
        }

        // down left
        row = position.row;
        column = position.column;
        while (row < hasQueen.length - 1 && column > 0) {
            row++;
            column--;
            hasQueen[row][column] = true;
        }
    }

    private static boolean isPositionValid(boolean[][] hasQueen, Position position) {
        return !hasQueen[position.row][position.column];
    }

    static class Position {
        public int row;
        public int column;

        public Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    private static int getWays(int n) {
        final int ways = makeChange(n, 25);
        return ways;
    }

    private static int makeChange(int n, int denom) {
        if (n == 0) return 1;

        if (denom == 1) {
            return 1;
        }

        int nextDenom = 0;
        switch (denom) {
            case 25:
                nextDenom = 10;
                break;
            case 10:
                nextDenom = 5;
                break;
            case 5:
                nextDenom = 1;
                break;
        }

        int ways = 0;
        for (int i = 0; denom * i <= n; i++) {
            final int denomWays = makeChange(n - denom * i, nextDenom);
            ways += denomWays;
        }
        return ways;
    }


    private static ArrayList<String> generateParens(int count) {
        ArrayList<String> parens = new ArrayList<String>();
        final char[] paren = new char[count * 2];
        addParen(parens, count, count, paren, 0);
        return parens;
    }

    private static void addParen(ArrayList<String> parens, int leftRemind, int rightRemind, char[] paren, int index) {
        if (index >= paren.length && leftRemind == 0 && rightRemind == 0) {
            parens.add(String.valueOf(paren));
            return;
        }

        if (leftRemind > 0) {
            paren[index] = '(';
            addParen(parens, leftRemind - 1, rightRemind, paren, index + 1);
        }

        if (rightRemind > leftRemind) {
            paren[index] = ')';
            addParen(parens, leftRemind, rightRemind - 1, paren, index + 1);
        }
    }

    private static ArrayList<String> getAllPermutations(String str) {
        if (str == null || str.length() == 0) return null;

        ArrayList<String> permutations = new ArrayList<String>();
//        ArrayList<String> result = new ArrayList<String>();
        final char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            final char c = array[i];
//            System.out.println(c);
            if (permutations.size() == 0) {
                permutations.add(String.valueOf(c));
                continue;
            }

            final int size = permutations.size();
            for (int j = 0; j < size; j++) {
                final ArrayList<String> allPerms = getAllPermutations(permutations.get(j), c);
//                if (i == array.length - 1) {
//                    result.addAll(allPerms);
//                } else {
                    permutations.addAll(allPerms);
//                }
            }
        }

        return permutations;
    }

    private static ArrayList<String> getAllPermutations(String s, char c) {
        ArrayList<String> permutations = new ArrayList<String>();

        final char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            final String before = String.valueOf(array, 0, i);
            final String after = String.valueOf(array, i, array.length - i);
            final String permutation = before + c + after;
//            System.out.println(permutation);
            permutations.add(permutation);
        }
        permutations.add(s + c);
//        System.out.println();

        return permutations;
    }

    private static ArrayList<ArrayList<Character>> getSubsets(ArrayList<Character> list) {
        ArrayList<ArrayList<Character>> subsets = new ArrayList<ArrayList<Character>>();
        subsets.add(new ArrayList<Character>());

        for (int index = 0; index < list.size(); index++) {
            final Character c = list.get(index);
            System.out.println(c);
            final int size = subsets.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Character> newSet = (ArrayList<Character>) subsets.get(i).clone();
//                System.out.println(newSet.size());
                newSet.add(c);
                subsets.add(newSet);
            }
        }
//        System.out.println(subsets.size());
        return subsets;
    }

    private static int getMagic(int[] array) {
        if (array == null) return -1;
        if (array.length == 0) return -1;

        final int magic = getMagicBetter(array, 0 , array.length - 1);
        return magic;
    }

    private static int getMagicBetter(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > array.length - 1) return -1;
        if (endIndex < 0 || endIndex > array.length - 1) return -1;
        if (startIndex > endIndex) return -1;

        final int middleIndex = (startIndex + endIndex) / 2;

        if (array[middleIndex] == middleIndex) {
            return middleIndex;
        } else {

            if (array[middleIndex] > array.length - 1) {
                return getMagicBetter(array, startIndex, middleIndex - 1);
            } else if (array[middleIndex] < 0) {
                return getMagicBetter(array, middleIndex + 1, endIndex);
            } else {
                if (array[middleIndex] < middleIndex) {
                    final int leftMagicIndex = getMagicBetter(array, startIndex, array[middleIndex]);
                    if (leftMagicIndex != -1) {
                        return leftMagicIndex;
                    }
                } else {
                    final int rightMagicIndex = getMagicBetter(array, array[middleIndex], endIndex);
                    if (rightMagicIndex != -1) {
                        return rightMagicIndex;
                    }
                }
                return -1;
            }
        }
    }

    private static int getMagicIndex(int[] array) {
        if (array == null) return -1;
        if (array.length == 0) return -1;

        final int magicIndex = getMagicIndexFast(array, 0, array.length - 1);
        return magicIndex;
    }

    private static int getMagicIndexFast(int[] array, int start, int end) {
        if (array == null) return -1;
        if (array.length == 0) return -1;
        if (start < 0 || start > array.length - 1) return -1;
        if (end < 0 || end > array.length - 1) return -1;
        if (start > end) return -1;

        final int midIndex = (start + end) / 2;
        if (array[midIndex] == midIndex) {
            return midIndex;
        }

        if (array[midIndex] < midIndex) {
            final int magicIndex = getMagicIndexFast(array, midIndex + 1, end);
            return magicIndex;
        }

        if (array[midIndex] > midIndex) {
            final int magicIndex = getMagicIndexFast(array, start, midIndex - 1);
            return magicIndex;
        }

        return -1;
    }

    private static int countPaths(int[][] paths, int row, int column) {
        if (row <= 0) return -1;
        if (column <= 0) return -1;

        int[] count = new int[column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (r == 0) {
                    count[c] = 1;
                    continue;
                }
                if (c == 0) {
                    count[c] = 1;
                    continue;
                }
                count[c] = count[c - 1] + count[c];
            }
        }

        return count[column - 1];
    }

    private static int countWaysLoop(int n) {
        if (n <= 0) return -1;

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 2 + 1;

//        int[] ways = {1, 2, 3};
        final LinkedList<Integer> ways = new LinkedList<Integer>();
        ways.add(1);
        ways.add(2);
        ways.add(3);

        for (int i = 4; i <= n; i++) {
            final int count = ways.get(0) + ways.get(1) + ways.get(2);
            ways.poll();
            ways.add(count);
            if (i == n) {
                return count;
            }
        }

        return -1;

    }

    private static int countWays(int n) {
        if (n == 0) return -1;
        return countWaysDp(n);
    }

    private static int countWaysDp(int n) {
//        System.out.println("n = " + n);
        if (n <= 0) return 1;

        // n >= 1
        final int ways1 = countWaysDp(n - 1);
        if (n >= 2) {
            final int ways2 = countWaysDp(n - 2);
            if (n >= 3) {
                final int ways3 = countWaysDp(n - 3);
                return ways1 + ways2 + ways3;
            } else {
                return ways1 + ways2;
            }
        } else {
            return ways1;
        }
    }

    private static boolean isSubTree(Tree tree, Tree subtree) {
        if (tree == null || tree.root == null) return false;
        if (subtree == null || subtree.root == null) return false;

        final boolean isSubtree = preOrder(tree.root, subtree.root);
        return isSubtree;
    }

    private static boolean preOrder(TreeNode node1, TreeNode  node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        // node1 != null && node2 != null
        boolean isSameNode = isSameNode(node1, node2);
//        System.out.println(isSameNode);
        if (!isSameNode) {
            final boolean isLeftSame = preOrder(node1.left, node2);
            isSameNode = isLeftSame;
            if (!isSameNode) {
                final boolean isRightSame = preOrder(node1.right, node2);
                isSameNode = isRightSame;
            }
        }
        return isSameNode;
    }

    private static boolean isSameNode(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        final int value1 = (int) node1.value;
        final int value2 = (int) node2.value;
//        System.out.println(node1.value);
//        System.out.println(node2.value);
        // node1 != null && node2 != null
        if (value1 == value2) {
            final boolean isLeftSame = isSameNode(node1.left, node2.left);
            final boolean isRightSame = isSameNode(node1.right, node2.right);
//            System.out.println(isLeftSame);
//            System.out.println(isRightSame);
            if (isLeftSame && isRightSame) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    private static TreeNode inorderSucc(TreeNode<Character> node) {
        // if node has a right child, return leftmost child of right subtree
        // else return first right parent

        if (node.right != null) {
            return getLeftMostChild(node.right);
        } else {
            TreeNode child = node;
            TreeNode parent = child.parent;
            while (parent != null) {
                if (parent.left == child) {
                    return parent;
                } else {
                    child = parent;
                    parent = parent.parent;
                }
            }

            return null;
        }










    }

    private static TreeNode getLeftMostChild(TreeNode node) {
        if (node == null) return null;

        TreeNode leftMostNode = node;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }

        return leftMostNode;
    }


    private static boolean isBST(Tree tree) {
        if (tree == null) return false;
        if (tree.root == null) return true;

        final boolean isBinarySearchNode = isBinarySearchNode(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return isBinarySearchNode;
    }

    // [min, max]
    private static boolean isBinarySearchNode(TreeNode node, int minValue, int maxValue) {
        if (node == null) return true;

        final int value = (int) node.value;

        if (value < minValue) {
            return false;
        }

        if (value > maxValue) {
            return false;
        }

        boolean isLeftBinary = true;
        if (node.left != null) {
            if (value == Integer.MIN_VALUE) {
                isLeftBinary = false;
            } else {
                isLeftBinary = isBinarySearchNode(node.left, minValue, value - 1);
            }
        }
        if (!isLeftBinary) {
            return false;
        }

        boolean isRightBinary = true;
        if (node.right != null) {
            if (value == Integer.MAX_VALUE) {
                isRightBinary = false;
            } else {
                isRightBinary=  isBinarySearchNode(node.right, value + 1, maxValue);
            }
        }

        if (!isRightBinary) {
            return false;
        }

        return true;
    }


    private static Tree createMinimalNode(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return null;

        TreeNode root = createMinimalNode(array, 0, array.length - 1);
        if (root != null) {
            Tree tree = new Tree(root);
            return tree;
        } else {
            return null;
        }
    }

    private static TreeNode createMinimalNode(int[] array, int start, int end) {
        if (array == null) return null;
        if (array.length == 0) return null;

        if (start < 0 || start > array.length - 1) return null;
        if (end < 0 || end > array.length - 1) return null;
        if (start > end) return null;

        final int parentIndex = (end + start) / 2;
        final int parentValue = array[parentIndex];
        TreeNode parentNode = new TreeNode(parentValue);
        parentNode.left = createMinimalNode(array, start, parentIndex - 1);
        parentNode.right = createMinimalNode(array, parentIndex + 1, end);
        return parentNode;
    }

    private static boolean isBalanced(Tree tree) {
        if (tree == null) return false;
        if (tree.root == null) return false;

        int isBalanced = isBalanced(tree.root);
        if (isBalanced >= 1) {
            return true;
        } else {
            return false;
        }
    }

    private static final int NOT_BALANCED = -1;

    public static int isBalanced(TreeNode node) {
        // if isBalanced, return tree height
        if (node == null) return 0;

        final int isLeftBalanced = isBalanced(node.left);
        if (isLeftBalanced == NOT_BALANCED) {
            return NOT_BALANCED;
        }

        final int isRightBalanced = isBalanced(node.right);
        if (isRightBalanced == NOT_BALANCED) {
            return NOT_BALANCED;
        }

        if (Math.abs(isLeftBalanced - isRightBalanced) > 1) {
            return NOT_BALANCED;
        }

        final int height = Math.max(isLeftBalanced, isRightBalanced) + 1;
        return height;
    }

    private static void moveDisks(int n, Stack origin, Stack destination, Stack buffer) {
        if (n <= 0) return;
        if (n == 1 && origin.size() >= 1) {
            moveTop(origin, destination);
            return;
        }

        // move n - 1 disks  from origin to buffer
        // move last disk    from origin to destination
        // move n - 1 disks  from buffer to destination

        moveDisks(n - 1, origin, buffer, destination);
        moveTop(origin, destination);
        moveDisks(n - 1, buffer, destination, origin);
    }

    private static void moveTop(Stack origin, Stack destination) {
//        System.out.println("origin.size() = " + origin.size());
//        if (origin.size() == 1 && destination.size() == 0) {
//            destination.push(origin.pop());
//        }
        if (origin.size() >= 1) {
//            System.out.println(origin.peek());
            if (destination.size() <= 0) {
                destination.push(origin.pop());
            } else {
                int originTop = (int) origin.peek();
                int destinationTop = (int) destination.peek();
                if (originTop < destinationTop) {
                    destination.push(origin.pop());
                }
            }
        }
    }

    private static boolean isPalindrome(List list) {
        if (list == null) return false;
        if (list.root == null) return false;
        if (list.root.next == null) return true;

        Stack stack = new Stack();
        Node slow = list.root;
        stack.push(slow);
        Node fast = list.root;

//        int length = 1;
        boolean needPop = false;
        while (fast != null) {
            if (fast.next != null) {
                fast = fast.next;
//                length++;
                if (fast.next != null) {
                    fast = fast.next;
//                    length++;
                    slow = slow.next;
                    stack.push(slow);
                } else {
                    break;
                }
            } else {
                needPop = true;
                break;
            }
        }

        if (needPop) {
            stack.pop();
        }

        boolean isPalindrome = true;
        while (slow != null) {
            slow = slow.next;
            if (slow != null) {
                Node before = (Node) stack.pop();
                System.out.println(slow.value);
                if (before.value != slow.value) {
                    isPalindrome = false;
                }
            }
        }

        return isPalindrome;
    }

    private static Node findBeginning(List list) {
        if (list == null) return null;
        if (list.root == null) return null;
        if (list.root.next == null) return null;

        Node slow = list.root;
        Node fast = list.root;

        // has circle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast != null && fast == slow) {
            // has a circle
            // fast is meeting node
            int circleLength = 0;
            while (fast != null && fast.next != null) {
                fast = fast.next;
                circleLength++;
                if (fast == slow) {
                    break;
                }
            }

            /*
            slow = list.root;
            fast = list.root;

            // walk circle length
            while (fast != null) {
                fast = fast.next;
                circleLength--;
                if (circleLength == 0) {
                    break;
                }
            }

            // get circle entry
            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next;
                if (slow != null && fast != null && slow == fast) {
                    return slow;
                }
            }
            */

            slow = list.root;
            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next;

                if (slow != null && fast != null && slow == fast) {
                    return slow;
                }
            }
        } else {
            return null;
        }

        return null;
    }

    private static Node getKthToLastNodeRunner(List list, int k) {
        if (list == null) return null;
        if (list.root == null) return null;

        Node runner1 = list.root;
        Node runner2 = list.root;

        int offset = k;
        while (offset > 0) {
            if (runner1 == null) return null;

            runner1 = runner1.next;
            offset--;
        }

        for (; runner1 != null; runner1 = runner1.next) {
            runner2 = runner2.next;
        }

        return runner2;
    }

    // k > 0
    private static Node kthToLast(List list, int k) {
        if (list == null) return null;
        if (list.root == null) return null;

        NodeWrapper resultWrapper = new NodeWrapper(null);
        countNode(list.root, k, resultWrapper);
        if (resultWrapper != null) {
            return resultWrapper.node;
        } else {
            return null;
        }

    }

    static final class NodeWrapper {
        public Node node;

        public NodeWrapper(Node node) {
            this.node = node;
        }
    }

    public static int countNode(Node node, int k, NodeWrapper resultWrapper) {
        if (node == null) return 0;
        final int count = countNode(node.next, k, resultWrapper);
        if (count == k -1) {
            resultWrapper.node = node;
        }
        return count + 1;
    }

    private static void deleteDupsRunner(List list) {
        if (list == null) return;
        if (list.root == null) return;

        Node current = list.root;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    private static void deleteDups(List list) {
        if (list == null) return;
        if (list.root == null) return;

        Collection collection = new LinkedList();
        Node previousNode = null;
        for (Node node = list.root; node != null; node = node.next) {
//            System.out.println(node.value);
            if (collection.contains(node.value)) {
                previousNode.next = node.next;
            } else {
                collection.add(node.value);
                previousNode = node;
            }
        }
    }

    private static boolean isRotation(String s1, String s2) {
        if (s1 == null) return false;
        if (s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        String s1s1 = s1 + s1;
        final boolean isRotation = isSubString(s1s1, s2);
        return isRotation;
    }

    public static boolean isSubString(String s1, String s2) {
        // s1: waterbottlewaterbottle
        // s2:erbottlewat
        if (s1 == null) return false;
        if (s2 == null) return false;

        if (s1.length() == 1 && s2.length() == 1 && s1.equals(s2)) return true;

        final KMPPP kmp = new KMPPP(s2);
        final int index = kmp.search(s1);
        System.out.println(index);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }



    private static void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0) {
                    rows[row] = true;
                    columns[column] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printAllMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void rotateMatrix(int[][] matrix, int length) {
        final int layer = length / 2;
        // topStart(row, row)
        // leftStart(length - 1 - row, row)
        // bottomStart(length - 1 - row, length - 1 - row)
        // rightStart(row. length - 1 - row)
        for (int row = 0; row <= layer; row++) {
            // top column++
            final int topStartRow = row;
            final int topStartColumn = row;
            // left row--
            final int leftStartRow = length - 1 - row;
            final int leftStartColumn = row;
            // bottom column--
            final int bottomStartRow = length - 1- row;
            final int bottomStartColumn = length - 1 - row;
            // right row++
            final int rightStartRow = row;
            final int rightStartColumn = length - 1 - row;
            // column [row, length - 1 - row - 1]
            for (int offset = 0; offset <= length - 1 - row - 1 - row; offset++) {
                // temp = top
                // top = left
                // left = bottom
                // bottom = right
                // right = top
                int temp = matrix[topStartRow][topStartColumn + offset];
                matrix[row][topStartColumn + offset] = matrix[leftStartRow - offset][leftStartColumn];
                matrix[leftStartRow - offset][leftStartColumn] = matrix[bottomStartRow][bottomStartColumn - offset];
                matrix[bottomStartRow][bottomStartColumn - offset] = matrix[rightStartRow + offset][rightStartColumn];
                matrix[rightStartRow + offset][rightStartColumn] = temp;
            }
        }
    }

    private static String compressString(String str) {
        if (str == null) return str;
        if (str == "") return str;
        if (str.length() == 1) return str;

        final char[] array = str.toCharArray();
        char lastChar = array[0];
        int count = 1;

        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] == lastChar) {
                // count chars
                count++;
            } else {
                // append count
                buffer.append(lastChar);
                buffer.append(count);
                count = 1;
            }

            lastChar = array[i];
        }
        buffer.append(lastChar);
        buffer.append(count);
        final String compressString = buffer.toString();
        if (compressString.length() < str.length()) {
            return compressString;
        } else {
            return str;
        }
    }

    public static final char[] REPLACE_ARRAY = "%20".toCharArray();
    public static final char SPACE = ' ';

    private static void replaceSpaces(char[] array, int length) {
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == SPACE) {
                spaceCount++;
            }
        }

//        System.out.println(spaceCount);
        if (spaceCount == 0) return;

        final int appendLength = spaceCount * (REPLACE_ARRAY.length - 1);
        int newEndIndex = length + appendLength - 1;
        int endIndex = length - 1;
//        System.out.println(newEndIndex);

        // move content(chars and space)
        // update newEndIndex, endIndex
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] == SPACE) {
                // handle other characters
                if (i < endIndex) {
                    newEndIndex = moveContent(array, i + 1, endIndex, newEndIndex);
                } else {
                    // only has space, no the others, do nothing
                }
                // handle space
                newEndIndex = pushSapce(array, newEndIndex);
                endIndex = i - 1;
            }
        }

        System.out.println(String.valueOf(array));
    }



    private static final int pushSapce(char[] array, int newEndIndex) {
        for (int i = REPLACE_ARRAY.length - 1; i >= 0; i--) {
            array[newEndIndex--] = REPLACE_ARRAY[i];
        }
        return newEndIndex;
    }

    private static final int moveContent(char[] array, int beginIndex, int endIndex, int newEndIndex) {
        if (array == null) return -1;
        if (array.length == 0) return -1;

        for (int i = endIndex; i >= beginIndex; i--) {
            array[newEndIndex--] = array[i];
        }

        return newEndIndex;
    }

    public static boolean isUniqueChars(String str) {
        final int CharacterLength = Character.MAX_VALUE - Character.MIN_VALUE - 1;
        if (str.length() > (CharacterLength)) {
            return false;
        }

        boolean[] appearances = new boolean[CharacterLength];
        for (char c : str.toCharArray()) {
            if (appearances[c]) {
                return false;
            } else {
                appearances[c] = true;
            }
        }

        return true;
    }

    public static boolean permutation(String s, String t) {
        if (s == null) return false;
        if (t == null) return false;
        if (s.length() != t.length()) return false;

        final HashMap<Character, Integer> times = new HashMap<Character, Integer>(s.length());
        for (Character c : s.toCharArray()) {
            if (times.get(c) == null) {
                times.put(c, 1);
            } else {
                times.put(c, times.get(c) + 1);
            }
        }

        for (Character c : t.toCharArray()) {
            if (times.get(c) == null) {
                return false;
            } else {
                times.put(c, times.get(c) - 1);
            }
        }

        return true;
    }






}
