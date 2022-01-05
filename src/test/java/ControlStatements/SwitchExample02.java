package ControlStatements;

public class SwitchExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fname = "Swati";
		
		switch(fname) {
		
		case "Deepu":
			System.out.println(fname + " let us do some exercises on Java");
			break;
			
		case "Rutuja":
			System.out.println(fname + " Could you please record this session");
			break;
			
		default:
			System.out.println("Incorrect input");
			break;
		}
	}

}
