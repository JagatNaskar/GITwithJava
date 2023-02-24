package Assignment1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DiffLoopTiming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println("Current date and time = "+formatter.format(date)); 
	    long mili = date.getTime();
	    System.out.println(mili);  
	    System.out.println("Checking for loop time: ");
	    for(int i = 0; i<1089880998; i++)
	    {
	    	
	    }
	    long mili1 = date.getTime();
	    System.out.println(mili1);  
		
		

	}

}
