package day04_selection_statements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        /*
        in order for a to be the median in three different numbers:
                1. if c is the maximum number & b is the minimum number, then a is the median number
                2. if b is the maximum number & c is the minimum number, then a is the median number
        */

        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        /*
        in order for b to be the median number in three different numbers:
                1. if a is the maximum number & c is the minimum number, then a is the median number
                2. if c is the maximum number & a is the minimum number, then a is the median number
        */

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        } else if (bIsMedian) {
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }

    }

}
/*
2. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */