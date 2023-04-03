package day20_Arrays;

import java.util.Arrays;

public class ReversedPractice {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9};
        int[] reversed = new int[num.length];

        for (int i = num.length-1, j=0 ; i >=0 ;i--, j++) {
            reversed[j]=num[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
