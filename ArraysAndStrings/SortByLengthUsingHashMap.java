import java.util.*;
/**
 * This program sorts an array of strings based on their lengths using a HashMap.
 * Time Complexity: O(n log n) - due to sorting the keys of the HashMap
 * Space Complexity: O(n) - for storing the strings in the HashMap
 * Author: RaviKumar K
 */
public class SortByLengthUsingHashMap {
    public static void main(String[] args) {
        // Input array of strings
        String[] words = {"apple", "banana", "kiwi", "grapefruit", "fig", "mango"};

        // Step 1: Create a HashMap to group strings by length
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        for (String word : words) {
            int length = word.length();

            // If key not present, create new list
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<String>());
            }

            // Add word to the list corresponding to its length
            map.get(length).add(word);
        }

        // Step 2: Sort the keys (string lengths)
        List<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
        Collections.sort(sortedKeys); // ascending order of length

        // Step 3: Print strings in sorted order of length
        System.out.println("Strings sorted by length (using HashMap):");
        for (int key : sortedKeys) {
            List<String> list = map.get(key);
            for (String word : list) {
                System.out.println(word);
            }
        }
    }
}