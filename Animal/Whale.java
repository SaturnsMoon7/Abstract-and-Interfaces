package Animal;

public class Whale extends Mammal
{
    @Override
    public void eat()
    { System.out.println("Whale eats some krill"); }

    @Override
    public void move()
    { System.out.println("Whale swims through the water"); }
}
