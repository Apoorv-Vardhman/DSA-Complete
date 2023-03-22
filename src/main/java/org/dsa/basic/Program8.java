package org.dsa.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* trib sequence
* */
public class Program8 {

    private static void trib(int num){
        int[] trib = new int[num];
        int a = 0;
        int b = 1;
        int c = 1;
        trib[0] = a;
        trib[1] = b;
        trib[2] = c;
        for(int i=3;i<num;i++){
            trib[i] = a+b+c;
            a = b;
            b=c;
            c= trib[i];
        }
        System.out.println(Arrays.toString(trib));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        trib(num);
    }
}
