package Vehicle;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Practice Problem #6");
        System.out.println();

        Car newCar = new Car(5);
        newCar.changeOil();
        newCar.drive();
        System.out.println("This car has " + newCar.getNumSeats() + " seats") ;

        System.out.println();

        Bicycle newBicycle = new Bicycle(3);
        newBicycle.changeOil();
        newBicycle.cleanChain();
        System.out.println("The bike has " + newBicycle.getNumSeats() + " seats");
     
        System.out.println();
    }
}
