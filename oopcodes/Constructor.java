package oopcodes;


public class Constructor {


static class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, I'm " + this.name + " and I'm " + this.age + " years old.");
    }
}
public static void main(String[] args) {
    Person p1 = new Person("Preethi",22);
    p1.introduce();
    Person p2 = new Person("Ana",23);
    p2.introduce();
}
}