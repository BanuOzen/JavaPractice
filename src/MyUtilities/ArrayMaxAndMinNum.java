package MyUtilities;

import java.util.Arrays;

public class ArrayMaxAndMinNum {

    public static int max(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static double max(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static long max(long[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }


}
/*
1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */