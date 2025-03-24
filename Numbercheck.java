import java.util.Scanner;
public class Numbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
        System.out.print("Enter a number: ");

        if (num > 0) {
            System.out.println("It is a Positive number.");
        } else {
            System.out.println("It is a Negative number.");
        } 
        
        scanner.close(); 
    }
}
