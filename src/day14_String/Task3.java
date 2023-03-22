package day14_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter Screen Size choice : 13.3 - 15.0 or 17.3");
       String screenSize = input.next();
        System.out.println("Please enter CPU type choice : i3 - i5 or i7");
        String cpuType = input.next();
        System.out.println("Please enter RAM size choice that is divisible by 4 : ");
        double RAMsize = input.nextDouble();
        System.out.println("Please enter choice of Storage type HDD or SSD");
        String storageType = input.next();
        System.out.println("Please enter a storage size that is divisible by 500");
        double storageSize = input.nextDouble();
        System.out.println("Please enter screen resolution choice, FULLHD or 4K");
        String screenResolution = input.next();
        double ScreenCost = 0;
        double CpuCost = 0;
        double RamCost ;
        double StorageCost = 0;
        double ResolutionCost = 0;
        switch (screenSize){
            case("13.3"):ScreenCost = 200;
            break;
            case ("15.0"):ScreenCost = 300;
            break;
            case("17.3"): ScreenCost = 400;
            break;
            default:
                System.out.println("Please enter valid screen size");
        }
        switch (cpuType){
            case("i3"):CpuCost = 150;
                break;
            case ("i5"):CpuCost = 250;
                break;
            case("i7"): CpuCost = 350;
                break;
            default:
                System.out.println("Please enter valid screen size");
        }
        RamCost = (RAMsize/4)*50;
        switch (storageType){
            case("HDD"):StorageCost=(storageSize/500)*50;
            break;
            case("SSD"):StorageCost=(storageSize/500)*100;
            break;
            default:
                System.out.println("Please check your storage choices");
        }
        if(screenResolution.equals("FULLHD")){
            ResolutionCost+=100;
        }else ResolutionCost+=200;
        System.out.println("Laptop price is: $" + (ScreenCost+CpuCost+StorageCost+RamCost+ResolutionCost));

    }
}
/*
### Create a program that will build a custom computer by selecting each part and
 computing the total price. Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

 */