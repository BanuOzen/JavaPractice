package day19_RecapLoopAndString;

import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();
            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            int area = side * side * side;
            int perimeter = 3 * side;
            System.out.println("area of square= " + area);
            System.out.println("perimeter of square = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            String answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                System.exit(0);
            }
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry, Please re-enter");
                answer = scan.next().toLowerCase();
            }
        }



    }
}
/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */