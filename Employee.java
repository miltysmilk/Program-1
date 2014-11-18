/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public abstract class Employee 
{
   private String empfirstname;
    private double emplastname;
    private String empid;

    public Employee()
    {
        
    }

    public Employee(String empfirstname, String empid)
    {
        this.empfirstname = empfirstname;
        this.empid = empid;
    }
    
   
    public String getEmpfirstname() {
        return empfirstname;
    }

    public void setEmpfirstname(String empfirstname)
    {
        this.empfirstname = empfirstname;
    }
   
    
}
