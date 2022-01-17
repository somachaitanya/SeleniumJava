package Inheritance;

public class SuperClassExample01 extends ParentClass{

	int x=20;
	
	int childAge;
//super keyword - 
//super()
	
	SuperClassExample01(int childAge){
		super(25);
		this.childAge = childAge;
		
	}
	
	
	SuperClassExample01(){
		
	}
	
	
	public void printX() {
		// TODO Auto-generated method stub

		System.out.println("The value of x is :" + super.x);
	}
	
	
	
	
	
	@Override
	public void display() {
		System.out.println("child display...");
	}
	
	public void testDisplay() {
		super.display();
	}

}
