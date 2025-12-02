/**
 * This program finds the minimum, maximum, and average values in an array of integers.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author: RaviKumar K
 */
public class MinMaxAvgOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int min = findMin(arr);
        int max = findMax(arr);
        double avg = findAvg(arr);
        
        System.out.println("Minimum: " + min); // Output: Minimum: 1
        System.out.println("Maximum: " + max); // Output: Maximum: 9
        System.out.println("Average: " + avg); // Output: Average: 4.666666666666667
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double findAvg(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }   
}
