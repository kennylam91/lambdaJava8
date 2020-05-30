import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleWithJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("PHAM VAN", "LAM", 30L),
				new Person("HOANG TRUNG", "VAN", 20L),
				new Person("DO VAN", "THANG", 18L),
				new Person("NGUYEN VAN", "HOANG", 25L),
				new Person("Le VAN", "TOAN", 40L)
				);
		
		// Step 1: Sort this list by first name
		Collections.sort(people, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return o1.getFirstName().compareTo(o2.getFirstName());
					}
		});
		
		// Step 2: print all people
		System.out.println("Print all people");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return true;
			}
		});
		
		// Step 3: Print all people with lastname start with T
		System.out.println("Print all people with lastname start with T");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("T");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}
	
}
