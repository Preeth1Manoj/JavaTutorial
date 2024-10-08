package java8features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Preethi", "Sanju", "Meenakshi", "Devika", "Keerthana","Susmin","JD","Anu");
          
        // Intermediate operations: filter, map, sorted
        // Terminal Operations: collect,sum,count,reduce
        
        // Filtering: select elements >4 based on a predicate
        List<String> longNames = names.stream()
                                      .filter(name -> name.length() > 4)  // Intermediate operation
                                      .collect(Collectors.toList());     // Terminal operation
        System.out.println("Names longer than 4 characters: " + longNames);

        // Mapping :transforms each element(name to length)
        List<Integer> nameLengths = names.stream()
                                         .map(String::length)
                                         .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // Sorting: natural ordering
        List<String> sortedNames = names.stream()
                                        .sorted()    // Intermediate operation
                                        .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Reduce: reduce the stream to a single value
        int totalLength = names.stream()
                               .mapToInt(String::length)  // Intermediate operation
                               .sum();    // Terminal operation
        System.out.println("Total length of all names: " + totalLength);

        // Parallel Streams
        long count = names.parallelStream()
                          .filter(name -> name.startsWith("A"))  // Intermediate operation
                          .count();           // Terminal operation
        System.out.println("Number of names starting with 'A': " + count);
        
        //StreamApi uses Collectors to gather stream results into lists
}
}