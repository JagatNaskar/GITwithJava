package java_Collection_10thMarch;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EmpMain extends DisplayEmp{

	

	public static void main(String[] args) 
	{
		DisplayEmp emp = new DisplayEmp();
		Scanner sc = new Scanner(System.in);
		while(1) {
			System.out.println("Enter 1 to DISPLAY all the Employee details.");
			System.out.println("Enter 2 to ADD Employee Details.");
			System.out.println("Enter 3 to DELETE a Employee Details.");
			System.out.println("Enter 4 to UPDATE Employee details.");
			System.out.println("Enter 5 to exit.");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					emp.display();
					break;
				case 2:
					emp.Details();
					break;
				case 3:
					emp.Delete();
					break;
				case 4:
					emp.Update();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter correct choice.");
		}
				
		}
		
		
		
		
		
		
		
		


	}
	

}





//
//// TODO Auto-generated method stub
//  try {
//	  
//        
//        FileReader fr = new FileReader("gfgInput.txt");
//        FileWriter fw = new FileWriter("gfgOutput.txt");
//
//      
//        
//      
//       
//        fr.close();
//        fw.close();
//        System.out.println(
//            "File reading and writing both done");
//    }
//    catch (IOException e) {
//    	System.out.println("There are some IOException");
//    }