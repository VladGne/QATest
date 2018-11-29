package ObjectBasic.Turtle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TurtleGraphicsDemo {
    public static void main(String args[])throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size");
        int fieldSize = scanner.nextInt();

        System.out.println("Enter start X position");
        int x = scanner.nextInt();

        System.out.println("Enter start Y position");
        int y = scanner.nextInt();
        TurtleGraphics turtleGraphics = new TurtleGraphics(fieldSize, fieldSize, x-1, y-1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String input;
//        String[] comand;
//        while (true){
//            System.out.println("Enter direction and steps");
//
//            input = br.readLine();
//            comand = input.split(" ");
//
//            if(comand.length == 2){
//                if (comand[0].equals(TurtleGraphics.Direction.DOWN.name()))
//                    turtleGraphics.movePen(TurtleGraphics.Direction.DOWN, Integer.parseInt(comand[1]));
//
//                else if (comand[0]==TurtleGraphics.Direction.RIGHT.name())
//                    turtleGraphics.movePen(TurtleGraphics.Direction.RIGHT, Integer.parseInt(comand[1]));
//
//                else if (comand[0].equals(TurtleGraphics.Direction.UP.name()))
//                    turtleGraphics.movePen(TurtleGraphics.Direction.UP, Integer.parseInt(comand[1]));
//
//                else if (comand[0].equals(TurtleGraphics.Direction.LEFT.name()))
//                    turtleGraphics.movePen(TurtleGraphics.Direction.LEFT, Integer.parseInt(comand[1]));
//            }
//            else if(comand.length == 1 && comand[0].equals("c")){
//                turtleGraphics.clearBoard();
//            }
//
//
//        }

        turtleGraphics.movePen(TurtleGraphics.Direction.DOWN, 6);
        turtleGraphics.movePen(TurtleGraphics.Direction.RIGHT, 3);
        turtleGraphics.movePen(TurtleGraphics.Direction.UP, 3);
        turtleGraphics.movePen(TurtleGraphics.Direction.LEFT, 4);
    }


}
