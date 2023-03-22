package org.dsa.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* 04. swaping of two integer values
* */
public class Program4 {

    static public void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping num1 is "+num1+" and num2 is "+num2);
    }

    static public void swap1(int num1,int num2){
        num1 = num2+num1;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swapping num1 is "+num1+" and num2 is "+num2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping num1 is "+num1+" and num2 is "+num2);
        swap(num1,num2);
        swap1(num1,num2);

    }
}
