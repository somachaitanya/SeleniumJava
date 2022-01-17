package CollectionConceptSet;

import java.util.HashSet;

public class HashSetExample01 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);	
        evenNumber.add(4); // no operation for this would be performed
        evenNumber.add(3);
        evenNumber.add(null);
        
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> deepikaNumbers = new HashSet<>();
        
        // Using addAll() method
        deepikaNumbers.addAll(evenNumber);
        deepikaNumbers.add(5);
        System.out.println("New HashSet: " + deepikaNumbers); 
	}

//1. runtime error - Rutuja,
//2. compiler time - Madhurima, Buddha, Bhavna, Ankita, Rahul, Vaibhav
//3. duplicate error
//4. 2 4 6 4
//5. 2 4 6 - Chaitanya, Deepu
//6. 
	
}
