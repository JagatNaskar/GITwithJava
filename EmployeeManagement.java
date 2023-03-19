package java_Collection_10thMarch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class Employee implements Serializable{
	int id;
	String name;
	int salary;
	long mobile_no;
	String email;
	String address;
	public Employee(int id, String name, int salary, long mobile_no, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobile_no = mobile_no;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobile_no=" + mobile_no + ", email="
				+ email + ", address=" + address + "]";
	}
	
}


public class EmployeeManagement {
	public static void display(ArrayList<Employee> arr)
	{
		System.out.println("\n___________________________________Employee Details________________________________________");
		System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s", "ID", "NAME", "SALARY", "MOBILE", "EMAIL", "ADDRESS"));
		for(Employee e:arr) {
			System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s", e.id, e.name, e.salary, e.mobile_no, e.email, e.address));
		}
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, salary;
		String name, email, address;
		long mobile_no;
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		File f = null;
		FileInputStream fileIS = null;
		FileOutputStream fileOS = null;
		ObjectInputStream objectIS = null;
		ObjectOutputStream objectOS = null;
		try {
			f = new File("/Users/jagatnasakar/eclipse-workspace/javaCodes/springcore2/src/main/java/java_Collection_10thMarch/EmployeeeeData.txt");
			if(f.exists())
			{
				fileIS = new FileInputStream(f);
				objectIS = new ObjectInputStream(fileIS);
				arr = (ArrayList<Employee>)objectIS.readObject();
				
			}
		}catch(Exception e1) {
			System.out.println(e1);
		}
		
		do {
			System.out.println("Enter 1 to DISPLAY all the Employee details.");
			System.out.println("Enter 2 to ADD Employee Details.");
			System.out.println("Enter 3 to DELETE a Employee Details.");
			System.out.println("Enter 4 to UPDATE Employee details.");
			System.out.println("Enter 5 to search for a employee with its id");
			System.out.println("Enter 6 to exit.");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("______________DISPLAYING__________________________");
					display(arr);
					System.out.println("__________________________________________________");
					break;
				case 2:
					System.out.println("______________ADDING EMPLOYEE_____________________");
					System.out.println("Add employee Details");
					System.out.println("Enter employee ID: ");
					id = sc.nextInt();
					System.out.println("Enter employee NAME: ");
					name = sc.next();
					System.out.println("Enter the SALARY of the employee: ");
					salary = sc.nextInt();
					System.out.println("Enter mobile number: ");
					mobile_no = sc.nextLong();
					System.out.println("Enter employee EMAIL: ");
					email = sc.next();
					System.out.println("Enter employee ADDRESS: ");
					address = sc.next();
					arr.add(new Employee(id, name, salary, mobile_no, email, address));
					
					System.out.println("__________________________________________________");
					display(arr);
					System.out.println("__________________________________________________");
					break;
				case 3:
					System.out.println("_____DELETE selected_____");
					System.out.println("Enter employee ID to delete: ");
					int iid = sc.nextInt();
					for(Employee e:arr)
					{
						if(e.id == iid)
						{
							int index = arr.indexOf(e);
							arr.remove(index);
							break;
						}
					}
					display(arr);
					break;
				case 4:
					System.out.println("__________________UPDATE_______________________");
					System.out.println("Enter the empID to update the employee: ");
					int empid = sc.nextInt();
					int j = 0;
					for(Employee e: arr) {
						if(empid == e.id) 
						{
							j++;
							do {
								int ch = 0;
								System.out.println("Choose your option to edit the detail");
								System.out.println(" 1.id \n 2.name \n 3.Salary \n 4.Mobile Number \n 5.Email \n 6.Address \n 7.Exit \n Enter your choice: ");
								ch = sc.nextInt();
								switch(ch)
								{
								case 1:
									System.out.println("Enter employee's new Employee ID: ");
									e.id = sc.nextInt();
									break;
								case 2:
									System.out.println("Enter employee's new Employee NAME: ");
									e.name = sc.next();
									break;
								case 3:
									System.out.println("Enter employee's new SALARY: ");
									e.salary = sc.nextInt();
									break;
								case 4:
									System.out.println("Enter employee's new MOBILE no: ");
									e.mobile_no = sc.nextLong();
									break;
								case 5:
									System.out.println("Enter employee's new EMAIL: ");
									e.email = sc.next();
									break;
								case 6:
									System.out.println("Enter the employee's new address: ");
									e.address = sc.next();
									break;
								case 7:
									j++;
									break;
								default:
									System.out.println("Select only from the list.");
									break;
								}
								System.out.println("\n___________________________________");
								System.out.println(e);
								System.out.println("___________________________________\n");
							}while(j <= 1);
						}
					}
					break;
				case 5:
					System.out.println("____________________SEARCHING______________________");
					System.out.println("Enter the emp id to search: ");
					int searchId = sc.nextInt();
					int jj = 0;
					for(Employee e: arr) {
						if(searchId == e.id)
						{
							System.out.println(e);
							jj++;
						}
					}
					if(jj == 0)
						System.out.println("Employee with id "+searchId+"is not present in the database.");
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Enter correct choice from the list.");
			}
		}while(6<7);

	}

}
