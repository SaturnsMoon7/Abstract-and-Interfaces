package Animal;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Practice Problem #7");
        System.out.println();

        Human newHuman = new Human();
        newHuman.giveBirth();
        newHuman.eat();
        newHuman.move();

        System.out.println();

        Whale newWhale = new Whale();
        newWhale.eat();
        newWhale.move();

        System.out.println();

        Eagle newEagle = new Eagle();
        newEagle.layEgg();
        newEagle.eat();
        newEagle.move();

        System.out.println();

        Platypus perryPlatypus = new Platypus();
        perryPlatypus.eat();
        perryPlatypus.move();
     
        System.out.println();
    }
}