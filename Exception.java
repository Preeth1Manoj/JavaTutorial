package generics;

public class Exception {

    public static void main(String[] args) {
        try {
            // Code block that cause arithmetic exception
            int result = 10 / 0; //error
            System.out.println("Result: " + result); //won't execute
       
        } 
        catch (ArithmeticException e) {
            // Handling the exception block
            System.out.println("Cannot divide by zero! Exception: " + e);
        } 
        finally {
            // Code block that will always execute
            System.out.println("Finally block: This will always execute.");
        }
        System.out.println("Program continues after exception handling.");
        int result = 10 / 2;
        System.out.println("Result: " + result);
   
    }
}
