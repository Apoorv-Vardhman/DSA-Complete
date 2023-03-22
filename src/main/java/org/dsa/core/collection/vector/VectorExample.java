package org.dsa.core.collection.vector;

import java.util.List;
import java.util.Vector;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.remove(0);
        System.out.println(vector);
    }
}
