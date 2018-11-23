package Practic3.Task2;

import java.text.DecimalFormat;

public class ShapeDemo {
    public static void main(String args[]){
        DecimalFormat decimalFormat = new DecimalFormat("##.0#");

        final double x = 2.0;
        final double y = 2.0;
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
            System.out.println((shape + "\n" +
                    "Area = "+ decimalFormat.format(shape.getArea()) + "\n" +
                    "Perimeter = "+ decimalFormat.format(shape.getPerimeter())) + "\n" +
                    "Point (2;2) - " + (shape.isInside(x,y) ? "in the shape " : "out the shape ") + "\n");
    }
}
