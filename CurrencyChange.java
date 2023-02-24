package Assignment1;

import java.util.Scanner;

public class CurrencyChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      double amount, rupee, dollar, pound, euro, yen, ringgit;
	      int choice;
	 
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Following are the Choices:");
	      System.out.println("Enter 1: Ruppe to $ : ");
	      System.out.println("Enter 2: Dollar to Rs : ");
	      System.out.println("Enter 3: Pound to rs : ");
	      System.out.println("Enter 4: rs to pound : ");
	      System.out.println("Enter 5: Euro to yen : ");
	      System.out.println("Enter 6: Yen to rs : ");
	      
	 
	      System.out.print("\nChoose from above options: ");
	      choice = sc.nextInt();
	 
	      switch (choice)
	      {
	         case 1:  
	        	 System.out.println("Enter the amount in Rs you want to convert to $ :");
	   	      	amount = sc.nextFloat();
	   	      	dollar = amount * 0.012;
	   	      	System.out.println("₹"+amount+" = $"+dollar);
	        	break;
	         case 2:
	        	 System.out.println("Enter the amount in dollar you want to convert to ₹ :");
		   	      	amount = sc.nextFloat();
		   	      	rupee = amount * 82.79;
		   	      	System.out.println("$"+amount+" = ₹"+rupee);
		        	break;
	         case 3:
	        	 System.out.println("Enter the amount in pound you want to convert to ₹ :");
		   	      	amount = sc.nextFloat();
		   	      	rupee = amount * 99.85;
		   	      	System.out.println("£"+amount+" = ₹"+rupee);
		        	break;
	         case 4:
	        	 System.out.println("Enter the amount in Rs you want to convert to Pound :");
		   	      	amount = sc.nextFloat();
		   	      	pound = amount * 0.010;
		   	      	System.out.println("₹"+amount+" = £"+pound);
		        	break;
	         case 5:
	        	 System.out.println("Enter the amount in Euro you want to convert to Yen :");
		   	      	amount = sc.nextFloat();
		   	      	yen = amount * 143.14;
		   	      	System.out.println("£"+amount+" = ¥"+yen);
		        	break;
	         case 6:
	        	 System.out.println("Enter the amount in Yen you want to convert to Rs :");
		   	      	amount = sc.nextFloat();
		   	      	rupee = amount * 0.61;
		   	      	System.out.println("¥"+amount+" = ₹"+rupee);
		        	break;
	      
	      }

	}

}
