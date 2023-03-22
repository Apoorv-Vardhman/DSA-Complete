package org.dsa.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program1 {
    private static void array1(){
        int[] array = new int[10];
        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        /*print array*/
        System.out.println(Arrays.toString(array));
    }

    private static void array2(){
        int[] array = new int[10];
        for(int i=0;i<10;i++){
            array[i] = (int)(Math.random()*10000);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        array1();
        array2();

    }
}
