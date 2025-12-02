/**
 * Reverses the order of words in a given string.
 * Assumption: Words are separated by spaces.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Author: RaviKumar K
 */
public class ReverseWordsInString {
    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World from Java";
        System.out.println(reverseWords(str)); // Output: Java from World Hello
    }
}
