/**
 * =========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates whether a string is a palindrome
 * using recursion.
 *
 * Flow:
 * 1. Compare start and end characters.
 * 2. Recursively call function for inner substring.
 * 3. Base condition stops recursion.
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC9: Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}