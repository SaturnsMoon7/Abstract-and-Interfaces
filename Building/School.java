package Building;

public class School extends Building
{
    private int maxCapacity;
    
    public School(String location, int maxCap)
    { 
        setLocation(location);;
        maxCapacity = maxCap; 
    }

    public int getMaxCapacity()
    { return maxCapacity; }
}
