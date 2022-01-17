package CollectionConceptSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> evenNumbers = new TreeSet<>();

		// Using the add() method
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("TreeSet: " + evenNumbers);

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);

		// Using the addAll() method
		numbers.addAll(evenNumbers);
		System.out.println("New TreeSet: " + numbers);

		// Calling iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("TreeSet using Iterator: ");
		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(" ");
		}
	}
}
