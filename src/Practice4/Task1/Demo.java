package Practice4.Task1;

public class Demo {
    public static void main(String args[]){
        MovableRectangle rectangle = new MovableRectangle(1,2,3,4,1,1);

        System.out.println("Initialization");
        System.out.println(rectangle);

        System.out.println("\nMove down");
        rectangle.moveDown();
        System.out.println(rectangle);

        System.out.println("\nMove left");
        rectangle.moveLeft();
        System.out.println(rectangle);

        System.out.println("\nMove up");
        rectangle.moveUp();
        System.out.println(rectangle);

        System.out.println("\nMove right");
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
