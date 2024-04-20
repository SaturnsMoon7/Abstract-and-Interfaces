package Employee;

public class Custodian extends Employee
{
    @Override
    public void work()
    { System.out.println("The custodian is moping the floors"); }

    public void addEmployee()
    { System.out.println("A new custodian has been hired"); }
}