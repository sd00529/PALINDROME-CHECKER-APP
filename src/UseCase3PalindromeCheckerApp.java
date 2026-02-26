/**
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * This program checks whether a string is a palindrome
 * by reversing it and comparing it with the original.
 */
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}