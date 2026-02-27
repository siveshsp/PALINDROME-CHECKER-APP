import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Palindrome Checker Menu =====");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a sentence: ");
                    String input = scanner.nextLine();

                    if (isPalindrome(input)) {
                        System.out.println("It is a Palindrome");
                    } else {
                        System.out.println("It is NOT a Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 2);

        scanner.close();
    }

    public static boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
