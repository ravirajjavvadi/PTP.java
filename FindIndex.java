import java.util.Scanner;
public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int[] array = {10, 20, 30, 40, 50};
		
		System.out.print("Enter the element to find: ");
        int key = scanner.nextInt();
		
		for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element found at Index: " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
