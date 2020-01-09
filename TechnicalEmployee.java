import java.util.Random;
/**
 * Write a description of class TechnicalEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class TechnicalEmployee extends Employee
{
    Random rNoGen = new Random();
    private int succesfulCheckIns;
    private static int baseSalaryP = 75000;
    /**
     * Constructor for objects of class TechnicalEmployee
     */
    public TechnicalEmployee(String nameP)
    {
        super(nameP,baseSalaryP);
        if(baseSalaryP < 75000){
            this.setBaseSalary(75000.00);
        }
        succesfulCheckIns = rNoGen.nextInt(20);
    }

    public String getEmployeeStatus(){
        return super.toString() + " has " + succesfulCheckIns + " succesful Check-Ins";
    }
    
    
    
}
