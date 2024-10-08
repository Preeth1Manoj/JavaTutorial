package java8features;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

	        Optional<String> empty = Optional.empty();
	        Optional<String> present = Optional.of("Hello");
	        @SuppressWarnings("unused")
			Optional<String> nullable = Optional.ofNullable(null);

	        System.out.println("Is value present in empty: " + empty.isPresent());
	        System.out.println("Is value present in present: " + present.isPresent());

	        System.out.println("Value in present: " + present.get());
	        // System.out.println(empty.get()); // This would throw NoSuchElementException
	        String result = empty.orElse("Default");
	        System.out.println("Value or default: " + result);

	        present.ifPresent(value -> System.out.println("The value is: " + value));

	        // Mapping values
	        Optional<Integer> length = present.map(String::length);
	        System.out.println("Length of the value: " + length.orElse(0));

	        // Chaining Optional operations
	        Optional<String> transformed = present
	            .filter(s -> s.length() > 3)
	            .map(String::toUpperCase);
	        System.out.println("Transformed value: " + transformed.orElse(""));
	    }

	    // Using Optional in method return types
	    public static Optional<String> findUserName(int userId) {
	    	//db connect
            if (userId == 1) {
	            return Optional.of("John");
	        } else {
	            return Optional.empty();
	        }
	    }
	}
