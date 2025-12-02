/**
 * This program removes duplicate characters from a given string while preserving the order of first occurrences.
 * Time Complexity: O(n)
 * Space Complexity: O(1) - Fixed size array of 256
 * Author: RaviKumar K
 */

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println(result); // Output: progamin
    }

    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII character set

        for (char ch : input.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
