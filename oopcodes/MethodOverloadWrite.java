package oopcodes;

class Hokage {
    void makeSound() {
        System.out.println("Lord Seventh has arrived");
    }
}

class Kazekage extends Hokage {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Gaara! The sand prince has arrived");
    }
    
    // Method overloading
    void makeSound(String mood) {
        if (mood.equals("happy")) {
            System.out.println("It is a good day");
        } else {
            System.out.println("War is coming");
        }
    }
}

public class MethodOverloadWrite {

    public static void main(String[] args) {
        Hokage naruto = new Hokage();
        Kazekage gaara = new Kazekage();
        
        naruto.makeSound();
        gaara.makeSound();
        gaara.makeSound("happy");
        gaara.makeSound("bad");
    }
}