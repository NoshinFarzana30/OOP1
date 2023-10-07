package  classes;
import java.lang.*;

public class HairDresser extends Employee
{
	
	public void showInfo()
	{
		System.out.println("Name: "+getName());
		System.out.println("ID: "+getEmpId());
		System.out.println("Salary: "+getSalary());
		System.out.println();
	}
}