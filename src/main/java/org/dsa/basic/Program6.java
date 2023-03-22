package org.dsa.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* max of three numbers
* */
public class Program6 {
    private static void maxNumber(int num1,int num2,int num3){
        if(num1>=num2 && num1>=num3){
            System.out.println("Max is "+num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println("Max is "+num2);
        }else{
            System.out.println("Max is "+num3);
        }
    }
    public static void main(String[] args) {
        maxNumber(10,20,30);
    }
}
