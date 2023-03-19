package java_Collection_10thMarch;

public class Employeeee {
	private String empName;
	private int empNo;
	private int empSal;
	private String address;
	private int mobile;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	public Employeeee(){
		 
	 } 
	public Employeeee(String empName, int empNo, int empSal, String address, int mobile) {
		super();
		this.empName = empName;
		this.empNo = empNo;
		this.empSal = empSal;
		this.address = address;
		this.mobile = mobile;
	}
	
}
