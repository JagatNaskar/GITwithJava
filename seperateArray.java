package Assignment1;

import java.util.Scanner;

public class seperateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			 System.out.println("Seperate even and odd array into two array");
		 
		 int n = 6;
		 int arr[] = new int[n];
		 System.out.println("Enter "+n+" elements : ");
		 for(int i = 0; i<n; i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 int n1=6, n2 = 6, k=0, k1=0;
		 int arr1[] = new int[n1];
		 int arr2[] = new int[n2];
		 for(int i = 0; i<n; i++)
		 {
			 if(arr[i] %2 == 0)
				 arr1[k++] = arr[i];
			 else arr2[k1++] = arr[i];
		 }
		 
		 for(int i = 0; i<n1; i++)
		 {
			 System.out.println(arr1[i]);
		 }
		 System.out.println("____________");
		 for(int i = 0; i<n2; i++)
		 {
			 System.out.println(arr2[i]);
		 }

	}

}
