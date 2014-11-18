/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class TeachingAssistant extends Employee implements person
{
    String age;
    int yearofbirth;

    public TeachingAssistant(String age, int yearofbirth, String empfirstname, String empid) 
    {
        super(empfirstname, empid);
        this.age = age;
        this.yearofbirth = yearofbirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    @Override
    public double calculateSalary() 
    {
        return 0.0;
    }
    
    
}
