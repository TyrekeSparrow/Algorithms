package com.michael.offer;

public class NumberOf1Between1AndN {
    public static void main(String[] args) {
//        NumberOf1Between1AndN n = new NumberOf1Between1AndN();
//        int number = n.NumberOf1Between1AndN(21345);
//        int number = numberOf1BetweenAndN(21345);
//        System.out.println(number);


//        double value = Math.pow(10, 2);
//        System.out.println(value);
//        int n = 3;
//        if (n < value) {
//            System.out.println("3 < 100.0");
//        }
//        int i  = 100;
//        if (i == value) {
//            System.out.println("100 == 100.0");
//        } else {
//            System.out.println("not 100 == 100.0");
//        }
//
//        int j = 199;
//        if (j > value) {
//            System.out.println("j > 100.0");
//        } else {
//            System.out.println("not j > 100.0");
//        }

        int n = 21345;
        int count = number1(n);
        System.out.println("count = " + count);






    }


    /*
    public int NumberOf1Between1AndN(int n) {
        if (n <= 0)
            return 0;
        char[] chars = String.valueOf(n).toCharArray();
        return numberOf1(chars, 0);
    }

    private int numberOf1(char[] chars, int lo) {
        if (lo == chars.length)
            return 0;
        int first = chars[lo] - '0';
        int length = chars.length - lo;
        if (length == 1 && first == 0)
            return 0;
        else if (length == 1 && first > 0)
            return 1;
        //首位为1的数目
        int numAtFirst = 0;
        if (first > 1)
            numAtFirst = power10(length - 1);
        else if (first == 1) {
            numAtFirst = Integer.valueOf(String.valueOf(chars, lo + 1, length - 1)) + 1;
        }
        //其余位为1的数目
        int numOfOther = first * (length - 1) * power10(length - 2);
        //递归
        int numRecursive = numberOf1(chars, lo + 1);

        return numAtFirst + numOfOther + numRecursive;
    }

    private int power10(int n) {
        int r = 1;
        for (int i = 0; i < n; i++)
            r *= 10;
        return r;
    }
    */

    /*
    public static int numberOf1BetweenAndN(int n){
        if(n<=0){
            return 0;
        }
        String str=n+"";
        return numberOf1(str);
    }
    public static int numberOf1(String str){
        char[] strN=str.toCharArray();
        int length=strN.length;
        if(length==1&&strN[0]=='0'){
            return 0;
        }
        if(length==1&&strN[0]>'1'){
            return 1;
        }
        int numFirstDigit=0;
        if(strN[0]>'1')
            numFirstDigit=(int) Math.pow(10,length-1);
        else if(strN[0]=='1')
            numFirstDigit=Integer.parseInt(str.substring(1))+1;
        int numOtherDigits=(int) ((strN[0]-'0')*(length-1)*Math.pow(10, length-2));
        int numRecursive=numberOf1(str.substring(1));
        return numFirstDigit+numOtherDigits+numRecursive;

    }
    */
    private static final int TEN = 10;

    public static int number1(int numerator) {
        int count1 = 0;
        int power = 1;
        while (numerator >= Math.pow(TEN, power)) {
            // numerator 被除数 denominator 除数 quotient 商 remainder 余数
            final int denominator = (int) Math.pow(TEN, power);
            final int quotient = (int) (numerator / denominator);
            int countPower = (int) (quotient * Math.pow(TEN, power - 1));

            // remainder > 0
            final int remainder = numerator % denominator;
            final int betweenValue = (int) Math.pow(TEN, power - 1);
            System.out.printf(" betweenValue = " + betweenValue);
            final int startValue = (int) (denominator * quotient + betweenValue);
            if (remainder > 0 && numerator >= startValue) {
                int endValue = startValue + betweenValue - 1;
                int endCountValue = (numerator <= endValue ? numerator : endValue);
                int appendCount = endCountValue - startValue + 1;
                countPower = countPower + appendCount;
            }

            System.out.println(" countPower = " + countPower);
            count1 = count1 + countPower;

            power++;
        }

        if (numerator < Math.pow(TEN, power)) {
            final int startCountValue = (int) Math.pow(TEN, power - 1);
            final int betweenValue = (int) Math.pow(TEN, power - 1);
            System.out.printf(" betweenValue = " + betweenValue);
            final int endValue = startCountValue + betweenValue - 1;
            final int endCountValue = (numerator <= endValue ? numerator : endValue);
            final int appendCount = endCountValue - startCountValue + 1;
            count1 = count1 + appendCount;
            System.out.println(" countPower = " + appendCount);
        }

        return count1;
    }





}

