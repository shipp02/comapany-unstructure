import java.util.*;
/**
 * Write a description of class BuisnessEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class Buisness extends Employee
{
    //This is the constructor for Buissness Employee
    private static int baseSalaryP = 50000;
    
    
    public Buisness(String nameP){
        super(nameP,baseSalaryP);
        if(baseSalaryP < 50000){
            this.setBaseSalary(50000.00);
        }
    }
    
    public String getEmployeeStatus(){
        return super.toString() + " has a budget of ";
    }
    
    
    
}
