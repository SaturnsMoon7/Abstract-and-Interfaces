package Vehicle;

public class Car implements Vehicle
{
    private int numSeats;

    public Car(int numSeats)
    { this.numSeats = numSeats; }
    
    @Override
    public int getNumSeats()
    { return numSeats; }

    @Override
    public void drive()
    { System.out.println("Car is now driving"); }

    public void changeOil()
    { System.out.println("The oil on the car is being changed"); }
}
