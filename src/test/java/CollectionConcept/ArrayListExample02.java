package CollectionConcept;

import java.util.ArrayList;

public class ArrayListExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arraylist can store heterogeneous data
		ArrayList list = new ArrayList<>();
		
		list.add("Deepika");
		list.add(101);
		list.add(true);
		list.add('c');
		list.add(23.67);
		list.add(new Object());
		
		System.out.println(list);
		
		// we have to create an arraylist to store the marks
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(67);
		marks.add(80);
		marks.add(92);
		marks.add(78);
		
		System.out.println(marks);
	}
	

}
