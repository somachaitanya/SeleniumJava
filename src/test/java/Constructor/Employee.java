package Constructor;

public class Employee {

	public String name;
	public int empId;
	public boolean isActive;
	public String department;
	public String city;
	public int age;

	public Employee() { // default const...
		System.out.println("default const called...");
	}

	public Employee(String name, int empId) { // parameterized const
		this.name = name;
		this.empId = empId;
	}

	public void Employee(String name, int empId, int age) { // parameterized const
		this.name = name;
		this.empId = empId;
		this.age = age;
	}

	public Employee(String name, int empId, boolean isActive, String department, String city, int age) {
		this.name = name;
		this.empId = empId;
		this.isActive = isActive;
		this.department = department;
		this.city = city;
		this.age = age;
	}

	public static void main(String[] args) {
		/*
		 * Employee emp = new Employee("Ankita", 103); System.out.println(emp.name + " "
		 * +emp.empId);
		 * 
		 * Employee emp1 = new Employee("Rutuja", 104); System.out.println(emp1.name +
		 * " " +emp1.empId);
		 * 
		 * Employee emp2 = new Employee("Kapil", 105); System.out.println(emp2.name +
		 * " " +emp2.empId);
		 * 
		 * Employee emp3 = new Employee("Nikhil",106,true,"Technology","Ggn",25);
		 * 
		 */
		Employee emp = new Employee();
		emp.Employee("Ankita", 103, 24);
		System.out.println(emp.name + " " + emp.empId + " " + emp.age);
	}

}

//1. nothing - Chaitanya,  Ankita
//2. Ankita 103 - Yogesh, Deepu, Kapil, Madhu, Preeti, Deepika, Nikhil, Stephen
//3. error - Rutuja
//4. null 0