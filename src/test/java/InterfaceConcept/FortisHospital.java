package InterfaceConcept;

public class FortisHospital extends UNHO implements IndianMedicalBoard, USMedicalBoard, GermanMedicalBoard {

	// we have to define the method while we are implementing them in the class
	@Override
	public void orthoServices() {    // method definition
		// TODO Auto-generated method stub
		System.out.println("FH -- orthoServices");

	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- neuroServices");

	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH -- emergencyServices");

	}

	@Override
	public void ultrasonicServices() {
		System.out.println("FortisHospital -- ultrasonicServices");
	}

	/*
	 * we cannot override any static methods because the memory for them is assigned
	 * in CMA
	 * 
	 * @Override public static void billing() {
	 * System.out.println("FortisHospital -- billing"); }
	 */

	@Override
	public void gynecServices() { // TODO Auto-generated method stub
		System.out.println("FH -- gynecServices");

	}

	@Override
	public void entServices() { // TODO Auto-generated method stub
		System.out.println("FH -- entServices");

	}

	@Override
	public void dentalServices() { // TODO Auto-generated method stub
		System.out.println("FH -- dentalServices");

	}

	public void doctorAvaibility(int x) {
		System.out.println("Current we are serving with " + x + " doctors.");
	}

	@Override
	public void xrayServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHospital -- xrayServices");
		
	}

	@Override
	public void oncology() {
		// TODO Auto-generated method stub
		System.out.println("FortisHospital -- oncology");

		
	}

	@Override
	public void covid19Test() {
		// TODO Auto-generated method stub
		System.out.println("FortisHospital -- Covid19Test");
		
	}

	@Override
	public void amubulanceServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHospital -- amubulanceServices");
		
	}

}


//yes - Ankita, Vaibhav, Madhurima, Naresh, Rahul, Budha, Nikhil, Deepika, Swati, Chaitanya, Preeti, Rutuja

//no -