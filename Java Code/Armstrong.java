
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        // Calculate the result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}

oops

exception handling
multithreading
applet
jdbc