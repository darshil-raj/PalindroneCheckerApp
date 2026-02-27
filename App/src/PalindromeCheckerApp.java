/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * while ignoring:
 *  - Upper/Lower case differences
 *  - Spaces
 *
 * Flow:
 * 1. Normalize string (remove spaces, convert to lowercase)
 * 2. Apply palindrome checking logic
 *
 * Key Concepts:
 * - String Preprocessing
 * - Regular Expressions
 *
 * Data Structure Used:
 * - String / Character Array
 *
 * @author Developer
 * @version 10.0
 */

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    /**
     * Method to check palindrome
     */
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /**
     * Application entry point for UC10.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 🔹 Step 1: Normalize string
        input = input.replaceAll("\\s+", "").toLowerCase();

        // 🔹 Step 2: Apply palindrome logic
        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}