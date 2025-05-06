public class SpecificArrayValue {
    public static void main(String... args) {
		int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;
		
		for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("The value present.");
				return;
            }
        }
        System.out.println("The value is not present in the array.");
	}
}
