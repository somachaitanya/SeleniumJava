package WorkingOnSelenium.LearnSelenium;

public class IfElseExample02 {

	public static void main(String[] args) {

		boolean isPassed = true;
		int marksInMaths = 40;
		
	if(isPassed && marksInMaths>50) {
		System.out.println("Studen is good in Maths.");
	}
	
	if(isPassed || marksInMaths >50) {
		System.out.println("Student is good in studies.");
	}
}
}
