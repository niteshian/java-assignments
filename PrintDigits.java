import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Make sure to handle negative numbers
        if (number < 0) {
            System.out.println("Negative numbers are not supported.");
            return;
        }
        
        // Store the original number for reference
        int originalNumber = number;
        
        // Create a variable to store the digits
        String digits = "";
        
        // Extract and store each digit
        do {
            int digit = number % 10; // Get the last digit
            digits = digit + " " + digits; // Append the digit to the result string
            number /= 10; // Remove the last digit from the number
        } while (number > 0);
        
        // Print the digits
        System.out.println("Digits of the number " + originalNumber + " are: " + digits);
    }
}
