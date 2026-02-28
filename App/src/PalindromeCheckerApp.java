/*
 * UseCase12PalindromeCheckerApp.java
 * Palindrome Checker Application - UC12
 * Version 1.0
 */

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-Based Strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.execute(input);

        System.out.println("Using Stack Strategy:");
        System.out.println("Input  : " + input);
        System.out.println("Result : " + (result ? "Palindrome" : "Not Palindrome"));

        // Switch strategy at runtime
        checker.setStrategy(new DequeStrategy());

        result = checker.execute(input);

        System.out.println("\nUsing Deque Strategy:");
        System.out.println("Input  : " + input);
        System.out.println("Result : " + (result ? "Palindrome" : "Not Palindrome"));

        System.out.println("\nProgram executed successfully.");
    }
}