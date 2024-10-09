package collectionframework;

import java.util.LinkedList;

public class LinkedListImplentation {


    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        
        // Adding in beginning and end
        animals.addFirst("Lion");
        animals.addLast("Tiger");
        
        // Printing the list
        System.out.println("LinkedList: " + animals);
        
        // Accessing elements
        System.out.println("First Element: " + animals.getFirst()); 
        System.out.println("Last Element: " + animals.getLast());  
        
        // Removing elements
        animals.removeFirst(); 
        animals.removeLast(); 
        
        System.out.println("LinkedList after removal: " + animals);
        
        // Slower access of elements by index
        System.out.println("Element at index 2: " + animals.get(2)); 
    }
}
