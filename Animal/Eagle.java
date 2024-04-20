package Animal;

public class Eagle extends Bird
{
    @Override
    public void eat()
    { System.out.println("Eagle catches some rodents"); }

    @Override
    public void move()
    { System.out.println("Eagle flies through the air"); }
}
