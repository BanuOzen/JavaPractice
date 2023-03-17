package day13_String;

import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String str= scan.next();

        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        if(f==l){
            System.out.println("Character is same");
        }else{
            System.out.println("Character is not same");
        }

        scan.close();

    }
}
/*
3. write a program that can check if the first and
 last characters of the string are same
            ex:
                level
            output:
                same

 */