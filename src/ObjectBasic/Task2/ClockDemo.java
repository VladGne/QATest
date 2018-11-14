package ObjectBasic.Task2;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String args[]){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter seconds for fist clock: ");
                int seconds = scanner.nextInt();

                Clock clock1 = new Clock(seconds);

                for(int i =0; i<10; i++){
                    clock1.tick();
                    System.out.println(clock1.getTime());
                }

                System.out.println("Enter hours for second clock: ");
                int hours = scanner.nextInt();

                System.out.println("Enter minutes for second clock: ");
                int minutes = scanner.nextInt();

                System.out.println("Enter seconds for second clock: ");
                seconds = scanner.nextInt();

                Clock clock2 = new Clock(hours, minutes, seconds);

                for(int i =0; i<10; i++){
                    clock2.tick();
                    System.out.println(clock2.getTime());
                }

                clock1.addClock(clock2);
                System.out.println("Clock1 time is: " + clock1.getTime());
                System.out.println("Clock2 time is: " + clock2.getTime());
                System.out.println("Difference between clocks is: " + clock1.subtractClock(clock2).getTime());
            }
            catch (Exception e){
                System.out.println("Incorrect input: " + e.toString());
            }
        }
    }
}

