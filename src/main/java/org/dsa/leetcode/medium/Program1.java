package org.dsa.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Program1 {
    public static String reverseWords(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        List<String> words = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            words.add(stringTokenizer.nextToken());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=words.size()-1;i>=0;i--){
            stringBuilder.append(words.get(i));
            if(i!=0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
}
