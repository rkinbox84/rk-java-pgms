/**
 * This program checks if a given string contains only digit characters.
 * Assumption: An empty string or null is considered not to contain only digits.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author: RaviKumar K
 */
public class StringContainsOnlyDigits {
    
    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "123a56";
        System.out.println(containsOnlyDigits(str1)); // Output: true
        System.out.println(containsOnlyDigits(str2)); // Output: false
    }

    public static boolean containsOnlyDigits(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
