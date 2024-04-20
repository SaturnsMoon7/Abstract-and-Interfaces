package Vehicle;

public class Bicycle extends Car
{
    public Bicycle(int numSeats)
    { super(numSeats); }

    public void cleanChain()
    { System.out.println("The bike chain has been cleaned"); }
}
