package de.beefcafe.oop.basics.iterator;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorPlayground {

    private static int sumArray(Collection<Integer> coll) {
        int sum = 0;
        Integer[] objects = coll.toArray(new Integer[coll.size()]);
        for (int i = 0; i < objects.length; i++) {
            sum = sum + objects[i];
        }
        return sum;
    }

/*    private static int sumIterator(Collection<Integer> coll) {
        int sum = 0;

        return sum;
    }*/

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(47);
        coll.add(11);
        coll.add(23232);
        int sum = sumArray(coll);
        System.out.println(sum);
    }

}
