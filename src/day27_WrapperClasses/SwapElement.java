package day27_WrapperClasses;

import java.util.Arrays;

public class SwapElement {

    public static void main(String[] args) {
        int[] arr ={1,2,3,45,6,7};
        int[] res = swapElement(arr,2,3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] swapElement(int[] arr, int index1, int index2){
        if(index1<0 || index1> arr.length || index2<0 || index2> arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }
       int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
        return arr;

    }
    public static double[] swapElement(double[] arr, int index1, int index2){
        if(index1<0 || index1> arr.length || index2<0 || index2> arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        double temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
        return arr;

    }

    public static char[] swapElement(char[] arr, int index1, int index2){
        if(index1<0 || index1> arr.length || index2<0 || index2> arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        char temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;

    }

    public static String[] swapElement(String[] arr, int index1, int index2){
        if(index1<0 || index1> arr.length || index2<0 || index2> arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        String temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
        return arr;
    }



}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */