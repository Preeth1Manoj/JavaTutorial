package oopcodes;

abstract class Vehicles {
	 abstract void start();
	 
	 void stop() {
	     System.out.println("Vehicle stops");
	 }
	}

	class Cars extends Vehicles {
	 void start() {
	     System.out.println("Car starts");
	 }
	}

public class Abstraction {
	public static void main(String[] args) {
    Vehicles car = new Cars();
    car.start();
    car.stop();

}
}