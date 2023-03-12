package OOPS_Assignment;

public class Circle extends Shape{
	int radius = 7;
	public void perimeter()
	{
		
		System.out.println(2*22/7*radius);
	}
	public void area()
	{
		
		System.out.println((22/7)*radius*radius);
	}
	public static void main(String args[])
	{
		Circle obj = new Circle();
		obj.radius =8; 
		obj.perimeter();
		obj.area();
	}
}
