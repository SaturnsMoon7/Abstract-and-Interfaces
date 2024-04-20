package Shape;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Practice Problem #5");
        System.out.println();

        Rectangle newRectangle = new Rectangle(5.4f, 8.2f);
        System.out.println("The area of the rectangle is: " + newRectangle.getArea() + " units squared");

        System.out.println();

        Square newSquare = new Square(3.3f);
        System.out.println("The area of the square is " + newSquare.getArea() + " units squared"); 

        System.out.println();
    }
}
