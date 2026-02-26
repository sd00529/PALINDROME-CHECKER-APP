/**
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * This program checks whether a predefined (hardcoded)
 * string is a palindrome by comparing characters
 * from the beginning and the end of the string.
 */
public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}