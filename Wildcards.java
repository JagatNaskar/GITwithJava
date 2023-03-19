package java_Collection_10thMarch;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
	 private static double sum(List<? extends Number> list)
	    {
	        double sum = 0.0;
	        for (Number i : list) {
	            sum += i.doubleValue();
	        }
	 
	        return sum;
	    }
	
	 public static void main(String[] args)
	    {
	 
	        // Integer List
	        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
	        System.out.println("Total sum is:" + sum(list1));
	 
	        // Double list
	        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
	        System.out.print("Total sum is:" + sum(list2));
	        
	    }
	 
	   
	
	
	
}
