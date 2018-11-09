package javaFundamentals;

import java.util.Scanner;

public class task4 {

    public static void main(String args[]){

        String testString = "the quick brown fox jumps over the lazy dog,./!?*&+-=1234567890";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter searching symbol:");
        char symbol = scanner.next().charAt(0);

        System.out.println(findFrequency(symbol, testString));
    }

    private static int findFrequency(char symbol, String text){

        int frequency = 0;

        if (text.length() == 0)
            return -1;

        else {
            for (int i = 0; i < text.length(); i++){
                if(symbol == text.charAt(i)){
                    frequency++;
                }
            }
        }

        return frequency;
    }
}