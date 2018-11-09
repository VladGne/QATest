package javaFundamentals;

import java.util.Scanner;

public class task5 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter disk number");
        int diskNumber = scanner.nextInt();
        char A='A', B='B', C='C';

        solveTower(diskNumber, A, C, B);
    }

    private static void solveTower(int diskNumber, char A, char C, char B){

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
