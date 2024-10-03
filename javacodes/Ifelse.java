package javacodes;

public class Ifelse {
 public static void main(String[] args) {   
	 int score = 85;
     if (score >= 90) {
         System.out.println("Grade: A");
     } else if (score >= 80 && score < 90) {
         System.out.println("Grade: B");
     } else {
         System.out.println("Grade: C or lower");
     }
}
}

