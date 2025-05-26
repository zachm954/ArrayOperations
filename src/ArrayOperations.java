import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayOperations {

    // Generates an array of random integers between 1 and 10
    public int[] arrayGenerator(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10) + 1; // Random number between 1 and 10
        }
        return array;
    }

    // Finds the lowest and greatest values in the array
    public int[] arrayStats(int[] arr) {
        int lowest = arr[0];
        int greatest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        int[] stats = {lowest, greatest};
        return stats;
    }

    // Sorts the array and finds the median
    public int medianFinder(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        // If the array length is even, average the two middle elements
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else {
            // If odd, return the middle element
            return arr[arr.length / 2];
        }
    }

    // Doubles each element in the array
    public int[] doubleArray(int[] arr) {
        int[] doubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }

    // Finds indices where two arrays have different elements
    public void findDifferentElements(int[] arr1, int[] arr2) {
        System.out.print("Index: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing indices
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations ops = new ArrayOperations();

        // Ask user to input size of the two arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Generate two arrays
        System.out.println();
        int[] array1 = ops.arrayGenerator(size);
        int[] array2 = ops.arrayGenerator(size);

        // Print the arrays
        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Find and print stats for Array 1
        int[] stats = ops.arrayStats(array1);
        System.out.println("Lowest value in Array 1: " + stats[0]);
        System.out.println("Greatest value in Array 1: " + stats[1]);

        System.out.println();

        // Find and print the median of Array 1
        int median = ops.medianFinder(array1);
        System.out.println("Median of Array 1: " + median);

        // Double Array 1 and print the result
        int[] doubledArray = ops.doubleArray(array1);
        System.out.print("Doubled Array 1: ");
        for (int i = 0; i < doubledArray.length; i++) {
            System.out.print(doubledArray[i] + " ");
        }
        System.out.println();

        // Find and print indices where the arrays differ
        ops.findDifferentElements(array1, array2);

        // Create a new array (array3) using doubled array
        System.out.print("Array 3 (doubled Array 1): ");
        for (int i = 0; i < doubledArray.length; i++) {
            System.out.print(doubledArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}