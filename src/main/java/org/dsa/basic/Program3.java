package org.dsa.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 03. factorial of the given number
* 5 = 5*4*3*2*1
* */
public class Program3 {

    private static int factorial(int num){
        int fact = 1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("factorial is "+factorial(5));
    }
}
