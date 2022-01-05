package ObjectAndClasses;

public class StaticKeyword {
	
	// non-static variable
	String name;
	
	//static variable
	static int age;
	
	//non-static method
	public void test(){
		System.out.println("test method");
	}
	
	
	//static method
	public static void getMail() {
		System.out.println("get mail method");
	}
	
	public static void main(String []a) {

		//1. how to call static vars and methods:
		//a. no need to create the object for static stuff:
		//age = 25;
		getMail();
		
		//b. you can access static vars/methods by using the class name:
		StaticKeyword.age = 40;
		System.out.println(StaticKeyword.age);
		StaticKeyword.getMail();

		//how to access/call non static stuff:
		//have to create the object
		StaticKeyword obj = new StaticKeyword();
		obj.name = "Tom";
		obj.test();
		
		StaticKeyword.age=30;
		System.out.println("Age using the object reference : "+obj.age);
		
		
	}

}