/**
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Goal:
 * Check palindrome using singly linked list.
 *
 * Flow:
 * 1. Convert string to linked list
 * 2. Find middle using fast & slow pointers
 * 3. Reverse second half in-place
 * 4. Compare both halves
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class UseCase8PalindromeCheckerApp {

    // Node definition
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "racecar";

        Node head = buildLinkedList(input);

        boolean isPalindrome = checkPalindrome(head);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Step 1: Convert string to linked list
    private static Node buildLinkedList(String input) {

        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        return head;
    }

    // Step 2–4: Check palindrome
    private static boolean checkPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle (Tortoise & Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;
        Node temp = secondHalf;

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
    private static Node reverse(Node head) {

        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}