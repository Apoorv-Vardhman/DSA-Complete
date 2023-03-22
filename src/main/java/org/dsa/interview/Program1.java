package org.dsa.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
* find missing number from array without shorting
* */
public class Program1 {

    public static void main(String[] args) {
        int[] number = {4,5,7,3,2,1};
        int max = Arrays.stream(number).max().getAsInt();
        int min = Arrays.stream(number).min().getAsInt();
        int sum = Arrays.stream(number).sum();
        int requiredSum = IntStream.range(min,max+1).sum();
        System.out.println(requiredSum-sum);
    }
}
