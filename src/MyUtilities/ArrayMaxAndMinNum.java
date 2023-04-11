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

    public static short max(short[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static float max(float[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static byte max(byte[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    
    
    
    
    public static int min(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }
    public static long min(long[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static short min(short[] array){
        Arrays.sort(array);
        return array[0];
    }


}
/*
Task1:    1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

Task2:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array


 */