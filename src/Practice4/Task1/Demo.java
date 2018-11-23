package Practice4.Task1;

public class Demo {
    public static void main(String args[]){
        MovableRectangle rectangle = new MovableRectangle(1,4,4,1,1,1);

        System.out.println("Initialization");
        System.out.println(rectangle);

        rectangle.moveDown();
        System.out.println("\nMove down");
        System.out.println(rectangle);

        rectangle.moveLeft();
        System.out.println("\nMove left");
        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println("\nMove up");
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println("\nMove right");
        System.out.println(rectangle);
    }
}
