package LearningGIT;

import java.util.Scanner;

public class allOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter + for additaion");
		System.out.println("Enter - for subtraction");
		System.out.println("Enter * for multiplication");
		System.out.println("Enter / for division");
		System.out.println("++++++_______******///////");
		System.out.println("Enter your choices : ");
		String choice = sc.next();
		switch(choice)
		{
		case "+":
			System.out.println(n1+" + "+n2+" = "+(n1+n2));
			
			break;
		case "-":
			System.out.println(n1+" - "+n2+" = "+(n1-n2));
			break;
		case "*":
			System.out.println(n1+" * "+n2+" = "+(n1*n2));
			break;
		case "/":
			System.out.println(n1+" / "+n2+" = "+(n1/n2));
			break;
		default:System.out.println("Wrong choice.");
			break;
			
		}
	}

}
