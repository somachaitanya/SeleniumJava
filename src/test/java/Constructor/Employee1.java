package Constructor;

public class Employee1 {
	
	public String name;
	public int empId;
	public boolean isActive;
	public String department;
	public String city;
	public int age;
	
	//Constructor... 
	// name should be same as class
	// constructor overloading
	// there should be no return type
	
	/*
	 * public Employee1() { //default constructor
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1();
		emp1.name= "Deepu";
		emp1.empId =101;
		emp1.isActive = true;
		emp1.department = "Technology";
		emp1.city ="New Delhi";
		emp1.age=23;
		
		Employee1 emp2 = new Employee1();
		emp2.name= "Rahul";
		emp2.empId =102;
		emp2.isActive = false;
		emp2.department = "Technology";
		emp2.city ="New Delhi";
		emp2.age=25;

	}

}
