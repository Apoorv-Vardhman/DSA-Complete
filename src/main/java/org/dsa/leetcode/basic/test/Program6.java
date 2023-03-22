package org.dsa.leetcode.basic.test;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program6 {
    public static String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        if(s.length()<k){
            stringBuilder.append(new StringBuilder(s).reverse());
        }else{
            int count = 0;
            for(int i=0;i<s.length();i+=k){
                int last = i+k;
                if(last>s.length()){
                    if(count%2==0){
                        stringBuilder.append(new StringBuilder(s.substring(i)).reverse());
                    }else{
                        stringBuilder.append(s,i,s.length());
                    }
                }else{
                    if(count%2==0){
                        stringBuilder.append(new StringBuilder(s.substring(i,i+k)).reverse());
                    }else{
                        stringBuilder.append(s, i, i+k);
                    }
                }
                count++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
        System.out.println(reverseStr("abcd",2));
        System.out.println("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl".length());
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));
    }
}
