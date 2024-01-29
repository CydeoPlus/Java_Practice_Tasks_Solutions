package day08_String;

import java.util.Scanner;

public class FormatFirstLastNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        firstName = format(firstName);
        lastName = format(lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        input.close();
    }

    public static String format(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

}
/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */