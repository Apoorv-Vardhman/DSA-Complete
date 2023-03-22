package org.dsa.leetcode.basic.test;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program4 {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative){
            x = x * -1;
        }
        int reverse = 0;
        while (x>0){
            int reminder = x%10;
            long number = reverse* 10L + reminder;
            if(number>Integer.MAX_VALUE)
                return 0;
            reverse = (int) number;
            x /= 10;
        }
        return isNegative ? reverse *-1 : reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(scanner.nextInt()));
    }
}
