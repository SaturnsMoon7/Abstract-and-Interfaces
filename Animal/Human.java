package Animal;

public class Human extends Mammal
{
    @Override
    public void eat()
    { System.out.println("Human consumes nutrients"); }

    @Override
    public void move()
    { System.out.println("Human runs"); }

    public void playGolf()
    { System.out.println("Human plays golf"); }
}
