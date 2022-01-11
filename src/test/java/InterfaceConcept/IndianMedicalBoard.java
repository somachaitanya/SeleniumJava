package InterfaceConcept;

public interface IndianMedicalBoard extends WHO, UN{

	// for interface - we have only method declaration.
	// by default the variables which are declared in the interface are static and
	// final in nature.
	//abstract method and non-abstract method
	//we can perform multiple - inheritance by using interfaces
	
	
	int minimum_fee = 500;

	//abstract methods
	public void orthoServices();

	public void cardioServices();

	public void neuroServices();

	public void emergencyServices();	
	
	// Jdk 1.8 we have got few methods which could be defined here in interface
	public static void billing() {
		System.out.println("IndianMedicalBoard -- Billing");
	}
	
	public static void infra() {
		System.out.println("IndianMedicalBoard -- infra");
	}
	
	default void ultrasonicServices() {
		System.out.println("IndianMedicalBoard -- ultrasonicServices");
	}
	
// yes - Aakash
// no - Madhu, Ankita, Swati, Chaitanya, Vaibhav, Bhavna, Nikhil, Naresh, Preeti

	
}
