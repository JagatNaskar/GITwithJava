
package java_Collection_10thMarch;
import java.util.*;


import java.io.*;
class EmployeeUtil{
	
	/*
	this static block will execute first when we run and it will create file if it does't exist 
	*/
	static {
		try {
            File file = new File("empdata.txt");
            if (file.createNewFile()) {
                System.out.println("File created: "+ file.getName());
				FileWriter out=new FileWriter(file,true);
				String head=String.format("%-20s %-20s %-20s %-20s %-20s %-30s %-20s \n","ID","Name","Address","Department","Phone","Email","Salary");
				String seperator=String.format("%-20s %-20s %-20s %-20s %-20s %-30s %-20s \n","----------","----------","----------","----------","----------","-------------------","----------");
				out.write(head);
				out.write(seperator);
				out.close();
            }
            else {
                System.out.println("");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}
	
	/*
	This method will save single data into file 
	*/
	private void saveData(String data){
		try{
		FileWriter out=new FileWriter("empdata.txt",true);
		out.write(data);
		out.close();
		}catch(Exception e){
			System.out.println("error occur");
		}
	}
	
	/*
	This method will save multiple data into file
	*/
	private void saveAllData(HashSet<String> data){
		try{
			FileWriter out=new FileWriter("empdata.txt");
			String head=String.format("%-20s %-20s %-20s %-20s %-20s %-30s %-20s \n","ID","Name","Address","Department","Phone","Email","Salary");
				String seperator=String.format("%-20s %-20s %-20s %-20s %-20s %-30s %-20s \n","----------","----------","----------","----------","----------","-------------------","----------");
				out.write(head);
				out.write(seperator);
			for(String s:data){
				out.write(s+"\n");
			}
			out.close();
				
		}catch(Exception e){
		}
	}
	
	/*To ensure no dublicate data in file this method is internally invoke by  some methods*/
	private boolean validation(String data){
		HashSet<String> setOfEmp=loadData();
		//System.out.println("Validation method");
		for(String s:setOfEmp){
			//System.out.print(s.substring(0,6)+"equals"+(data.substring(0,6)));
			//System.out.println(s.substring(0,6).equals(data.substring(0,6)));
			
			if(s.substring(0,6).equals(data.substring(0,6))){
				
				//System.out.println("s.substring(0,6).equals(data.substring(0,6))"+s.substring(0,6).equals(data.substring(0,6)));
				return false;
			}
		}
		return true;
	}
	
	/*
	this method takes employee details and call validation method  internally if there is no dublicate data found then it will invoke saveData() to save employee data into file 
	*/
	public String addEmployee(Employee emp){
		boolean res=false;
		String data=String.format("%-20s %-20s %-20s %-20s %-20s %-30s %-20s \n",emp.getEmp_id(),emp.getEmp_name(),emp.getEmp_address(),emp.getEmp_department(),emp.getEmp_number(),emp.getEmp_email(),emp.getEmp_salary());
		if(validation(data)){
			saveData(data);
			res=true;
		}
		if(res){
			return "Added";
		}else{
			return "Data Already Exist";
		}
	}
	
	/*
	This method is used for load the data from file
	*/
	private HashSet<String> loadData(){
		HashSet<String> set=new HashSet();
		BufferedReader out =null;
			try{
			out=new BufferedReader(new FileReader("empdata.txt"));
			String data="";
			data=out.readLine();
			data=out.readLine();
			while((data=out.readLine())!=null){
				set.add(data);
			}
			}catch(Exception e){
				System.out.println("error");
			}finally{
				try{
				if(out!=null){
					out.close();
				}
				}catch(Exception e){
					System.out.println();
				}
			}
		return set;
	}
	
	
	public String deleteEmployeeByName(String name){
		boolean res=false;
		HashSet<String> listofEmp =loadData();
		try{
			for(String s:listofEmp){
				if(s.substring(21,40).toLowerCase().contains(name.toLowerCase())){
					//System.out.println("before deleted"+s.substring(21,40).toLowerCase()+" conrains "+name.toLowerCase()+s.substring(21,40).toLowerCase().contains(name.toLowerCase()));
					listofEmp.remove(s);
					//System.out.println("after deleted");
					res=true;
				}//end of if
			}//end of for loop
		}catch(ConcurrentModificationException e){
			//System.out.println("Error");
		}
		//System.out.println("saving data");
		saveAllData(listofEmp);
		if(res){
			return "Deleted :"+name;
		}else{
			return "Employee Not found!!";
		}
	}
	
	public void  showEmployee(){
		
		try{
			BufferedReader out =new BufferedReader(new FileReader("empdata.txt"));
			String data="";
			while((data=out.readLine())!=null){
				System.out.print(data+"\n");
			}
		}catch(Exception e){
			System.out.println("error");
		}
	}
	
	public Employee searchEmployeeById(){
		return null;
	}
	
	
	
	public List<Employee> searchEmployeeByName(String name){
		
		return null;
	}

}