/*
 * UseCase4PalindromeCheckerApp.java
 * Palindrome Checker Application - UC4
 * Version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Define the original string
        String original = "madam";

        // Step 2: Convert string to character array
        char[] characters = original.toCharArray();

        // Step 3: Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Step 4: Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Step 5: Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 6: Display result
        System.out.println("Original String : " + original);

        if (isPalindrome) {
            System.out.println("Result          : It is a Palindrome.");
        } else {
            System.out.println("Result          : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}