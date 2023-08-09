package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) {
                intList2.add(x);
            }
        }
        intList2.sort(Comparator.naturalOrder());
        for (int x : intList2) {
            System.out.println(x);
        }

        //Stream<String> stream2 = stream1.filter(x->x.length()==3);
        //stream1 = stream2.map(String::toUpperCase);
        //stream1.forEach(System.out::println);
        //stream1.forEach(x-> System.out.println(x+" "));

    }
}