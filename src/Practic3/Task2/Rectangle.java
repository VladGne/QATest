package Practic3.Task2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    private double defaultLength = 2.0;
    private double defaultWidth = 3.0;

    public Rectangle(){
        this.length = defaultLength;
        this.width = defaultWidth;
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Rectangle(double width, double length, String colour, boolean filled){
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter(){
        return length + length + width + width;
    }

    @Override
    public String toString() {
        return String.format( "A Rectangle with width=%s and length=%.2f, which is a subclass of %s", width, length, super.toString());
    }
}
