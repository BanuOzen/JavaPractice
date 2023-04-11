package MyUtilities;

public class ArrayMergeUtility {

    public static int[] merge(int[] array, int [] array2){

        int[] mergeArray = new int[array.length+array2.length];

        int i =0;
        for (int each : array) {
            mergeArray[i++] = each;
        }
        for (int each : array2) {
            mergeArray[i++] = each;
        }
        return mergeArray;

    }

    public static double[] merge(double[] array, double[] array2){

        double[] mergeArray = new double[array.length + array2.length];

        int i =0;
        for (double each : array) {
            mergeArray[i++] = each;
        }

        for (double each : array2) {
            mergeArray[i++] = each;
        }
        return mergeArray;
    }

    public static char[] merge(char[] array, char[] array2){

        char[] mergeArray = new char[array.length+ array2.length];

        int i = 0;
        for (char each : array) {
            mergeArray[i++] = each;
        }

        for (char each : array2) {
            mergeArray[i++] = each;
        }
        return mergeArray;
    }

    public static String[] merge(String[] array, String[] array2){

        String[] mergeArray = new String[array.length+ array2.length];

        int i = 0;
        for (String each : array) {
            mergeArray[i++] = each;
        }
        for (String each : array2) {
            mergeArray[i++] = each;
        }
        return mergeArray;
    }

}
