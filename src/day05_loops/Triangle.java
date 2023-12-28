package day05_loops;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print("\t\t\t\t");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
/*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */