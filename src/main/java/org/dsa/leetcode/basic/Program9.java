package org.dsa.leetcode.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program9 {
    /*public static boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(unique.contains(nums[i])){
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }*/

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] ==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
