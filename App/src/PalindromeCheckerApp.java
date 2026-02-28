/*
 * UseCase13PalindromeCheckerApp.java
 * Palindrome Checker Application - UC13
 * Version 1.0
 */

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Two-Pointer Approach
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack-Based Approach
    public static boolean stackCheck(String input) {
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

    // Deque-Based Approach
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Test input
        String input = "amanaplanacanalpanama";

        // Two-Pointer Timing
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Timing
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display Results
        System.out.println("Input String : " + input);
        System.out.println("--------------------------------------");

        System.out.println("Two-Pointer Result : " + result1);
        System.out.println("Execution Time     : " + twoPointerTime + " ns");

        System.out.println("\nStack Result       : " + result2);
        System.out.println("Execution Time     : " + stackTime + " ns");

        System.out.println("\nDeque Result       : " + result3);
        System.out.println("Execution Time     : " + dequeTime + " ns");

        System.out.println("\nProgram executed successfully.");
    }
}