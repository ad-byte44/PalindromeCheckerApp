/*
 * UseCase9PalindromeCheckerApp.java
 * Palindrome Checker Application - UC9
 * Version 1.0
 */

public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: If start crosses end
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Step 1: Define the original string
        String original = "rotor";

        // Step 2: Call recursive method
        boolean result = isPalindrome(original, 0, original.length() - 1);

        // Step 3: Display result
        System.out.println("Original String : " + original);

        if (result) {
            System.out.println("Result          : It is a Palindrome.");
        } else {
            System.out.println("Result          : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}