package java_Collection_10thMarch;

class NegativeRadiusException extends Exception{//creating my own exception
	
	@Override
	public String toString() {
		return "radius cannot be <=0";
	}
	@Override
	public String getMessage() {
		return "I got your message";
	}
	
	
}
public class OwnException {
	
	public static double area(int r) throws NegativeRadiusException
	{
		if(r<=0)
			throw new NegativeRadiusException();
		return (Math.PI*Math.pow(r, 2));
	}
	
	public static int divide(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 7;
		OwnException ob1 = new OwnException();
		try {
			System.out.println("Area of circle = "+ob1.area(radius));
		}catch(Exception NegativeRadiusException) {System.out.println("Radius Exception");}
		
		try {
			ob1.divide(44, 0);
		}catch(Exception e) {System.out.println("Divide by zero error...");}

	}
	

}
