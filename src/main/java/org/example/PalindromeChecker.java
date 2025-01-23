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

/*  EXAMPLE STRINGS
        "Level"
        "hello"
        "A man a plan a canal Panama"
*/
    }
}