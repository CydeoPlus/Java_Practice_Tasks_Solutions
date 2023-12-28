package day04_selection_statements;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';

        boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        String result;

        if (validGrade) {

            if (grade == 'A') {
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid Grade";
        }

        System.out.println(grade);

    }

}
/*
5. Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job

 */