package day16_collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 5));

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(2, 3, 4));

        Set<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);



    }

}

/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */