package day19_RecapLoopAndString;

import java.util.Scanner;

public class GradCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();
            if (score > 0 && score <= 100) {
                if (score >= 90 && score <= 100) {
                    System.out.println("A");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }


            } else {
                System.err.println("Invalid Score");
                System.exit(0);
            }

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Answer,Please re-enter");

                answer=scan.next().toLowerCase();
            }
        }

    }

}
/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */