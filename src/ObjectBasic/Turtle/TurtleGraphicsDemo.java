package ObjectBasic.Turtle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TurtleGraphicsDemo {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean haveNoInput = true;
        int fieldSize = 1;
        int x = 1;
        int y = 1;

        while (haveNoInput){
            try {
                System.out.println("Enter field size");
                fieldSize = scanner.nextInt();

                System.out.println("Enter start X position");
                x = scanner.nextInt();

                System.out.println("Enter start Y position");
                y = scanner.nextInt();
                haveNoInput = false;
            }
            catch (Exception e){System.out.println("\nInvalid input");}
        }

        TurtleGraphics turtleGraphics = new TurtleGraphics(fieldSize, fieldSize, x-1, y-1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean stillPaly = true;
        String input;
        String[] comand;

        while (stillPaly){
            System.out.println("\nEnter direction and steps");

            try {
                input = br.readLine();
                comand = input.split(" ");

                if(comand.length == 2){
                    if (comand[0].equals(TurtleGraphics.Direction.DOWN.getCommand()))
                        turtleGraphics.movePen(TurtleGraphics.Direction.DOWN, Integer.parseInt(comand[1]));

                    else if (comand[0].equals(TurtleGraphics.Direction.RIGHT.getCommand()))
                        turtleGraphics.movePen(TurtleGraphics.Direction.RIGHT, Integer.parseInt(comand[1]));

                    else if (comand[0].equals(TurtleGraphics.Direction.UP.getCommand()))
                        turtleGraphics.movePen(TurtleGraphics.Direction.UP, Integer.parseInt(comand[1]));

                    else if (comand[0].equals(TurtleGraphics.Direction.LEFT.getCommand()))
                        turtleGraphics.movePen(TurtleGraphics.Direction.LEFT, Integer.parseInt(comand[1]));
                }
                else if(comand.length == 1 && comand[0].equals("c")){
                    turtleGraphics.clearBoard();
                }
                else if(comand.length == 1 && comand[0].equals("x")){
                    stillPaly=false;
                    System.out.println("\nGAME OVER");
                }
            }
            catch (Exception e){System.out.println("\nInvalid input");}
        }
    }
}
