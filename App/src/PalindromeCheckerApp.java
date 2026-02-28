/*
 * UseCase10PalindromeCheckerApp.java
 * Palindrome Checker Application - UC10
 * Version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Define original string (with spaces & mixed case)
        String original = "A man a plan a canal Panama";

        // Step 2: Normalize string
        // Convert to lowercase and remove all non-alphanumeric characters
        String normalized = original.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 3: Apply two-pointer palindrome logic
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 4: Display result
        System.out.println("Original String   : " + original);
        System.out.println("Normalized String : " + normalized);

        if (isPalindrome) {
            System.out.println("Result            : It is a Palindrome.");
        } else {
            System.out.println("Result            : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}