package org.dsa.basic;

import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* prime number or not
* */
public class Program5 {

    public static void checkPrime(int num){
        if(num==2){
            System.out.println("Prime");
        }else{
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number ");
        int num = new Scanner(System.in).nextInt();
        checkPrime(num);
    }
}
