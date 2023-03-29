package Collection2Week6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class uniqueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list1 = new ArrayList<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 element to store in the arraylist.");
		for(int i = 0; i <5; i++)
		{
			int t = sc.nextInt();
			list1.add(t);
		}
		ListIterator<Integer>lI = list1.listIterator();
		while(lI.hasNext())
			set1.add(lI.next());
		list1.clear();
	
		Iterator<Integer>I = set1.iterator();
		while(I.hasNext())
			list1.add(I.next());
		System.out.println(list1);
	}

}
