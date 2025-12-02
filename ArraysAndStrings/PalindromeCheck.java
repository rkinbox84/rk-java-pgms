/**
 * This program checks if a given string is a palindrome.
 * A palindrome reads the same forwards and backwards.
 * Assumption: An empty string or null is considered not a palindrome.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author: RaviKumar K
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";
        System.out.println(isPalindrome(str1)); // Output: true
        System.out.println(isPalindrome(str2)); // Output: false
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
