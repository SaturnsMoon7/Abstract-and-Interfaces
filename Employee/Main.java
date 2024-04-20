package Employee;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Practice Problem #3");
        System.out.println();
        
        HRManager newHrManager = new HRManager();
        newHrManager.work();
        newHrManager.addEmployee();

        System.out.println();

        Custodian newcCustodian = new Custodian();
        newcCustodian.work();
        newcCustodian.addEmployee();
        
        System.out.println();
    }
}