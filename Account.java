
package OOPS_Assignment;
public class Account{

protected long accountNo;
	protected String name;
	protected String address;
	protected long phoneNo;
	protected String dob;
	protected double balance;
	
	public Account(long accountNo,String name,String address,long phoneNo,String dob,long balance){
		this.accountNo=accountNo;
		this.name=name;
		this.address=address;
		this.phoneNo=phoneNo;
		this.dob=dob;
		this.balance=balance;
	}
	
	/*setter getter for balance*/
	public void setBalance(long balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	/*setter getter for phoneNo*/
	public void setPhoneNo(long phoneNo){
		this.phoneNo=phoneNo;
	}
	public long getPhoneNo(){
		return phoneNo;
	}
	/*setter getter for Dob*/
	public void setDob(String dob){
		this.dob=dob;
	}
	public String getDob(){
		return dob;
	}
	/*setter getter for accountNo*/
	public void setAccountNo(int x){
		accountNo=x;
	}
	public long getAccountNo(){
		return accountNo;
	}
	/*setter getter for name*/
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	/*setter getter for Address*/
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	
	
	public boolean closeAccount(){
		boolean res=true;
		return res;
	}
}