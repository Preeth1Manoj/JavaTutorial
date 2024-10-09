package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
	 public static void main(String[] args) {
	        Map<Integer, String> map = new HashMap<>();
	        
	        // put()
	        map.put(1, "Preethi");
	        map.put(2, "Sanju");
	        map.put(3, "Devika");
	        map.put(4, "Meenakshi");
	        map.put(5, "Devika");
	        
	        // get() 
	        System.out.println("Name of key 2: " + map.get(2)); 
	        
	        //size()
	        System.out.println("Size: " + map.size()); 
	        
	        // Iterating over the Map's entries
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	        
	        // containsKey()
	        if (map.containsKey(1)) {
	            System.out.println("Key 1 exists.");
	        }
	        

	    }

}
