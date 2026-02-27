/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares execution time of different
 * palindrome checking approaches:
 *
 * 1. Iterative (Two Pointer)
 * 2. Stack Based
 * 3. Recursive
 *
 * Key Concept:
 * - System.nanoTime()
 * - Algorithm Comparison
 *
 * @author Developer
 * @version 13.0
 */

import java.util.Stack;
import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    /* =========================================================
       1️⃣ Iterative Two Pointer Method
       ========================================================= */
    public static boolean iterativePalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    /* =========================================================
       2️⃣ Stack Based Method
       ========================================================= */
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    /* =========================================================
       3️⃣ Recursive Method
       ========================================================= */
    public static boolean recursivePalindrome(String input, int start, int end) {

        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursivePalindrome(input, start + 1, end - 1);
    }

    /* =========================================================
       MAIN METHOD
       ========================================================= */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input
        input = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\nRunning Performance Test...\n");

        // Iterative Timing
        long start1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Recursive Timing
        long start3 = System.nanoTime();
        boolean result3 = recursivePalindrome(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        // Display Results
        System.out.println("Algorithm Results:");
        System.out.println("-------------------------------------------");
        System.out.println("Iterative Result : " + result1);
        System.out.println("Stack Result     : " + result2);
        System.out.println("Recursive Result : " + result3);
        System.out.println("-------------------------------------------");

        System.out.println("Execution Time (in nanoseconds):");
        System.out.println("-------------------------------------------");
        System.out.println("Iterative Time : " + (end1 - start1));
        System.out.println("Stack Time     : " + (end2 - start2));
        System.out.println("Recursive Time : " + (end3 - start3));
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}