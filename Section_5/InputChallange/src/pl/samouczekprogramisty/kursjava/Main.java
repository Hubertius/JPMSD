package pl.samouczekprogramisty.kursjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Enter " + i + " value: ");
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                sum += scanner.nextInt();
            } else {
                System.out.println("InvalidValue");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum = " + sum);
    }
}
