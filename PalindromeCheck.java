import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String original = input.nextLine();

        String cleaned = original.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }

        input.close();
    }
}
