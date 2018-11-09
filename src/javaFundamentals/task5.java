package javaFundamentals;

import java.util.Scanner;

public class task5 {
    // Task 5 - Tower of Honoi

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter disk number");
        int diskNumber = scanner.nextInt();
        char[] sticks = {'A', 'B', 'C'};

        solveTower(diskNumber,sticks[0], sticks[2], sticks[1]);
    }

    private static void solveTower(int diskNumber, char A, char C, char B){

        if (diskNumber >0){
            if(diskNumber == 1){
                System.out.println(String.format("Move disk %d: %c -> %c ", diskNumber, A, C));
            }

            else {
                solveTower(diskNumber-1, A, B, C);
                System.out.println(String.format("Move disk %d: %c -> %c ", diskNumber, A, C));
                solveTower(diskNumber-1, B, C, A);
            }
        }
    }
}
