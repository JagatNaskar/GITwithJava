package Assignment1;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" element: ");
		int lar=0, secLar = 0;
		
		for(int i = 0; i <n; i++) 
		{
			arr[i] = sc.nextInt();
			if(arr[i]>lar)
				lar = arr[i];
		}
		for(int i = 0; i<n; i++)
		{
			if(arr[i]>secLar && arr[i]!=lar)
				secLar = arr[i];
		}
		System.out.println("The second largest element = "+secLar);
		
		}

}
