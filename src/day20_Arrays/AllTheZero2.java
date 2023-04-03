package day20_Arrays;

import java.util.Arrays;

public class AllTheZero2 {
    public static void main(String[] args) {

        int[] digit = {23, 1, 0, 34, 56, 0,65,0} ;
        int[] result = new int[digit.length];

        int j = 0;

        for (int i = 0; i < digit.length; i++) {
            if(digit[i]!=0){
                result[j++]=digit[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
