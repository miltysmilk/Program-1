/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class HourlyEmployee extends Employee implements person
{
    private int noofhrsworked;
    private double salary;

    public HourlyEmployee(int noofhrsworked, String empfirstname, String empid)
    {
        super(empfirstname, empid);
        this.noofhrsworked = noofhrsworked;
    }

    public int getNoofhrsworked() {
        return noofhrsworked;
    }

    public void setNoofhrsworked(int noofhrsworked) {
        this.noofhrsworked = noofhrsworked;
    }

    @Override
    public String toString() 
    {
        return "HourlyEmployee{" + "noofhrsworked=" + noofhrsworked + ", salary=" + salary + '}';
    }

    @Override
    public double calculateSalary() 
    {
    return 0.0;
    }
    
}
