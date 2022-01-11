package InterfaceConcept;

public class TestFortisHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot pass any varible which is referred to other classes or interface
		FortisHospital fh = new FortisHospital(); //parameterized constr...
		fh.cardioServices();
		fh.orthoServices();
		
		fh.doctorAvaibility(20);
		int fee = IndianMedicalBoard.minimum_fee;
		fh.ultrasonicServices();
		
		fh.covid19Funds();
		//we cannot assign a varible which is declared in the interface as it is final in nature
		//IndianMedicalBoard.minimum_fee=600;
		
		//System.out.println(fee);
		//Top-casting (Upcasting) - creating the object of child class and reference variable is of the parent
		IndianMedicalBoard in = new FortisHospital();
		in.orthoServices();
		in.cardioServices();
		in.covid19Test();
		
		//Downcasting - creating the object of parent class/interface and reference variable is of the parent
		// We cannot perform downcasting for the interface
		//new IndianMedicalBoard();
		
		//
		
		//WebDriver driver = new ChomeDriver();
	}

}

//1. compiler time error - Aakash, Yogesh
//2. runtime error - Chaitanya, Vaibhav, Buddha, Swati, Ankita, Preeti,Madhurima,Nikhil, Ankita, Naresh, Stephen, Rahul
//3. some output - no error
//4. not sure - bhavna, Rutuja,