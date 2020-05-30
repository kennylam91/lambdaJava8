import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExampleWithJava8 {
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("PHAM VAN", "LAM", 30L),
				new Person("HOANG TRUNG", "VAN", 20L),
				new Person("DO VAN", "THANG", 18L),
				new Person("NGUYEN VAN", "HOANG", 25L),
				new Person("Le VAN", "TOAN", 40L)
				);
		
		// Step 1: Sort this list by first name
		Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		// Step 2: print all people
		System.out.println("Print all people");
		printConditionally(people, p -> true);
		
		// Step 3: Print all people with lastname start with T
		System.out.println("Print all people with lastname start with T");
		printConditionally(people, p -> p.getLastName().startsWith("T"));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}
}
