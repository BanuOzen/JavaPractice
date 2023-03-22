package day14_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double screenPrice =0;
        double CPUTypePrice = 0;
        double RAMPrice ;
        double storagePrice = 0;
        double resolutionPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        if (screenSize == 13.3){
            screenPrice = 200;
        } else if (screenSize == 15.0) {
            screenPrice = 300;
        } else if (screenSize == 17.3) {
            screenPrice = 400;
        }


        System.out.println("Select CPU type:");
        String CPUType = input.next();
        if (CPUType.equals("i3") ){
            CPUTypePrice = 150;
        } else if (CPUType.equals("i5")) {
            CPUTypePrice = 250;
        } else if (CPUType.equals("i7") ) {
            CPUTypePrice = 350;
        }


        System.out.println("Select RAM size:");
        double RAMSize = input.nextDouble();
        RAMPrice = (RAMSize/4) * 50;

        System.out.println("Select storage type:");
        String storageType = input.next();


        System.out.println("Select storage size:");
        double storageSize = input.nextDouble();
        if (storageType.equals("HDD")){
            storagePrice = (storageSize/500) * 50;
        } else if (storageType.equals("SSD") ) {
            storagePrice = (storageSize/500) * 100;
        }


        System.out.println("Select screen resolution:");
        String resolution = input.next();
        if (resolution.equals("FULLHD") ){
            resolutionPrice = 100;
        } else if (resolution.equals("4K")) {
            resolutionPrice = 200;
        }


        double totalPrice = screenPrice + CPUTypePrice + RAMPrice + storagePrice + resolutionPrice;

        System.out.println("Final price is: $" + totalPrice);

        input.close();



    }

}


