package org.dsa.leetcode.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program12 {

    /*public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.length()> haystack.length()-i)
                    return -1;
                for(int j=0;j<needle.length();j++){
                    if(needle.charAt(j)==haystack.charAt(i+j)){
                        if(j==needle.length()-1)
                            return i;
                    }else{
                        break;
                    }
                }
            }
        }
        return -1;
    }*/

    /*public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }*/

    public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issipi"));
        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","leeto"));
        System.out.println(strStr("abc","c"));
        System.out.println(strStr("mississippi","sipp"));
    }
}
