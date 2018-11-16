package Practic3.Task1;

public class Circle {

    protected double radius;
    protected String colour;
    protected final String DEFAULT_COLOR = "Black";
    protected final double DEFAULT_RADIUS = 2;


    public Circle(){
        this.radius = DEFAULT_RADIUS;
        this.colour = DEFAULT_COLOR;
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = DEFAULT_COLOR;
    }

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return String.format("\nCircle:\nRadius - %.2f\nColour - %s\n", radius,colour);
    }
}
