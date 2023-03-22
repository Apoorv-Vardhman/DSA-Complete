package org.dsa.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 02. sum of 'n' natural numbers
* */
public class Program2 {
    private static int naturalNumSum(int num){
        int sum = 0;
        for(int i=0;i<num;i++){
            sum+=i;
        }
        return sum;
    }

    public static int naturalNumSum1(int num){
        return (num*(num-1))/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = scanner.nextInt();
        System.out.println("Sum is "+naturalNumSum(num));
        System.out.println("Sum is "+naturalNumSum1(num));
    }
}
