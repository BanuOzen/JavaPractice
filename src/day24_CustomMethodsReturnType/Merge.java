package day24_CustomMethodsReturnType;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] result = mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeArray(int[]arr1, int[]arr2){
        int[] mergeArray = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {

            mergeArray[i++]=each;
        }
        for (int each : arr2) {
            mergeArray[i++]=each;
        }
        return mergeArray;
    }
}
/*
7. Create a method named merge that passes two integer array parameters,
 the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */