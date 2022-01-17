package CollectionConcept;

import java.util.LinkedList;

public class LinkedListExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList 	= new LinkedList<String>();	
		
		linkedList.add("Apple");
		linkedList.add("Guava");
		linkedList.add("Banana");
		linkedList.add("Mango");
		linkedList.add("Grapes");
		
		System.out.println(linkedList);
		
		linkedList.set(2, "Peach");

		System.out.println(linkedList);
		
		linkedList.remove();
		
		linkedList.remove(3);
		
		System.out.println(linkedList);
		
//1.Grapes - Deepika, Buddha,Chaitanya, Preeti, Vaibhav, Ankita, Madhurima,Rahul
//2.Mango - 
		
	}

}
