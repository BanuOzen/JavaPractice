package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOddNumberCount {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 6, 7, 8, 9};
        int countOdd = 0;
        int countEven = 0;

        for (int each : num) {
            if(each % 2 ==0){
                countEven++;
            }
            if(each % 2 !=0){
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(num) + " Even numbers are " + countEven + " Odd numbers are " + countOdd);

    }
}
