package oopcodes;

public class Scope {
    static int classVar = 10;
    int instanceVar = 20;
    
    void demoMethod() {
        int localVar = 30;
        
        for (int i = 0; i < 5; i++) {
            // Block-scoped variable
            int blockVar = 40;
            System.out.println("Block variable: " + blockVar);
        }
        
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Class variable: " + classVar);
        
        // blockVar is not accessible 
    }
    
    public static void main(String[] args) {
        Scope demo = new Scope();
        demo.demoMethod();
        
        // localVar,instance is not accessible 
        System.out.println("Class variable in main: " + classVar );;
    }
}



