package org.dsa.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* fib sequence
* */
public class Program7 {
    private static void fab(int num){
        int[] fab = new int[num];
        int a = 0;
        int b = 1;
        fab[0] = a;
        fab[1] = b;
        for (int i=2;i<num;i++){
            int c = a+b;
            fab[i] = c;
            a = b;
            b = c;
        }
        System.out.println(Arrays.toString(fab));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = scanner.nextInt();
        fab(num);
    }
}
