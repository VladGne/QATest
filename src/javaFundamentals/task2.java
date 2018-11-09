package javaFundamentals;
import java.util.Arrays;
import java.util.Scanner;
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
        boolean isNumberInArray;

        for (int i = 0; i < arraySize; i++)
            array[i] = ThreadLocalRandom.current().nextInt();

        Arrays.sort(array);

        // Contain time in nanoseconds
        long startTime;
        long endTime;
        long totalTime;

        // regular searching
        startTime = System.nanoTime();
        isNumberInArray = regulerSearching(array, searchingNumber);
        endTime   = System.nanoTime();
        totalTime = (endTime - startTime);
        System.out.println((double) totalTime/1000000000 + " seconds\n");   // convert time to seconds and print
        System.out.println(isNumberInArray + "\n");

        // binary searching
        startTime = System.nanoTime();
        isNumberInArray = binarySearching(array, 0, arraySize, searchingNumber);
        endTime   = System.nanoTime();
        totalTime = (endTime - startTime);
        System.out.println((double) totalTime/1000000000 + " seconds\n");    // convert time to seconds and print
        System.out.println(isNumberInArray + "\n");
    }

    private static boolean regulerSearching(int[] array, int searchingNumber){

        boolean isNumberInArray = false;

        if (array.length > 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] == searchingNumber)
                    isNumberInArray = true;
            }
        }

        return isNumberInArray;
    }

    private static boolean binarySearching(int[] array, int leftArrayBorder, int rightArrayBorder, int searchingNumber){

        boolean isNumberInArray = false;

        if (array.length > 0){
            int middleElement =  leftArrayBorder + (rightArrayBorder - leftArrayBorder) / 2;

            if (rightArrayBorder >= leftArrayBorder){
                if(searchingNumber == array[middleElement])
                    isNumberInArray = true;

                else if(array[middleElement]  > searchingNumber)
                    binarySearching(array,  leftArrayBorder,  middleElement-1, searchingNumber);

                else
                    binarySearching(array,  middleElement+1,  rightArrayBorder, searchingNumber);
            }
        }

        return isNumberInArray;
    }
}


