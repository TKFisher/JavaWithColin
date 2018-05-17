package HeadFirstJava.Chapter_3;


import java.util.Scanner;

public class Scratch
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        // creating an int arrary with 5 indexes
        int[] myInt = getIntegers(5);


//        for (int i = 0; i < myInt.length; i++) {
//            System.out.println("The value of index position " + i + ", equals the value of " + myInt[i]);
//        }
//
        // same as above but wrapped in method which passes the values stored in the variable from the getIntegers array.
        printValues(myInt);
        System.out.println("The average of the array is " + getAverageofArray(myInt));

        // sorting the array:
        int[] sorted = sortIntegers(myInt);
        printValues(sorted);

    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }

    public static int[] printValues(int[] number)
    {
        for (int i = 0; i < number.length; i++) {
            System.out.println("The value of index position " + i + ", equals the value of " + number[i]);
        }
        return number;
    }

    public static double getAverageofArray(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }


    public static int[] sortIntegers(int[] array)
    {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray [i] = array[i];
        }
        boolean flag = true;
        int temp;
            while (flag){
            flag = false;


            for ( int i = 0; i < sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
