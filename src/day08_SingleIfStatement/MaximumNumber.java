package day08_SingleIfStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        String result ="";
        if(n1>n2){
            result = n1 + " is maximum number ";
        }
        if(n2>n1){
            result = n2 + " is maximum number";
        }
        System.out.println(result);
    }
}
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number


 */