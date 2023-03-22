package org.dsa.leetcode.basic;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program10 {
    public static int removeDuplicates(int[] nums) {
        int unique_count = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=nums[unique_count]){
                nums[++unique_count] = nums[i];
            }
        }
        return ++unique_count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
