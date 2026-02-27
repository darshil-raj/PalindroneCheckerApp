/**
 * ============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Goal:
 * Convert string to character array and check palindrome
 * using two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Use Case 4 - Character Array Based Palindrome Check\n");

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}