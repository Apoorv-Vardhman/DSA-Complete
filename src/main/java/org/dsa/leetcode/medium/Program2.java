package org.dsa.leetcode.medium;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program2 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int j=0,i=0;
        Set<Character> set = new HashSet<>();
        while (j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(),max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("qrsvbspk"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
