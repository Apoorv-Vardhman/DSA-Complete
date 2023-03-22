package org.dsa.leetcode.basic;

import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program4 {
    /*public static int lengthOfLastWord(String s) {
        String[] lastWord = s.split(" ");
        return lastWord[lastWord.length-1].length();
    }*/

    public static int lengthOfLastWord(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        String word = "";
        while (stringTokenizer.hasMoreTokens()){
            word = stringTokenizer.nextToken();
        }
        return word.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord( "Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
