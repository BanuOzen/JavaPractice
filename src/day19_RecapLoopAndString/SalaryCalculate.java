package day19_RecapLoopAndString;

import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                break;
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();
            if(weeklyHour<1 && weeklyHour>144){
                System.err.println("Invalid Entry for Weekly Hours");
                break;
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();
            if(taxRate<0 && taxRate>0.1){
                System.err.println("Invalid Entry for state tax Rate");
                break;
            }
            double salaryBeforeTax = hourlyRate*weeklyHour*52;
            double federalTax = salaryBeforeTax*0.26;
            double stateTax = salaryBeforeTax*taxRate;
            double totalTax = federalTax+stateTax;
            double netIncome = salaryBeforeTax-totalTax;

            System.out.println("salaryBeforeTax = " + salaryBeforeTax);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
            }
                while( !(answer.equals("no") || answer.equals("yes"))){
                    System.err.println("Invalid Entry");
                    System.exit(0);
                }

        }



    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message
					 "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program
					after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after
					displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


 */