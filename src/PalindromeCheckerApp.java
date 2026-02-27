import java.util.*;

public class PalindromeCheckerApp{

    public static void main(String[] args) {
//UC10
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 🔹 Step 1: Normalize string
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "") // remove spaces & symbols
                .toLowerCase();                 // convert to lowercase

        boolean isPalindrome = true;

        // 🔹 Step 2: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

}
