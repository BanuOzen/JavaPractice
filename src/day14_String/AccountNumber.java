package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number: ");
        String acNum=scan.next();
        scan.close();



        if(acNum.charAt(0)=='2') {
            if(acNum.length()==7){
                System.out.println("valid");
            }
        }else if(acNum.charAt(0)=='5'){
            if(acNum.length()==10){
                System.out.println("valid");
            }
        }
            System.out.println("Invalid account number");







    }
}
/*
 6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */