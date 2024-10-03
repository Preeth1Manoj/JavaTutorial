package javacodes;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			 double a = scanner.nextDouble();
			 System.out.print("Enter the second number: ");
			 double b = scanner.nextDouble();
  
			 //Arithmetic operators
			 System.out.println("a + b =" + (a + b));
			 System.out.println("a - b =" + (a - b));
			 System.out.println("a * b =" + (a * b));
			 System.out.println("a / b =" + (a / b));
			 System.out.println("a % b =" + (a % b));
			 
			 //Comparison operators
			 System.out.println("a > b" + (a>b));
			 System.out.println("a == b"+ (a==b));
		}
		 //Logical operators
		 boolean x =true, y=false;
		 System.out.println("x && y: "+(x&&y));
		 System.out.println("x||y:" + (x||y));
	}

}


