package Practic3.Task2;

public class Shape {
    protected String colour;
    protected boolean filled;

    protected String defaultColour = "Green";
    protected boolean defaultFilled = true;

    public Shape(){
        this.colour = defaultColour;
        this.filled = defaultFilled;
    }

    public Shape(String colour, boolean filled){
        this.filled = filled;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format( "A Shape with the colour of %s and %s", colour, filled ? "filled" : "Not filled");
    }
}