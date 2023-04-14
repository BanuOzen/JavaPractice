package MyUtilities;

public class ArrayInsert {

    public static int[] insertElement(int[] arr, int index, int element){
        if(index < 0 || index > arr.length){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[arr.length+1];
        result[index]= element;
        for (int i = 0, j=0; i < arr.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j]=arr[i];
        }

        return result;
    }

    public static double[] insertElement(double[] arr, int index, double element){
        if(index < 0 || index > arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        double[] result = new double[arr.length+1];
        result[index]=element;
        for (int i = 0, j=0; i < arr.length; i++,j++) {
            if(i==index){
                j++;
            }
            result[j]=arr[i];

        }
        return result;
    }


    public static char[] insertElement(char[] arr, int index, char element){
        if(index < 0 || index > arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        char[] result = new char[arr.length+1];
        result[index]=element;

        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if(i==index){
                j++;
            }
            result[j]=arr[i];
        }
        return result;
    }


    public static String[] insertElement(String[] arr, int index, String element){

        if(index < 0 || index > arr.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        String[] result = new String[arr.length+1];
        result[index]=element;

        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if(i==index){
                j++;
            }
            result[j]=arr[i];
        }
        return result;
    }


}
