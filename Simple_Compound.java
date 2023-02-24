package Assignment1;

import java.util.Scanner;

public class Simple_Compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double p=0;
		float r=0;
		float t=0;
		double si=0;
		double ci = 0;
		
		System.out.println("Enter the principal amount: ");
		p = sc.nextDouble();
		System.out.println("Enter the rate of intrest: ");
		r = sc.nextFloat();
		System.out.println("Enter the the number of years: ");
		t = sc.nextFloat();
		System.out.println("SIMPLE INTEREST");
		si = (p*r*t)/100;
		System.out.println("_______________________1_________________________");
		System.out.println("The simple interest is ₹"+si);
		System.out.println("After "+t+"years the amount is ₹"+(si+p));
		System.out.println("_______________________2_________________________");
		System.out.println("Compound Interest using formula");
		double compound_interest = p * (Math.pow((1 + r / 100), t)) - p;
	      System.out.println("The Compound Interest is : " + compound_interest);
	    System.out.println("________________________3________________________");
	    System.out.println("Compound Interest without using formula");
	    double k=0;
		for(int i = 1; i <=(int)t; i++)
		{
			ci = (p*r)/100;
			k = k+ci;
			p = p+ci;
			
		}
		System.out.println("CI = "+k);
		System.out.println("________________________4________________________");
		
		
	   
	}

}
