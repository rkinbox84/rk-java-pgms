/**
 * This program finds the first and second largest elements in an array of integers.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author: RaviKumar K
 */
public class FirstSecLrgElemArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 9, 2};
        int[] result = findFirstAndSecondLargest(arr);
        System.out.println("First Largest: " + result[0]);
        System.out.println("Second Largest: " + result[1]);
    }

    public static int[] findFirstAndSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found.");
        }

        return new int[]{firstLargest, secondLargest};
    }
}
