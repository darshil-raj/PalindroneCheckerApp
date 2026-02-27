/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Goal:
 * Use a stack to reverse characters and validate palindrome.
 *
 * Key Concepts:
 * - Stack (LIFO)
 * - Push & Pop operations
 * - Reversal logic
 *
 * Author: Developer
 * Version: 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Use Case 5 - Stack-Based Palindrome Checker\n");

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase (optional, to ignore case)
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Use Stack to reverse characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < processedInput.length(); i++) {
            stack.push(processedInput.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare
        if (processedInput.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}