package javaprograms;
import java.util.Scanner;

public class Palindrome {

 public static void main(String[] args) {
	 try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the string: ");
			 String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversed))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }
}}