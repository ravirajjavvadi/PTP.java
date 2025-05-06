import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
		
		System.out.print("Enter columns: ");
        int cols = sc.nextInt();
		
		System.out.print("Enter Symbol to print: ");
        String symbol = sc.next();
		
		System.out.println("Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
	}
}