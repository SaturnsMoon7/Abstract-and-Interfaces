package Employee;

abstract public class Employee 
{
    private float salary;
    
    public float getSalary()
    { return salary; }

    abstract public void work();
}