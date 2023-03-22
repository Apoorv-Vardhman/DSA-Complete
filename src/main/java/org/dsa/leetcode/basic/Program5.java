package org.dsa.leetcode.basic;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program5 {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i]++;
                break;
            }
        }
        if(digits[0]==0){
            int[] rst = new int[digits.length + 1];
            rst[0] = 1;
            return rst;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
}
