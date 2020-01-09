import java.util.*;
/**
 * Write a description of class TechLead here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TechLead extends TechnicalEmployee
{
    // instance variables - replace the example below with your own
    private int x;
    final private static int headCount= 10;
    private int report = 0;
    ArrayList<SoftwareEngineer> reporters = new ArrayList<>();
    Accountant myAccountant;
    /**
     * Constructor for objects of class TechLead
     */
    public TechLead(String nameP)
    {
        // initialise instance variables
        super(nameP);
        
    }
    
    private void addReportB(SoftwareEngineer e){
        reporters.add(e);
        e.setManager(this);
    }
    
    public void addReport(SoftwareEngineer e){
        if(this.hasHeadCount()){
            this.addReportB(e);
            e.setManager(this);
        }
    }
    
    
    public boolean hasHeadCount(){
        if(reporters.size()<headCount){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean approveCheckIn(SoftwareEngineer e){
        if(reporters.contains(e) && e.getCodeAccess()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean requestBonus(Employee e, double bonus){
        if(myAccountant.approveBonus(bonus)){
            return true;
        }else{
            return false;
        }
    
    }
    
    
    public String toString(){
        return super.toString();
    }
    
    public String getTeamStatus(){
        String retValue = super.toString() + " has x successful check ins and is managing: " + "\n";
        for(int i =0;i<reporters.size();i++){
            retValue = retValue + reporters.get(i).toString() + "\n";
        }
        return retValue;
    }
}
