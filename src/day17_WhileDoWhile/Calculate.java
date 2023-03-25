package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1=scan.nextInt();

        System.out.println("Enter second number:");
        int num2=scan.nextInt();

        System.out.println("Enter a match operator:");
        char ch =scan.next().charAt(0);

        while(! (ch=='+'|| ch=='-' || ch=='/' || ch=='*') ){
            System.err.println("Invalid match operator, Please re-enter");
            ch=scan.next().charAt(0);
        }

        double result=0;
        if(ch=='+'){
            result=(num1+num2);
        }else if(ch=='-'){
            result=(num1-num2);
        }else if(ch=='*'){
            result=(num1*num2);
        }else{
            result=+(num1/num2);
        }
        System.out.println(result);
        scan.close();
    }
}

/*
3. Write a program to ask user to enter two number and math operator,
 and return the result.

   if the operator is invalid operator, ask user to re-enter
 the operator until user provides a valid operator (+, -, *, /)


 */