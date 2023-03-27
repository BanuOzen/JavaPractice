package day19_RecapLoopAndString;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter the radius of the circle: ");
            double radius = scan.nextDouble();
            double pi = 3.14;

            if(radius<=0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("Diameter of circle:"+(radius*2));
            System.out.println("Area of circle:" +(radius*radius*pi));
            System.out.println("Perimeter of circle:" +(2*radius*pi));

            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next().toLowerCase();
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
            while( !(answer.equals("no")|| answer.equals("yes"))){
                System.err.println("Invalid Entry, Please re-enter");
                answer=scan.next().toLowerCase();
            }
        }






    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				 "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


 */