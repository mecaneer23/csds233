package palindrome;
public class Palindrome {

    // O(n) time complexity
    // O(1) space complexity
    static boolean palindromeIterative(String input) {
        for (int counter = 0; counter < input.length() / 2; counter++) {
            if (input.charAt(counter) != input.charAt(input.length() - 1 - counter)) {
                return false;
            }
        }
        return true;
    }

    // O(n) time complexity
    // O(n) space complexity
    static boolean palindromeRecursive(String input) {
        if (input.length() <= 1) {
            return true;
        }
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }
        return palindromeRecursive(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
        /*
         * Both functions have the same time complexity, but the
         * recursive one has a higher space complexity, so use
         * the iterative function
         */
        if (palindromeIterative("racecar") != true) {
            System.out.println("Failed");
        }
    }
}