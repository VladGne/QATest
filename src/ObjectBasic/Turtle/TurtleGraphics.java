package ObjectBasic.Turtle;

import java.util.Arrays;

public class TurtleGraphics {
//    board - a two-dimensional array of chars representing the drawing board
//    penPosition - a Position class field for storing current pen position (default position is 0,0)
//    cellChar - character representing the clear board cell (by default use dot char)
//    coloredCellChar - character representing the coloured board cell (by default use 'o' char)
//    penChar - character representing the current position of the pen on the board (by default use 'x' char)

    private int x;
    private int y;
    char[][] board = new char[y][x];
    final char coloredCellChar = 'o';
    final char penChar = 'x';
    final char cellChar = '.';
    Position penPosition = new Position();
    Direction direction;

    enum Direction{
        UP("u"),
        DOWN("d"),
        RIGHT("r"),
        LEFT("l");

        private final String name;

        Direction(String name){
            this.name = name;
        }
    }

    public TurtleGraphics() {
        setState(0,0);
    }

    public TurtleGraphics(int x, int y, int positionX, int positionY) {
        this.x = x;
        this.y = y;
        this.board = new char[this.y][this.x];
        setState(positionX, positionY);
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public char getColoredCellChar() {
        return coloredCellChar;
    }

    public char getPenChar() {
        return penChar;
    }

    public char getCellChar() {
        return cellChar;
    }

    public Position getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(Position penPosition) {
        this.penPosition = penPosition;
    }

    public void movePen( Direction dir, int length ){

        if (dir.equals(Direction.UP))
            movePenUp(length);
        if (dir.equals(Direction.DOWN))
            movePenDown(length);
        if (dir.equals(Direction.RIGHT))
            movePenRight(length);
        if (dir.equals(Direction.LEFT))
            movePenLeft(length);
    }

    public void movePenUp( int length ){
        if(penPosition.getY()-length>=0){
            int stepsNumber = Math.abs(penPosition.getY()-length);
            for (int i=0; i<length; i++){
                draw(coloredCellChar);
                penPosition.setY(penPosition.getY()-1);
                draw(penChar);
            }
        }
        showBoard();
    }

    public void movePenDown( int length ){
        if(penPosition.getY()+length<=y) {
            int stepsNumber = Math.abs(penPosition.getY() - length);
            for (int i = 0; i < length; i++) {
                draw(coloredCellChar);
                penPosition.setY(penPosition.getY() + 1);
                draw(penChar);
            }
        }
        showBoard();
    }

    public void movePenLeft( int length ){
        if(penPosition.getX()-length>=0) {
            int stepsNumber = Math.abs(penPosition.getX() - length);
            for (int i = 0; i < length; i++) {
                draw(coloredCellChar);
                penPosition.setX(penPosition.getX() - 1);
                draw(penChar);
            }
        }
        showBoard();
    }

    public void movePenRight( int length ){
        if(penPosition.getX()+length<=x) {
            int stepsNumber = Math.abs(penPosition.getX() - length);
            for (int i = 0; i < length; i++) {
                draw(coloredCellChar);
                penPosition.setX(penPosition.getX() + 1);
                draw(penChar);
            }
        }
        showBoard();
    }

    public void draw(char pen){
        board[penPosition.getY()][penPosition.getX()] = pen;
    }

    public void  clearBoard(){
        setState(0,0);
    }

    public void setState(int x, int y){
        for (char[] row: board)
            Arrays.fill(row, cellChar);
        penPosition.setPosition(y,x);
        board[penPosition.getY()][penPosition.getX()] = penChar;
        showBoard();
    }

    public void showBoard(){
        for (int i = 0; i < 10; ++i) System.out.println();

        for(int i = 0; i < y; i++)
        {
            for(int j = 0; j < x; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
