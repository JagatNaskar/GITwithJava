package java_Collection_10thMarch;

public class MainTest {
	
	    public static void main(String[] args)
	    {
	        //Integer type
	    	GenericsProgram<Integer> obj = new GenericsProgram<Integer>(960);
	        System.out.println(obj.getObject());
	  
	        //String type
	        GenericsProgram<String> StingObj = new GenericsProgram<String>("My name is khan...");
	        System.out.println(StingObj.getObject());
	    }

}
