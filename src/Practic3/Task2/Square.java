package Practic3.Task2;

public class Square extends Rectangle {
    private double defaultSide = 1.0;

    public Square(){
        this.width = defaultSide;
        this.length = defaultSide;
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Square(double side, String colour, boolean filled){
        this.width = side;
        this.length = side;
        this.colour = colour;
        this.filled = filled;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = this.length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = this.width;
    }

    @Override
    public String toString() {
        return String.format( "A Square with side = %s, which is a subclass of %s", width, super.toString());
    }


}
