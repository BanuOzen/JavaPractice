package day14_String;

import java.util.Scanner;

public class WithoutFirst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter to first word:");
        String s1 = scan.next();

        System.out.println("Enter to second word:");
        String s2=scan.next();

        String str1=s1.substring(1);
        String str2=s2.substring(1);

        System.out.println(str1+str2);
    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */