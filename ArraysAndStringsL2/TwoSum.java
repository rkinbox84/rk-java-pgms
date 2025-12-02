import java.util.HashMap;

/**
 * This program finds two numbers in an array that add up to a specific target sum.
 * It returns the indices of these two numbers.
 * Time Complexity: O(n)
 * Space Complexity: O(n)   
 * Author: RaviKumar K
 */

public class TwoSum {
    // Returns the indices of the two elements that add up to target, or {-1, -1} if not found
    public static int[] getPairIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int targetValue = 9;
        int[] indices = getPairIndices(numbers, targetValue);
        if (indices[0] != -1) {
            System.out.println("Indices found: " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No matching pair found.");
        }
    }
}