/*
 * UseCase7PalindromeCheckerApp.java
 * Palindrome Checker Application - UC7
 * Version 1.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Define the original string
        String original = "refer";

        // Step 2: Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        // Step 4: Compare front and rear elements
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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