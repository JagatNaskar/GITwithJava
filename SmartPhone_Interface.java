package OOPS_Assignment;

public class SmartPhone_Interface extends Phone_Interface implements CameraInterface_Interface, MusicPlayerInterface_Interface {
	
	//void click()
	//void record()
	public void click() {
		
		System.out.println("I am clicking from click method.");
		
	}
	public void record() {
		System.out.println("Inside record method");
	}
	
	
	//void play();
	//void stop();
	public void play()
	{
		System.out.println("Start Playing music from play method");
	}
	public void stop()
	{
		System.out.println("Stopped playing music from stop method ");
	}
	public static void main(String args[])
	{
		Phone_Interface pI = new Phone_Interface();
		pI.call();
		pI.sms();
		
		System.out.println("________________________________");
		System.out.println("I am in Interface");
		SmartPhone_Interface cI = new SmartPhone_Interface();
		cI.click();
		cI.record();
		cI.play();
		cI.stop();
	}
}
