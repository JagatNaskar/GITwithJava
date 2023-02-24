package Assignment1;

import java.util.Scanner;

public class HighestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int n3 = sc.nextInt();
		int ans = n3;
		if(n1>n2 && n1>n3)
			ans = n1;
		else if(n2>n1 && n2>n3)
			ans = n2;
		System.out.println("The heigest number is "+ans);
		System.out.println("____________________________");
		System.out.println("Using ternary Operatior");
		ans = (n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3)?n2:n3;
		System.out.println(ans);
		System.out.println("____________________________");
		
	}

}
