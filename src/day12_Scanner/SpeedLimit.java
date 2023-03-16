package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int speedLimit=55;

        System.out.println("Enter current speed: ");
        int currentSpeed=scan.nextInt();
        if(currentSpeed>0){
            if(currentSpeed>speedLimit){
                System.out.println("You are driving " + (currentSpeed-speedLimit)+ " mph over the limit.Slow down!");
            }else{
                System.out.println("Speed Limit");
            }

        }else{
            System.out.println("Please enter valid value");
        }




    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned,
 ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
 otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */