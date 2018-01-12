package com.pop900.algorithm;

/**
 * Created by michael on 16-11-14.
 */
public class Str2Int {
    public static void main(String[] args) {
        // string 2 int
        String s = "meituanwangjing321";
        try {
            string2Integer(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static int string2Integer(String s) throws Exception {
        // char size
        // compute total


        int l = s.length();
        System.out.println("l = " + l);
        int ii = Integer.MAX_VALUE;
        System.out.println("i = " + ii);

        if (l > 10) {
            throw new NumberFormatException("format is not well");
        } else {
            for (int i = 0; i < l; i++) {
                char c = s.charAt(i);


            }





        }
        // 1 <= 10 //TODO
        // 2 every char is int
        // 3 compute total





        // return size is tool long
        // format is not well


        return 0;








    }





}
