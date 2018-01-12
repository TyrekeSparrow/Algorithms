package com.pop900.algorithm.fundamenal;

/**
 * Created by michael on 17-9-9.
 */
public class ReverseArray {
    /*
    a b c d e
    g j o e q
    f g q e r
    h o p q e
    g h p r q
to
    a g f h g
    b j g o h
    c o q p p
    d e e q r
    e q r e q

    */




    public static void main(String[] args) {
//        String[][] array = new String[5][5];
        String[][] array = {  {"a", "b", "c", "d", "e"}
                            , {"g", "j", "o", "e", "q"}
                            , {"f", "g", "q", "e", "r"}
                            , {"h", "o", "p", "q", "e"}
                            , {"g", "h", "p", "r", "q"}
        };
//        String[][] array = new String[3][5];
        System.out.println("array lengthh = " + array.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf(" "+ array[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf(" "+ array[j][i]);
            }
            System.out.println();
        }







    }
}
