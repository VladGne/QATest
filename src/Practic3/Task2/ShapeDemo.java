package Practic3.Task2;

import java.text.DecimalFormat;

public class ShapeDemo {
    public static void main(String args[]){
        DecimalFormat decimalFormat = new DecimalFormat("##.0#");

        Shape[] shapes = new Shape[9];
        shapes[0] = new Circle();
        shapes[1] = new Circle(5.0);
        shapes[2] = new Circle(0.81, "Purple", true);

        shapes[3] = new Rectangle();
        shapes[4] = new Rectangle(5.0, 2.5);
        shapes[5] = new Rectangle(0.81, 0.666, "Blue", false);

        shapes[6] = new Square();
        shapes[7] = new Square(3.0);
        shapes[8] = new Square(3.81, "Red", true);

        for (Shape shape : shapes)
            System.out.println((shape.toString() + "\n" + (shape instanceof Circle ?
                "Area = "+ decimalFormat.format(((Circle) shape).getArea()) :
                "Perimeter = "+ decimalFormat.format(((Rectangle) shape).getPerimeter())) + "\n"));
    }
}
