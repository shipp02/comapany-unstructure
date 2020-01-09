

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TechLeadTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TechLeadTest
{
    /**
     * Default constructor for test class TechLeadTest
     */
    public TechLeadTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void techTest()
    {
        TechLead techLead1 = new TechLead("Satya");
        SoftwareEngineer software1 = new SoftwareEngineer("Karan");
        SoftwareEngineer software2 = new SoftwareEngineer("Kasey");
        techLead1.addReport(software1);
        techLead1.addReport(software2);
        Accountant accounta1 = new Accountant("Khushi");
        assertEquals(null, accounta1.getTeamSupported());
        accounta1.supportTeam(techLead1);
        assertEquals(techLead1, accounta1.getTeamSupported());
        assertEquals(false, techLead1.requestBonus(software1, 200000));
        assertEquals(true, techLead1.requestBonus(software2, 150000));
        System.out.println(accounta1.bonusBudget);
        assertEquals(techLead1, accounta1.getTeamSupported());
        assertEquals(true, accounta1.approveBonus(50000));
        assertEquals("4 Khushi with a budget of 165000.0 is supporting Satya",accounta1.employeeStatus());
    }

    @Test
    public void test2()
    {
        TechLead techLead1 = new TechLead("Satya");
        assertEquals(true, techLead1.equals(techLead1));
        Accountant accountant1 = new Accountant("Karan");
        assertEquals(false, techLead1.equals(accountant1));
        SoftwareEngineer software1 = new SoftwareEngineer("aashay");
        techLead1.addReport(software1);
        techLead1.getTeamStatus();
        assertEquals("18 Satya has x successful check ins and is managing: 20 aashay has 0 successful check ins",techLead1.getTeamStatus());
    }

    @Test
    public void OnlyforTechLead()
    {
        TechLead t = new TechLead("Bill");
        assertEquals(true, t.hasHeadCount());
        SoftwareEngineer software1 = new SoftwareEngineer("a");
        for(int i =0;i<5;i++){
            SoftwareEngineer a = new SoftwareEngineer("s");
            t.addReport(a);
            SoftwareEngineer d = new SoftwareEngineer("d");
            assertEquals(true, t.hasHeadCount());
            t.addReport(d);
            
        }
        
        SoftwareEngineer f = new SoftwareEngineer("f");
        t.addReport(f);
        assertEquals(false, t.hasHeadCount());
    }
}



