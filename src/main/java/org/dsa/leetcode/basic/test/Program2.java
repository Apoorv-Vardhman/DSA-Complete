package org.dsa.leetcode.basic.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program2 {
    public static int romanToInt(String s) {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int number = 0;
        for(int i=0;i<s.length();i++){
            if(i!=0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i-1)) ){
                number+= roman.get(s.charAt(i)) - 2* roman.get(s.charAt(i-1));
            }else{
                number+=roman.get(s.charAt(i));
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        System.out.println("Enter roman number ");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int romanNumber = roman.get(num.charAt(num.length()-1));
        for(int i=num.length()-2;i>=0;i--){
            if(roman.get(num.charAt(i))<roman.get(num.charAt(i+1))){
                romanNumber-= roman.get(num.charAt(i));
            }else{
                romanNumber+= roman.get(num.charAt(i));
            }
        }
        System.out.println(romanNumber);
        System.out.println(romanToInt(num));
    }
}
