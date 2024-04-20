package Shape;

public class Rectangle implements Shape
{
    private float length;
    private float width;

    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public float getArea()
    {
        float area = length * width;
        return area;
    }
}
