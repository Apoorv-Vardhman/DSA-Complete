package org.dsa.leetcode.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program11 {
    public static int mySqrt(int x) {
        if (x < 2)
            return x;
        double y = x;
        double z = (y + (x / y)) / 2;
        while (Math.abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2;
        }
        return (int)z;
    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(4));
    }
}
