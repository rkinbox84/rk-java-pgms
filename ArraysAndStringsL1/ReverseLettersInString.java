/**
 * This program reverses the letters in each word of a given string
 * while maintaining the original word order.
 * Assumption: Words are separated by spaces.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Author: RaviKumar K
 */
public class ReverseLettersInString {

    public static void main(String[] args) {
        String str = "Hello World from Java";
        System.out.println(reverseLetters(str)); // Output: avaJ morf dlroW olleH
    }

    public static String reverseLetters(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
    