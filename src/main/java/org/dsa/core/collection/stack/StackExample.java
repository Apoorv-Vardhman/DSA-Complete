package org.dsa.core.collection.stack;

import java.util.Enumeration;
import java.util.Stack;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        stack.pop();
        System.out.println(stack);
        Enumeration<Integer> enumeration = stack.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
