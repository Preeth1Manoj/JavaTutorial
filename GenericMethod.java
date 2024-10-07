package generics;

public class GenericMethod {
    // prints any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Print an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);  

        // Print a String array
        String[] strArray = {"Java", "Generics", "Is", "Interesting"};
        printArray(strArray);  
    }
}
