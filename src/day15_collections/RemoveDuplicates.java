package day15_collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);


    }
}

/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers,
removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */