package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Array - static where as ArrayList - dynamic
//Arrays are fast as compared to ArrayList
// For arrays - we are already declaring the size and JVM has to insert the value;
// but for arrayList - JVM has to declare the size and then it has to insert the value.

public class ArrayListExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = new int[3];
		// a[0]=1;
		//a[1]=2;
			
		//an object of child class and reference is parent interface
		//List<Integer> list = new ArrayList<Integer>();	
		
/*		ArrayList<Integer> aList = new ArrayList<Integer>(); //generic
		aList.add(4);
		aList.add(1);
		aList.add(3);
		aList.add(5);
		aList.add(6);
		
		//size();
		System.out.println(aList);
		System.out.println(aList.get(2));
		System.out.println("size of the arrayList :"+ aList.size());
		aList.add(8);
		System.out.println(aList);
		System.out.println("size of the arrayList :"+ aList.size());
		//System.out.println(aList.get(6));
		
		*/
		ArrayList <Integer> marks = new ArrayList<Integer>();
		marks.add(60);
		marks.add(67);   //update : 70
		marks.add(98);
		marks.add(78);
		System.out.println(marks);
		int mathsMarks = 95;
		marks.set(1, 70);
		System.out.println(marks);
		
		marks.add(mathsMarks);
		System.out.println(marks);
		
		marks.set(4, mathsMarks-3);
		System.out.println(marks);
		
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("Maths");
		subject.add("English");
		subject.add("Physics");
		subject.add("Chemistry");
		subject.add("Social Studies");
		
		System.out.println(subject);
		//Object[] test = new Object[];
		
		for(int i=0; i <subject.size();i++) {
			String subjectName = subject.get(i);
			System.out.println(subjectName);
		}
		
		System.out.println("=======================================");
		
		for(int i : marks) {
			System.out.println(i);
		}
		
		System.out.println("=============Iterator==========================");
		//Iterator
		Iterator itr = marks.iterator();
		while(itr.hasNext()) {
			int number = (int) itr.next();
			System.out.println(number);
		}
		
		subject.add("Physics");
		//subject.add("");
		System.out.println(subject);
		System.out.println(subject.size());
		
		System.out.println("====================After inserting no value===============");
		subject.add(null);
		subject.add("");
		subject.add("1");
		System.out.println(subject);
		System.out.println(subject.size());
	}

//1. 7 - Preeti, Vaibhav, Madhurima,Buddha, Swati,Rutuja, Ankita,Stephen, Naresh
//2. 6-  Chaitanya
	
}
