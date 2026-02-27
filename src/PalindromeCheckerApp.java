import java.util.*;
//UC8
public class PalindromeCheckerApp{
    static class Node {
        char data;
        PalindromeCheckerApp.Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        String input = "racecar";

        UseCase8PalindromeCheckerApp.Node head = buildLinkedList(input);

        boolean isPalindrome = checkPalindrome(head);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Step 1: Convert string to linked list
    private static UseCase8PalindromeCheckerApp.Node buildLinkedList(String input) {

        UseCase8PalindromeCheckerApp.Node head = new UseCase8PalindromeCheckerApp.Node(input.charAt(0));
        UseCase8PalindromeCheckerApp.Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new UseCase8PalindromeCheckerApp.Node(input.charAt(i));
            current = current.next;
        }

        return head;
    }

    // Step 2–4: Check palindrome
    private static boolean checkPalindrome(UseCase8PalindromeCheckerApp.Node head) {

        if (head == null || head.next == null)
            return true;

        UseCase8PalindromeCheckerApp.Node slow = head;
        UseCase8PalindromeCheckerApp.Node fast = head;

        // Find middle (Tortoise & Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        UseCase8PalindromeCheckerApp.Node secondHalf = reverse(slow);

        UseCase8PalindromeCheckerApp.Node firstHalf = head;
        UseCase8PalindromeCheckerApp.Node temp = secondHalf;

        // Compare halves
        while (temp != null) {
            if (firstHalf.data != temp.data)
                return false;

            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    // Reverse linked list in-place
    private static UseCase8PalindromeCheckerApp.Node reverse(UseCase8PalindromeCheckerApp.Node head) {

        UseCase8PalindromeCheckerApp.Node prev = null;

        while (head != null) {
            UseCase8PalindromeCheckerApp.Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}
