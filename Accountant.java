

/**
 * Write a description of class Accountant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accountant extends Buisness
{
    // instance variables - replace the example below with your own
    private int x;
    double bonusBudget;
    private TechLead teamSupported;
    /**
     * Constructor for objects of class Accountant
     */
    public Accountant(String nameP)
    {
        super(nameP);

    }

    public void supportTeam(TechLead t){
        for(int i = 0;i<t.reporters.size();i++){
            bonusBudget = bonusBudget + t.reporters.get(i).getBaseSalary();
        }
        bonusBudget = 1.1*bonusBudget;

        teamSupported = t;
        teamSupported.myAccountant = this;
    }

    public Employee getTeamSupported(){
        return teamSupported;
    }

    public boolean approveBonus(double bonusReq){
        if(bonusReq > bonusBudget){
            return false;
        }else if(bonusReq<bonusBudget){
            return true;
        }
        else if(teamSupported == null){
            return false;
        }
        else{
            return false;
        }
    }

    public String employeeStatus(){

        return super.toString() + " with a budget of " + bonusBudget + " is supporting " + teamSupported.name;
    }
}
