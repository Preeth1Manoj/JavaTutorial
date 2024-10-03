package oopcodes;

public class ClassObject {
    static class Car {
        String brand;
        String model;

        // Constructor 
        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        void drive() {
            System.out.println(brand + " " + model + " is driving.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.drive();
        Car anotherCar = new Car("Honda", "Civic");
        anotherCar.drive();
    }
}