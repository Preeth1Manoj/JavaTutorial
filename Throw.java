package generics;

public class Throw {

    public static void main(String[] args) {
        try {
            checkAge(16);  // Will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Method that throws an exception 
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }
}
