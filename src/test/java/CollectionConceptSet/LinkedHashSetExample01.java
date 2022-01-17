package CollectionConceptSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(3);
		
		System.out.println("LinkedHashSet: " + evenNumber);

/*		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

		// Using addAll() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New LinkedHashSet: " + numbers);

		// Calling the iterator() method
		Iterator<Integer> iterate = numbers.iterator();

		System.out.print("LinkedHashSet using Iterator: ");

		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print("  ");
		}
*/
	}
}
