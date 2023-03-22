package org.dsa.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 01. max of two numbers
* */
public class Program1 {
    private static int maxNumber(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 ");
        int num2 = scanner.nextInt();
        System.out.println("Max number "+maxNumber(num1,num2));
    }
}
