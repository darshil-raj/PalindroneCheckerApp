/**
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program demonstrates encapsulation by placing
 * palindrome logic inside a separate PalindromeChecker class.
 *
 * The main class interacts only through the public method:
 *     checkPalindrome()
 *
 * Key Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 * - Object-Oriented Design
 *
 * Data Structure Used:
 * - Character Array (Internal)
 *
 * @author Developer
 * @version 11.0
 */

import java.util.Scanner;

/**
 * PalindromeChecker Service Class
 * Responsible only for palindrome checking logic.
 */
class PalindromeChecker {

    /**
     * Public method to check palindrome
     */
    public boolean checkPalindrome(String input) {

        // Normalize input
        input = input.replaceAll("\\s+", "").toLowerCase();

        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}