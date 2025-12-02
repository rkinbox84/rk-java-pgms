/**
 * This program checks if a given string contains a specific substring.
 * Time Complexity: O(n*m) where n is the length of the main string and m is the length of the substring
 * Space Complexity: O(1)
 * Author: RaviKumar K
 * Other approaches: Using built-in methods like String.contains() or String.indexOf()
 */
public class StringContainsSubstring {
    public static void main(String[] args) {
        String str = "hello world";
        String substr = "world";
        System.out.println(containsSubstring(str, substr)); // Output: true
    }

    public static boolean containsSubstring(String str, String substr) {
        if (str == null || substr == null || substr.length() > str.length()) {
            return false;
        }

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            int j;
            for (j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }

            if (j == substr.length()) {
                return true;
            }
        }
        return false;
    }
}
