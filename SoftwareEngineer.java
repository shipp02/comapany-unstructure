
/**
 * Write a description of class SoftwareEngineer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoftwareEngineer extends TechnicalEmployee
{
    // instance variables - replace the example below with your own
    private int x;
    int codeCheckIns = 0;
    boolean codeAccess = false;
    TechLead manager;
    /**
     * Constructor for objects of class SoftwareEngineer
     */
    public SoftwareEngineer(String nameP)
    {
        // initialise instance variables
        super(nameP);
        
    }
    
    public boolean getCodeAccess(){
        return this.codeAccess;
    }
    
    public int getSuccessfulCheckIns(){
        return this.codeCheckIns;
    }
    
    public void setCodeAccess(boolean codeAccessP){
        this.codeAccess = codeAccessP;
    }
    
    public boolean checkInCode(){
        if(manager.approveCheckIn(this)){
            codeCheckIns++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return super.toString() + " " +super.getBaseSalary()+ " has this many Succesful checkIns " + this.codeCheckIns;
    }
    
    public TechLead getManager(){
        return manager;
    }
    
    public void setManager(TechLead t){
        manager = t;
    }
    
    public String status(){
        return this.name + " has " + this.getEmployeeID() + " succesful check ins.";
    }
}
