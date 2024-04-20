package Building;

public class Outhouse extends Building
{
    private boolean doorLockState;
    
    public Outhouse(String location)
    { this.setLocation(location); }

    public void lockDoor(boolean state)
    { doorLockState = state; }

    public String getDoorLockState()
    { 
        if (doorLockState)
        { return "open"; }
        else
        { return "closed"; }
    }
}
