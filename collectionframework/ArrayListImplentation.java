package collectionframework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//The List Interface has 2 Concrete classes for implementations: ArrayList and LinkedList

public class ArrayListImplentation {

  public static void main(String[] args) {
	  
        List<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");  // Duplicates allowed

        // Faster access of elements by index
        System.out.println("First fruit: " + fruits.get(0)); 
        
        // Iterating using enhanced for loop 
        System.out.println("The fruits are");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        
        // Iterator
        Iterator<String> iterator = fruits.iterator();
        
        // Iterating using the Iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println();
        
        //Printing the List
        System.out.println("ArrayList: " + fruits);
        
        // Removing elements
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
        
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
