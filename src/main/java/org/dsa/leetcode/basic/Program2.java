package org.dsa.leetcode.basic;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program2 {
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while (num>0){
            int reminder = num%10;
            reverse = reverse*10 + reminder;
            num/=10;
        }
        if(temp==reverse)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
