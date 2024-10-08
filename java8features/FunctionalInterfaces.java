package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class FunctionalInterfaces {

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("Custom Functional Interface");
        MathOperation addition = (a, b) -> a + b;
        System.out.println("10 + 5 = " + addition.operate(10, 5)+"\n");

        System.out.println("Predicate<T> -built in functional interface");
        System.out.println("\n");
        List<String> names = Arrays.asList("Preethi", "Sanju", "Meenakshi", "Devika", "Keerthana","Susmin");
        System.out.println("Starts with S :");
        Predicate<String> startsWithS = name -> name.startsWith("S");
        names.stream().filter(startsWithS).forEach(System.out::println);
        System.out.println("\n");
        
        System.out.println("Ends with A:");
        Predicate<String> endsWithA = name -> name.endsWith("a");
        names.stream().filter(endsWithA).forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Function<T,R> - accepts one argument and produces a result");
        Function<String, Integer> nameLength = String::length;
        System.out.println("Name lengths:");
        names.stream().map(nameLength).forEach(System.out::println);
        System.out.println();

        System.out.println("Consumer<T> -accepts single input and returns no input");
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);
        System.out.println("\n");

        System.out.println("Method Reference - shorthand notation for lambda expressions");
        names.forEach(System.out::println);
        
        // FunctionalInterfaces uses forEach to display results directly.
    }
}