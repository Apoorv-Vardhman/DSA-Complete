package org.dsa.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Test {
    public static void main(String[] args) {
        String s = "apoorva raj";
        Map<Character,Integer> result = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                if(result.containsKey(ch)){
                    result.put(ch,result.get(ch)+1);
                }else {
                    result.put(ch,1);
                }
            }
        }
        result.forEach((key,val)->{
            if(isVowel(key)){
                System.out.println(key+"=>"+val);
            }
        });
    }

    private static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch== 'o' || ch=='u';
    }
}
