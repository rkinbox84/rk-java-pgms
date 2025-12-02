import java.util.Arrays;

/**
 * This program sorts an array of strings in alphabetical order.
 * Time Complexity: O(n log n) - due to the sorting algorithm used by Arrays.sort()
 * Arrays.sort() uses a variant of Timsort for objects, which has a time complexity of O(n log n) on average.
 *  Space Complexity: O(1) (if we ignore the space used by the sorting algorithm)
 */
public class SortStringArray {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] fruits = {"Banana", "Apple", "Mango", "Cherry", "Orange"};

        System.out.println("Before Sorting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sort the array (alphabetically, ascending)
        Arrays.sort(fruits);

        System.out.println("\nAfter Sorting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
