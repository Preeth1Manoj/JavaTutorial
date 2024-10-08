package java8features;
import java.util.ArrayList;
public class Lambda {

	public static void main(String[] args) {
	     ArrayList<Integer> arrL = new ArrayList<Integer>();
	     arrL.add(1);
	     arrL.add(2);
	     arrL.add(3);
	     arrL.add(4);
        
	     System.out.println("All numbers:");
	     //lambda expression: parameter -> {code block}
	     arrL.forEach(n -> System.out.println(n));
         
	     System.out.println("even numbers:");
	     
	     // lambda expression: parameter -> {code block with condition(even numbers)}
	     arrL.forEach(n -> {
	         if (n % 2 == 0)
	             System.out.println(n);
	     });

	}

}
