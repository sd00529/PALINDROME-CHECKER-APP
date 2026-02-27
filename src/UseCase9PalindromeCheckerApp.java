/**
 * Use Case 9: Recursive Palindrome Checker
 *
 * Goal:
 * Check palindrome using recursion.
 *
 * Flow:
 * 1. Compare first and last characters
 * 2. If mismatch → return false
 * 3. Recursively check inner substring
 * 4. Base condition stops recursion
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to Call Stack
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean isPalindrome(String str, int left, int right) {


        if (left >= right)
            return true;


        if (str.charAt(left) != str.charAt(right))
            return false;

        return isPalindrome(str, left + 1, right - 1);
    }
}