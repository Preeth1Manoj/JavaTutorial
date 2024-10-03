package oopcodes;

public class Static {

    static int staticCounter = 0;

    int instanceCounter = 0;
    
    void incrementCounters() {
        staticCounter++;
        instanceCounter++;
    }
    
    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        
        obj1.incrementCounters();
        obj2.incrementCounters();
        
        System.out.println("obj1 static counter: " + Static.staticCounter);
        System.out.println("obj1 instance counter: " + obj1.instanceCounter);
        System.out.println("obj2 static counter: " + Static.staticCounter);
        System.out.println("obj2 instance counter: " + obj2.instanceCounter);
    }
}