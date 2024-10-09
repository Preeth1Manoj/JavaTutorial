package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {
	
  public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        
        // add method
        System.out.println("Set of counties: ");
        countries.add("USA");
        countries.add("India");
        countries.add("Germany");
        countries.add("England");
        countries.add("USA");  // Duplicate won't be added
        
        // Iterating using enhanced for loop 
        for (String country : countries) {
            System.out.println(country);
        }
        System.out.println();
        
        // Iterator
        Iterator<String> iterator = countries.iterator();
        
        // Iterating using the Iterator
        while (iterator.hasNext()) {
            String c = iterator.next();
            System.out.println(c);
        }
        System.out.println();
        // Size method
        System.out.println("Total Number of countries is "+ countries.size());
        
        // contains method
        if (countries.contains("India")) {
            System.out.println("India is in the Set.");
        }
        
        // remove method 
        countries.remove("India");
        System.out.println("After removal: " + countries + " \n Total Number of countries is "+ countries.size());
        
        if (countries.contains("India")) {
            System.out.println("India is in the Set.");
        }
        else {
        	System.out.println("India is not in the Set.");
        }
        
    }
}
