package ObjectAndClasses;

public class Users {
	
	// some class variable and/or some class methods also be there
	// variables or data members
	String name;
	int age;
	String city;
	//String companyName = "AapnaInfotech";

	public static void main(String[] args) {

		Users u1 = new Users();
		
		u1.name="Bhawna";
		u1.age=25;
		u1.city="Gurgaon";
		
		Users u2 = new Users();
		u2.name = "Rutuja";
		u2.age = 27;
		u2.city = "Pune";
		
		Users u3 = new Users();
		u3.name = "Naresh";
		u3.age = 28;
		u3.city = "New Delhi";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Bhawna 25 Gurgaon
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Rutuja 27 Pune
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// Naresh 28 New Delhi
		
System.out.println("==========================================================");

		u1 = u2;
		

		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Bhawana 25 GGn(Ankita,Stephen,Nikhil  // Rutuja 27 Pune (naresh, Madhurima, swati
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// Bhawana 25 GGn // Rutuja 27 Pune
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Naresh 28 ND

System.out.println("==========================================================");

		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Rutuja 27 Pune
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Naresh 28 ND
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// Naresh 28 ND
		
		
System.out.println("==========================================================");

		u3 = u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Rutuja 27 Pune
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Naresh 28 New Delhi
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Rutuja 27 Pune
		
		
	}

}