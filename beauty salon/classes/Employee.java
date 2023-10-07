package  classes;
import java.lang.*;

public class Employee
{
	private String name;
        private String empId;
	private double salary;
        private String designation;

	
	public void setName(String name)
        {
           this.name = name;
        }
        public String getName()
        {
           return name;
        }

        
        public void setEmpId(String empId)
        {
           this.empId = empId;
        }
        public String getEmpId()
        {
           return empId;
        } 


	public void setSalary(double salary)
        {
           this.salary = salary;
        }
        public double getSalary()
        {
           return salary;
        } 

        public void setDesignation(String designation)
        {
           this.designation = designation;
        }
        public String getDesignation()
        {
           return designation;
        }
}