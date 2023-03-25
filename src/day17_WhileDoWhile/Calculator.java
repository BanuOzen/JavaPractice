package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1= scan.nextInt();

        System.out.println("Enter Second Number:");
        int num2= scan.nextInt();

        System.out.println("Enter a match operator: ");
        char ch=scan.next().charAt(0);

        while( !(ch=='+' || ch=='-') ){
            System.err.println("Invalid Operator, Please re-enter");
            ch=scan.next().charAt(0);
        }

        if(num1>0 && num2>0){
            System.out.println(num1+num2);
        }


    }
}
/*1. Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.

 */