package com.ocp.day23;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class SetDemo2 {

    public static void main(String[] args) {
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);

        Iterator a = scores.iterator();
        while (a.hasNext()) {

            Object next = a.next();
            if (next instanceof Integer) {
                Integer score = (Integer) next;
                if (score < 0 || score > 100) {
                    a.remove();
                }
            } else {
                a.remove();
            }
        }//a用完了
        System.out.println(scores);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int sum = 0;

        Iterator b = scores.iterator();
        while (b.hasNext()) {
            Object next = b.next();

            if (next instanceof Integer) {

                sum += (Integer) next;
            }
        }
        System.out.println(sum);

    }

}
