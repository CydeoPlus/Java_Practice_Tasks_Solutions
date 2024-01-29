package day08_String;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word");
        String secondWord = scan.next();

        scan.close();

        String result = "";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){
            result = firstWord+ secondWord.substring(1);
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);

    }

}

/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */