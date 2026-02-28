/*
 * UseCase3PalindromeCheckerApp.java
 * Palindrome Checker Application - UC3
 * Version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (original.equals(reversed)) {
            System.out.println("Original String  : " + original);
            System.out.println("Reversed String  : " + reversed);
            System.out.println("Result           : It is a Palindrome.");
        } else {
            System.out.println("Original String  : " + original);
            System.out.println("Reversed String  : " + reversed);
            System.out.println("Result           : It is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}