package CollectionConcept;

import java.util.Vector;

public class VectorExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vectorObject = new Vector<Integer>();

		  vectorObject.add(3);

		  vectorObject.add(5);

		  vectorObject.add(4);

		  vectorObject.add(1);	

		  vectorObject.add(2);

		  vectorObject.add(8);
		  
		  // add elements using addElement
		  
		  vectorObject.addElement(2);
		  vectorObject.addElement(null);
		 // vectorObject.add();
		  
		  System.out.println(vectorObject);
		  	

	}

}
