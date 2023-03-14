package java_Collection_10thMarch;

public class GenericsFunction {
	
	    // example of generics method
	    static <T> void genericDisplay(T element)
	    {
	        System.out.println(element.getClass().getName()
	                           + " = " + element);
	    }
	  
	   
	    public static void main(String[] args)
	    {
	       
	        genericDisplay(11);
	        genericDisplay("GeeksForGeeks");
	        genericDisplay(1.0);
	    }
	
}
