/**
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC7: Deque Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces & convert to lowercase)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char frontChar = deque.removeFirst();
            char rearChar = deque.removeLast();

            if (frontChar != rearChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}