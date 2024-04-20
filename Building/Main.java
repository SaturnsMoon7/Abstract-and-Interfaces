package Building;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Practice Problem #4");
        System.out.println();

        School newSchool = new School("1360 Redwood", 1200);
        System.out.println("This school can only hold " + newSchool.getMaxCapacity() + " students.");
        
        System.out.println();
        
        Outhouse newOuthouse = new Outhouse("The swamp");
        System.out.println("The outhouse by " + newOuthouse.getLocation());
        newOuthouse.lockDoor(false);
        System.out.println("The door is " + newOuthouse.getDoorLockState());

        System.out.println();
    }
}
