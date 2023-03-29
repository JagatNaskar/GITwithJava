package Collection2Week6;
import java.util.*;
public class CURD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		List<Integer>li = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("Enter 1 to add element in the list.");
			System.out.println("Enter 2 to remove.");
			System.out.println("Enter 3 to Display.");
			System.out.println("Enter 4 to exit.");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			ListIterator<Integer>LI = li.listIterator();
			switch(ch)
			{
				case 1:
					System.out.println("Enter a integer to add in the list: ");
					li.add(sc.nextInt());
					break;
				case 2:
					if(LI.hasPrevious())
						LI.remove();
					break;
				case 3:
					System.out.println(li);
					break;
				case 4:
					System.exit(0);
				default:
					continue;
				
			}
			
		}
	}

}
