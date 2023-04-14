package MyUtilities;

import java.util.Arrays;

public class ArraySwapElement {

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
