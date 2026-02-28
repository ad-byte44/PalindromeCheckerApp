/*
 * UseCase6PalindromeCheckerApp.java
 * Palindrome Checker Application - UC6
 * Version 1.0
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Define the original string
        String original = "radar";

        // Step 2: Create Stack (LIFO) and Queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 3: Push and Enqueue characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Step 4: Compare dequeue (queue) with pop (stack)
        boolean isPalindrome = true;

        while (!stack.isEmpty() && !queue.isEmpty()) {
            char fromStack = stack.pop();     // Reverse order
            char fromQueue = queue.remove();  // Original order

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Display result
        System.out.println("Original String : " + original);

        if (isPalindrome) {
            System.out.println("Result          : It is a Palindrome.");
        } else {
            System.out.println("Result          : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}