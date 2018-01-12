package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class Power {
    public static void main(String[] args) {
        // base exponent
        // -2 -4 -1/32

        double base = -2;
        int exponent = -3;
        double result = power(base, exponent);
        System.out.println("result = " + result);
    }

    public static double power(double base, int exponent) {
        // check input
        if (base == 0) return 0;
        if (exponent == 0) return 1;

        // unsigned exponent
        int unsignedExponent = 0;
        if (exponent < 0) {
            unsignedExponent = Math.abs(exponent);
        } else {
            unsignedExponent = exponent;
        }
        double powerUnsignedExponent  = powerUnsignedExponent(base, unsignedExponent);
        System.out.println("powerUnsignedExponent = " + powerUnsignedExponent);
        if (exponent < 0) {
            return 1.0/powerUnsignedExponent;
        } else {
            return powerUnsignedExponent;
        }
    }

    public static double powerUnsignedExponent(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;

        double result = powerUnsignedExponent(base, exponent >> 1);
        result *= result;

        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }







}
