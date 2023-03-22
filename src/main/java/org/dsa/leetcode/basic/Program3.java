package org.dsa.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program3 {
    public static int romanToInt(String s){
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result = 0;
        for(int i=0;i<s.length();i++){
            if(i>0 && romanMap.get(s.charAt(i))> romanMap.get(s.charAt(i-1))){
                result += romanMap.get(s.charAt(i))- 2* romanMap.get(s.charAt(i-1));
            }else {
                result = result+romanMap.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
