package WorkingOnSelenium.LearnSelenium;

public class IfElseExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if the percentage greater 40, we have to print pass else fails
		//
		float percentage = totalMarks(50,34,67);
		int marksInMaths = 60;
		if(percentage>40) {
			if(marksInMaths>70) {
				System.out.println("Good in Maths.");
			}
			else
				System.out.println("Student needs to work on Mathematics");
			System.out.println("Passed");
		}
		else {
			System.out.println("Student got Failed."+percentage);
		}

	}
	
	public static float totalMarks(int x, int y, int z) {
		int sum = x+y+z;
		return sum/3;
	}

}
