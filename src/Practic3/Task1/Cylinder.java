package Practic3.Task1;

public class Cylinder extends Circle{
    private double height;
    private double DEFAULT_HEIGHT = 3.0;

    public Cylinder(){
        this.radius = DEFAULT_RADIUS;
        this.height = DEFAULT_HEIGHT;
        this.colour = DEFAULT_COLOR;
    }

    public Cylinder(double radius){
        this.radius = radius;
        this.colour = DEFAULT_COLOR;
        this.height = DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        this.colour = DEFAULT_COLOR;
    }

    public Cylinder(double radius, double height, String colour){
        this.colour = colour;
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    public String toString(){
        return String.format("\nCylinder:\nRadius - %.2f\nHeight - %.2f\nColour - %s\n", radius, height, colour);
    }

    public double getVolume(){
        return height *  getArea();
    }
}

