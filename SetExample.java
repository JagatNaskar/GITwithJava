package Collection2Week6;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of element: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter a element: ");
			arr[i] = sc.nextInt();
			
		}
		for(int j = 0; j <n; j++)
		{
			System.out.print(arr[j]+" ");
			s.add(arr[j]);
		}
		System.out.println();
		System.out.println(s);
	}

}
