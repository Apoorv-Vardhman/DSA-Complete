package org.dsa.leetcode.medium;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program4 {
    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = expandRange(s,i,i);
            int len2 = expandRange(s,i,i+1);
            int len = Math.max(len1,len2);
            if(end-start <len){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expandRange(String s,int begin,int end){
        while (begin>=0 && end<s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        return end-begin-1;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome("babad"));
    }
}
