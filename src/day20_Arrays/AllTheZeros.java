package day20_Arrays;

import java.util.Arrays;

public class AllTheZeros {
    public static void main(String[] args) {

        int[] num = {10, 0, 5, 0, 1, 0};
        int[] zero = new int[num.length];
        int j = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] != 0){
                zero[j++] = num[i];
            }

        }
        System.out.println(Arrays.toString(zero));

    }
}
/*
 write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */