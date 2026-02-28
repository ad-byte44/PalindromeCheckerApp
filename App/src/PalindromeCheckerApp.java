/*
 * UseCase11PalindromeCheckerApp.java
 * Palindrome Checker Application - UC11
 * Version 1.0
 */

// PalindromeChecker Service Class
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input (optional enhancement)
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Step 2: Define test string
        String original = "Madam";

        // Step 3: Call service method
        boolean result = checker.checkPalindrome(original);

        // Step 4: Display result
        System.out.println("Input String : " + original);

        if (result) {
            System.out.println("Result       : It is a Palindrome.");
        } else {
            System.out.println("Result       : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}