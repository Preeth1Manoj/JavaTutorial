package javacodes;

public class Loop {
 public static void main(String[] args) {
     // for loop
     System.out.println("For loop:");     
     for (int i = 0; i < 5; i++) {
         System.out.print(i + " ");
     }
     System.out.println();    
     
     // while loop
     System.out.println("While loop:");
     int j = 0;
     while( j < 5 ) {
    	 System.out.print(j + " ");
    	 j++;    	 
     }
     System.out.println();
     
     //do-while loop
     System.out.print(" Do-while loop:");
     int k = 0;
     do {
    	 System.out.println(k + "");
    	 k++;
     } while(k < 5);
}
}


