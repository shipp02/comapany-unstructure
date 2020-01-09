
/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class Employee
{
    private double baseSalary;
    private int employeeID = 0;
    private Employee manager;
    String name;
    private static int globalEmpID=1;
    // public Accountant myAccountant; // This is for TechLead
    
    public Employee(String nameP,double baseSalaryP){
        this.name = nameP;
        this.baseSalary = baseSalaryP;
        employeeID = globalEmpID;
        globalEmpID++;
        //manager = "Satya";
    }
    
    public int getEmployeeID(){
        return this.employeeID;
    }
    
    
       
    public void setManager(Employee managerP){
        manager = managerP;
    }
    
    public String toString(){
        return employeeID +" " +name;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public double setBaseSalary(double baseSalaryI){
        this.baseSalary = baseSalaryI;
        return this.baseSalary;
    }
    
    public boolean equals(Employee other){
        if (employeeID == other.employeeID){
            return true;
        }
        else {
            return false;
        }
    }
    
    // abstract String getEmployeeStatus();
    // public void addReport(SoftwareEngineer e){}  // This is for TechLead
    
}
