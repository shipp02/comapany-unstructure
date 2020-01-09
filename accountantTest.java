
/**
 * Write a description of class accountantTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class accountantTest
{
    // instance variables - replace the example below with your own
    Accountant acc = new Accountant("My word is law");

    public static void main(String[] args){
        //Setup
        TechLead a = new TechLead("Satya");
        // for(int i = 0;i<15;i++){
        SoftwareEngineer a1 = new SoftwareEngineer("Kasey");
        SoftwareEngineer a2 = new SoftwareEngineer("Maw");
        a.addReport(a1);
        a.addReport(a2);
        a1.setCodeAccess(true);
        a1.checkInCode();
        a1.checkInCode();
        a2.checkInCode();
        a2.setCodeAccess(true);
        a2.checkInCode();
        System.out.println(a1);

        System.out.println(a1.getManager());

        TechLead b = new TechLead("Bill");
        SoftwareEngineer b1 = new SoftwareEngineer("Kasey");
        SoftwareEngineer b2 = new SoftwareEngineer("Maw");
        b.addReport(b1);
        b.addReport(b2);

        b1.setCodeAccess(true);
        b1.checkInCode();

        System.out.println(b1);

        System.out.println(b2.getManager());
        a1.setBaseSalary(200000.0);
        //EndSetup

        Accountant acc = new Accountant("My word is law");
        acc.supportTeam(a);
        
        System.out.println(acc.getTeamSupported());

        System.out.println(acc.approveBonus(100000));
        System.out.println(acc.employeeStatus());
        // System.out.println(a.getTeamStatus());
    }
}
