package Piece;
import java.util.ArrayList;

abstract public class Piece 
{
    private ArrayList<Short> position = new ArrayList<Short>();

    public void nextPosition(short pos)
    {position.add(pos); }

    public ArrayList<Short> getPosition()
    { return position; }

    abstract public void move();
}