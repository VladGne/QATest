package javaFundamentals;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    // Sort random array (number of arguments should be taken from in the console) of integer numbers

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();

        int arrays[][] = new int[3][arraySize];
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < arraySize; i++)
                arrays[j][i] = ThreadLocalRandom.current().nextInt();
        }

        insertionSort(arrays[0]);
        bubbleSort(arrays[1]);
        selectionSort(arrays[2]);
    }

    static void insertionSort(int array[]) {

        if (array.length > 0){
            int j;
            for (int i = 1; i < array.length; i++) {
                j = i;
                while (j > 0 && array[j - 1] > array[j]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j = j - 1;
                }
            }
        }
    }

    static void bubbleSort(int[] array) {

        if(array.length > 0){
            boolean swapped;
            for(int i = 0; i < array.length-1; i++) {
                swapped = false;

                for(int j = 0; j < array.length-i-1; j++) {
                    if(array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        swapped = true;
                    }
                }

                if(swapped == false)
                    break;
            }
        }
    }

    static void selectionSort(int array[]) {

        if (array.length > 0){
            for(int k = 0; k < array.length-1; k++) {
                int min_id = k;
                for(int j = k+1; j < array.length; j++)
                    if (array[j] < array[min_id])
                        min_id = j;

                //swap
                int temp = array[min_id];
                array[min_id] = array[k];
                array[k] = temp;
            }
        }
    }
}
