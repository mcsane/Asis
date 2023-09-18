import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner tahti = new Scanner(System.in);
        String input = tahti.nextLine();

        // Transform the input to lowercase and remove punctuation
        String transformed = transformInput(input);

        // Check if the transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    // Transforms the input by making it lowercase and removing punctuation
    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    // Checks if a string is a palindrome

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Reverses a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

}
