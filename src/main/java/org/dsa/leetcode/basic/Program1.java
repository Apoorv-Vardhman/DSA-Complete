package org.dsa.leetcode.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
/*
*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
* Input: nums = [3,2,4], target = 6
Output: [1,2]
* */
public class Program1 {
    /*private static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=1;j<numbers.length;j++){
                if( i!=j && numbers[i]+numbers[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }*/
    private static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int delta = target - nums[i];
            if(map.containsKey(delta)){
                return new int[]{i,map.get(delta)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3},6)));

    }
}
