package day15_ForLoop;

import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num<0){
            System.out.println("Invalid Number");
        }else{
            int sum=0;
            for (int i = 0; i < num; i++) {
                sum+= i;

            }
            System.out.println("sum = " + sum);
        }





    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */