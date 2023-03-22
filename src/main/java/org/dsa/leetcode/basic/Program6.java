package org.dsa.leetcode.basic;

import java.util.Arrays;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program6 {
    /*public static int removeElement(int[] nums, int val) {
        int count = 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return nums.length-count;
    }*/
    public static int removeElement(int[] nums, int val){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
