package day14_String;

public class emailTask1 {
    public static void main(String[] args) {
        String email="mike_tyson@gmail.com";
        String first=email.substring(0,email.indexOf("_"));
        String last=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String rest=email.substring(email.indexOf("@"));

        email = last +"_"+first+rest;
        System.out.println(email);
    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and
       followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */