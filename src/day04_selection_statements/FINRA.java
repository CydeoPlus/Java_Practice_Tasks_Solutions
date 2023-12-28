package day04_selection_statements;

public class FINRA {

    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FINRA";
        } else if (number % 5 == 0) {
            result = "RA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else {
            result = "" + number;
        }

        System.out.println("result = " + result);

    }

}
/*
3. Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
 */