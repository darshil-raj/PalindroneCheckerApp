/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 1: Welcome Message
 * Use Case 2: Palindrome Validation
 *
 * @author Developer
 * @version 2.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        // UC1 - Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized successfully.\n");

        // UC2 - Take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(processedInput).reverse().toString();

        // Check palindrome
        if (processedInput.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}