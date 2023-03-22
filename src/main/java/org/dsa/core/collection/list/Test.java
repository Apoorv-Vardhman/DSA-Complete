package org.dsa.core.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(20);
        list.add(1);
        boolean a = list.remove((Integer)1);
        System.out.println(list);
    }
}
