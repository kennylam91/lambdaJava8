import java.util.function.BiConsumer;

public class HandleExceptionLambda {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int k = 0;
		
		perform(arr, k, wrapperLambda((i,j) -> System.out.println(i/j)));
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (t, u) -> {
			try {
				consumer.accept(t, u);
			} catch (Exception e) {
				System.out.println("Exception hanpped");
			}
		};
		
	}

	private static void perform(int[] arr, int k, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, k);
		}
		
	}
	
			
	
}
