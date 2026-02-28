/*
 * UseCase5PalindromeCheckerApp.java
 * Palindrome Checker Application - UC5
 * Version 1.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Define the original string
        String original = "level";

        // Step 2: Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 3: Push all characters of the string into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Step 4: Pop characters from stack and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Step 5: Compare original and reversed strings
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result          : It is a Palindrome.");
        } else {
            System.out.println("Result          : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}