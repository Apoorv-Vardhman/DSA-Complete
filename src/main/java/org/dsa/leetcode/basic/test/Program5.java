package org.dsa.leetcode.basic.test;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program5 {
    /*public static void reverseString(char[] s) {
        StringBuilder stringBuilder = new StringBuilder(new String(s)).reverse();
        for(int i=0;i<stringBuilder.length();i++){
            s[i] = stringBuilder.charAt(i);
        }
        System.out.println(s);
    }*/
    public static void reverseString(char[] s) {
        int len = s.length;
        for(int i=0;i<len/2;i++){
            s[i] = (char)(s[i]+s[len-i-1]);
            s[len-i-1] = (char)(s[i]-s[len-i-1]);
            s[i] = (char)(s[i]-s[len-i-1]);
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
}
