package org.dsa.leetcode.basic.test;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program3 {
    public static String intToRoman(int num) {
        int[] intNumbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<intNumbers.length;i++){
            while (num>=intNumbers[i]){
                stringBuilder.append(symbols[i]);
                num -= intNumbers[i];
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        System.out.println(intToRoman(num));
    }
}