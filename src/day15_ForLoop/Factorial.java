package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num= scan.nextInt();

        if(num<0){
            System.out.println("Invalid");
        }else{
            int factor=1;
            for (int i = 1; i <= num; i++) {
                factor *= i ;
            }
            System.out.println("factor = " + factor);

        }




    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */