package day15_ForLoop;

import java.util.Scanner;

public class LetterDigitSpecial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to write");
        String str = scan.next();

        String digits="";
        String letter="";
        String specialChar="";

        for(int i =0 ; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='0'&& ch<='9'){
                digits += ch;
            }else if(ch>='A' && ch<='Z'){
                letter+=ch;
            }else if(ch>='a' && ch<='z'){
                letter+=ch;
            }else{
                if(ch!=' '){
                    specialChar+=ch;
                }
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);


    }
}
/*
 5. write a program that can  the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */