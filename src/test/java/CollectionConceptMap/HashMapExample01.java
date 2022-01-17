package CollectionConceptMap;

import java.util.HashMap;

public class HashMapExample01 {
	
	public static void main(String[] args) {
		
		//hashmap always stores value in key value pairs
		
		 HashMap<Integer, String> languages = new HashMap<>();
		 
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    languages.put(2, "Python");
		    
		    System.out.println("HashMap: " + languages);

		    HashMap<String, String> userData1 = new HashMap<>();
		    userData1.put("Name", "Chaitanya");
		    userData1.put("Org", "AapnaInfotech");
		    userData1.put("DOB", "01-01-1996");
		    //userData.put("Name", "Deepika");
		    
		    HashMap<String, String> userData2 = new HashMap<>();
		    userData2.put("Name", "Deepika");
		    userData2.put("Org", "AapnaInfotech");
		    userData2.put("DOB", "01-01-1995");
		    
		    
		    //HashMap<key, Value> referVariable = new HashMap<>();
		    // key - Integer, Character, String,Object, or it could any Class
		    
		    Employee e = new Employee("Rahul",22);
		    
		    
		    
		    HashMap<String, Employee> empDetails = new HashMap<>();
		    empDetails.put("User1 Data", new Employee("Rutuja",25));
		    empDetails.put("User2 Data", e);
		    
		    
		    
	    // get() method to get value
		    String value = languages.get(1);
		    System.out.println("Value at index 1: " + value);
		    
		    Employee emp = empDetails.get("User1 Data");
		    System.out.println(emp);
		  			    
		    // return set view of keys
		    // using keySet()
		    System.out.println("Keys: " + userData2.keySet());
		 
		    // return set view of values
		    // using values()
		    System.out.println("Values: " + userData2.values());
		    
		    // return set view of key/value pairs
		    // using entrySet()
		    System.out.println("Key/Value mappings: " + languages.entrySet());  
	}
	
	
	
}



// print all the duplicate characters of a string using hashMap.
