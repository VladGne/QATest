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

    static void insertionSort(int arr[]) {

        int j;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j = j - 1;
            }
        }
    }

    static void bubbleSort(int[] arr) {

        boolean swapped = true;
        for(int i = 0; i < arr.length-1; i++) {
            swapped = false;

            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }

    static void selectionSort(int arr[]) {

        for(int k = 0; k < arr.length-1; k++) {
            int min_idx = k;
            for(int j = k+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            //swap
            int temp = arr[min_idx];
            arr[min_idx] = arr[k];
            arr[k] = temp;
        }
    }
}
