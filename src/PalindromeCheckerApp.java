public class PalindromeCheckerApp {
    // Intentionally left empty

    public static class UC1 {
        public static void main(String[] args) {

            // Display welcome message
            System.out.println("===================================");
            System.out.println("     Welcome to Palindrome Checker");
            System.out.println("     Version: 1.0.0");
            System.out.println("===================================");

            // Continue to next use case
            // (Palindrome processing logic will go here)
        }
    }

    public static class UC2 {

        public static void main(String[] args) {

            // Hardcoded string
            String word = "madam";

            // Reverse the string
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            // Check if palindrome
            if (word.equals(reversed)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }

            // Program exits automatically after execution
        }
    }
}