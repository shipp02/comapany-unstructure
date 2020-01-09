

public class empTest
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        
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
        System.out.println(a);
        System.out.println(a1.getManager());
        
        TechLead b = new TechLead("Bill");
        SoftwareEngineer b1 = new SoftwareEngineer("Kasey"); 
        SoftwareEngineer b2 = new SoftwareEngineer("Maw");
        b.addReport(b1);
        b.addReport(b2);
        
        b1.setCodeAccess(true);
        b1.checkInCode();
        
        System.out.println(b1);
        System.out.println(b);
        System.out.println(b2.getManager());
        // }
        //a.getCodeAccess();
        
    }
}
