package Employee;

public class HRManager extends Employee
{
    @Override
    public void work()
    { System.out.println("The HR Manager is working now"); }
    
    public void addEmployee()
    { System.out.println("A new manager has been hired"); }
}