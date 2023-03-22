package org.dsa.leetcode.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program7 {
    /*public static String toLowerCase(String s) {
        return s.toLowerCase();
    }*/

    /*public static String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                ch += 32;
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }*/

    public static String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch += 32;
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }
}
