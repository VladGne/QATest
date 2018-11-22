package Practic3.Task2;

public class Circle extends Shape{
    private double radius;
    private double defaultRadius = 1.0;
    public Circle(){
        this.radius = defaultRadius;
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return String.format( "A Circle with radius = %s, which is a subclass of %s", radius, super.toString());
    }
}