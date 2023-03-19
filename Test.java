
package java_Collection_10thMarch;
import java.util.Scanner;
class Test{
	//String name,int id,String department,double salary,String address,String email,String number
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		EmployeeUtil util=new EmployeeUtil();
		
		System.out.println("Employee App Function");
		System.out.println("-----------------------------------");
		System.out.println("press 1 for Adding Employee Data");
		System.out.println("press 2 for Searching Employee Data");
		System.out.println("press 3 for Deleting Employee Data");
		System.out.println("press 4 for Updating Employee Data");
		System.out.println("press 5 for Showing Employee Data");
		int choose=0;
		while(true){
			choose=sc.nextInt();
			if(choose==1 || choose==2 || choose==3 || choose==4 || choose==5){
				break;
			}
			else{
				System.out.println("Wrong pressed !!");
				System.out.println("Please enter right key :");
			}
			
		}
		
		 switch(choose){
			case 1: //util.addEmployee(); 
					System.out.println("Calling AddEmployee method");
					Employee emp=new Employee("Ashutosh Tigga",1,"SDE",50000,"Chaibasa","ashutoshtigga@gmail.com","8743287789");
				    Employee emp2=new Employee("Shiva Tigga",2,"SSDE",90000,"Indoe","Shiva@gmail.com","3745873878");
				    Employee emp3=new Employee("amit sharma",82,"SSDE",870000,"Indore","amit@gmail.com","4387284792");
					System.out.println("Addind Employee"+util.addEmployee(emp));
					System.out.println("Addind Employee"+util.addEmployee(emp2));
					System.out.println("Addind Employee"+util.addEmployee(emp3));
					break;
			case 2: //util.searchEmployee();
					System.out.println("Calling SearchEmployee method");
					break;
			case 3: //util.deleteEmployeeByName();
					System.out.println("Calling DeleteEmployee method");
					System.out.println(util.deleteEmployeeByName("amit"));
					break;
			case 4: //util.updateEmployee();
					System.out.println("Calling updateEmployee method");
					break;
			case 5:
					System.out.println("******************");
					System.out.println("Employee Details");
					System.out.println("******************");
				    util.showEmployee();
				
		} 
		
	}
}


// Employee emp=new Employee("Ashutosh Tigga",001,"SDE",50000,"Chaibasa","ashutoshtigga@gmail.com","8743287789");
		// Employee emp2=new Employee("Shiva Tigga",002,"SSDE",90000,"Indoe","Shiva@gmail.com","3745873878");
		// EmployeeUtil util=new EmployeeUtil();
		
		// /* System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp2));
		// System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp)); */
		
/* 		HashSet<String> emplist=util.loadData(); */
		//for(String s:emplist){
			
		//	System.out.println(s);
	//	}
	//	System.out.println(util.deleteEmployeeByName("shiva"));
	//	util.showEmployee();