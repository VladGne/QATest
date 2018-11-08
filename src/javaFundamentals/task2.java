package javaFundamentals;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;

public class task2 {
    // task 2 - search element in array. Get array size and number from the console.

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();
        System.out.println("Enter searching number");
        int searchingNumber = scanner.nextInt();
        int array[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            array[i] = ThreadLocalRandom.current().nextInt();

        Arrays.sort(array);

        System.out.println(regulerSearching(array, searchingNumber));
        System.out.println(binarySearching(array, 0, arraySize, searchingNumber));

    }

    private static boolean regulerSearching(int[] array, int searchingNumber){

        boolean isNumberInArray = false;

        for (int i = 0; i < array.length; i++){
            if (array[i] == searchingNumber)
                isNumberInArray = true;
        }

        return isNumberInArray;
    }

    private static boolean binarySearching(int[] array, int leftBorder, int rightBorder, int searchingNumber){

        boolean isNumberInArray = false;
        int middle =  leftBorder + (rightBorder - leftBorder) / 2;

        if (rightBorder >= leftBorder){
            if(searchingNumber == array[middle])
                isNumberInArray = true;

            else if(array[middle]  > searchingNumber)
                binarySearching(array,  leftBorder,  middle-1, searchingNumber);

            else
                binarySearching(array,  middle+1,  rightBorder, searchingNumber);
        }

        return isNumberInArray;
    }
}


