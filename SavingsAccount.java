package OOPS_Assignment;

public class SavingsAccount {
	double balance = 0;
	public boolean withdraw(double amount){
		boolean res;
		if(amount>=balance){
			balance=balance-amount;
			res=true;
		}else{
			res=false;
		}
		return res;
	}
	public void deposit(double amount){
		balance=balance+amount;
	}
	public void fixedDeposit(){
		
	}
}
