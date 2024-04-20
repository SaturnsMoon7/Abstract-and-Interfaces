package Intractable;
import java.util.ArrayList;

abstract public class Intractable 
{
    private ArrayList<Float> position = new ArrayList<Float>();
    private ArrayList<Float> size = new ArrayList<Float>();

    public void OnMouseHover()
    { System.out.println("Mouse is hovering UI"); }

    public ArrayList<Float> getSize()
    { return size; }
    
    abstract public void OnMouseClick();
    
}