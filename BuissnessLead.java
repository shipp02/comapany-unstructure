import java.util.*;
/**
 * Write a description of class BuissnessLead here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BuissnessLead extends Buisness
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList<Accountant> reporters = new ArrayList<>();
    final private static int headCount= 10;
    ArrayList<TechLead> supportTeams = new ArrayList<>();
    private double bonusAmt;
    /**
     * Constructor for objects of class BuissnessLead
     */
    public BuissnessLead(String nameP)
    {
        super(nameP);
    }

    public boolean hasHeadCount(){
        if(reporters.size()<headCount){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean addReport(Accountant a,TechLead t){
        if(reporters.size()<headCount){
            reporters.add(a);
            supportTeams.add(t);
            bonusAmt = bonusAmt + 1.1*a.getBaseSalary();
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean requestBonus(double bonusRequest){
        if(bonusRequest<bonusAmt){
            bonusAmt = bonusAmt-bonusRequest;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean approveBonus (Employee e, double bonus){
        return false;
    }
}
