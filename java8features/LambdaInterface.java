package java8features;

@FunctionalInterface
interface FuncInter {
    int operation(int a, int b);
}
public class LambdaInterface {

    public static void main(String[] args) {
        //Lambda defines the operations
        FuncInter add = (a, b) -> a + b;
        FuncInter multiply = (a, b) -> a * b;

        System.out.println("Performing add operation :" + add.operation(6, 12));  
        System.out.println("Performing Multiplication operation :" + multiply.operation(4, 100)); 
    }
}
