import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import java.io.*;



public class Start
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Beauty Salon Management System");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		BeautySalon b = new BeautySalon();
		
		while(choice)
		{
			System.out.println();
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Customer Management");
			System.out.println("	3. Exit the Application\n");
			System.out.print("What do you want to do? : ");
			
			int first = sc.nextInt();
			
			switch(first)
			{
				case 1:
					
					System.out.println("You have selected Employee Management");
					System.out.println();
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Employee");
					System.out.println("	2. Remove Existing Employee");
					System.out.println("	3. See all Employees");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second1 = sc.nextInt();
					sc.nextLine();
					
					switch(second1)
					{
						case 1:

						Employee e = new Employee();
							
							System.out.println("You have Selected to create a new Employee\n");
							System.out.println();
							System.out.print("Enter Employee Id: ");
							String empId = sc.nextLine();
							System.out.print("Enter Employee Name: ");
							String name = sc.nextLine();
							System.out.print("Enter Employee Designation: ");
							System.out.println();
							System.out.println("1. Makeup Artist");
							System.out.println("2. Hair Dresser");
							System.out.println("3. Manager");
							int designation = sc.nextInt();
							if(designation==1){
								e.setDesignation("Makeup Artist");
							}
							else if(designation==2){
								e.setDesignation("Hair Dresser");
							}
							else if(designation==3){
								e.setDesignation("Manager");
							}
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							e.setEmpId(empId);
							e.setName(name);
							e.setSalary(salary);

							try {
								
								FileWriter fstream = new FileWriter("C:/java/beauty salon/database.txt", true);
								BufferedWriter out = new BufferedWriter(fstream);

								out.write("Employee name: "+e.getName()+", Employee ID: "+e.getEmpId()+", Designation: "+e.getDesignation()+", Salary: "+ e.getSalary()+"\n");
								out.close();


							} catch (Exception c) {
								c.printStackTrace();
							}
							
							b.insertEmployee(e);
							
							
							break;
							
						case 2:
							
							System.out.println("You have Selected to remove an existing Employee");
							System.out.println();
							System.out.print("Enter Employee Id: ");
							
							
							b.removeEmployee(b.getEmployee(sc.next()));
							
							break;
							
						case 3:
							
							System.out.println("You have Selected to see all Employees");
							
							b.showAllEmployees();
							
							break;
						
						case 4:
							
							System.out.println("You have Selected to Go Back");
							break;
						
						default:
							
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("You have selected Customer Management");
					
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Customer");
					System.out.println("	2. Remove Existing Customer");
					System.out.println("	3. See all Customers");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second2 = sc.nextInt();
					
					switch(second2)
					{
						case 1:

						Customer c = new Customer();
						
							System.out.print("Enter Serial Number: ");
							int snum1 = sc.nextInt();
                                                        sc.nextLine();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.nextLine();
							System.out.print("Enter Customer Phone Number: ");
							String num1 = sc.next();
							System.out.println();
							System.out.println("-----Price Chart-----");
							System.out.println("1. Haircut        - 500  BDT");
							System.out.println("2. Hairspa        - 1000 BDT");
							System.out.println("3. Brow Plucking  - 100  BDT");
							System.out.println("4. Manicure       - 800  BDT");
							System.out.println("5. Pedicure       - 800  BDT");
							System.out.println("6. Facial         - 1200 BDT");
							System.out.println();
							System.out.print("How Many Services Do You Want? ");
							int n = sc.nextInt();
							c.setSize(n);
							c.getChoice();
							
							c.setSerialNumber(snum1);
							c.setName(name1);
							c.setPhoneNumber(num1);

							try {

								FileWriter fstream = new FileWriter("C:/java/beauty salon/database.txt", true);
								BufferedWriter out = new BufferedWriter(fstream);

								out.write("Customer Name: "+ c.getName()+", Serial Number: "+ c.getSerialNumber()+", Phone Number: "+ c.getPhoneNumber()+", Total Bill: "+ c.getTotalBill()+"\n");
								out.close();

							} catch (Exception e) {
								e.printStackTrace();
							}
							
							b.insertCustomer(c);
							break;
							
						case 2:
						
							System.out.print("Enter Serial Number: ");
							int snum2 = sc.nextInt();
							
							b.removeCustomer(b.getCustomer(snum2));
							break;
						
						case 3:
						
							b.showAllCustomers();
							break;
						
						case 4:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
				
				
					
					
				case 3:
					
					System.out.println("You have selected to exit the Beauty Salon");
					System.out.println();
					System.out.println("Thank you for using our Beauty Salon");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Input");
					break;
			}
		}

		sc.close();
		
	}
}