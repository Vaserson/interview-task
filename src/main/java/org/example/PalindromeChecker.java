package org.example;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = "";

        //TODO make a reversed string of input string

        if (reversed.equalsIgnoreCase(input)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println(checker.isPalindrome("Level")); // Should return true
        System.out.println(checker.isPalindrome("hello")); // Should return false
        System.out.println(checker.isPalindrome(null));    // Should return false
        System.out.println(checker.isPalindrome(""));      // Should return false
        System.out.println(checker.isPalindrome("A man a plan a canal Panama")); // Should return true
    }
}