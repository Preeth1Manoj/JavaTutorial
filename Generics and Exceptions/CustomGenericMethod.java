package generics;

interface Printable {
    String getPrintableString();
}

class Person implements Printable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getPrintableString() {
        return name + " (Age: " + age + ")";
    }
}

public class CustomGenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            if (element instanceof Printable) {
                System.out.print(((Printable) element).getPrintableString() + " ");
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        // String array
        String[] strArray = {"Java", "Generics", "Is", "Interesting"};
        printArray(strArray);

        //array of custom objects
        Person[] personArray = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };
        printArray(personArray);
    }
}
