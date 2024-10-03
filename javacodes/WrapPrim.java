package javacodes;

public class WrapPrim {

 public static void main(String[] args) {
     // Primitive type
     int primitiveInt = 42;

     // Wrapper class
     Integer wrapperInt = Integer.valueOf(42);

     System.out.println("Primitive int: " + primitiveInt);
     System.out.println("Wrapper Integer: " + wrapperInt);

     // Auto-boxing (primitive to wrapper)
     Integer autoBoxed = primitiveInt;

     // Auto-unboxing (wrapper to primitive)
     int unboxed = wrapperInt;

     System.out.println("Auto-boxed: " + autoBoxed);
     System.out.println("Unboxed: " + unboxed);

     // Using wrapper class methods
     System.out.println("Binary representation: " + Integer.toBinaryString(primitiveInt));
 }
}