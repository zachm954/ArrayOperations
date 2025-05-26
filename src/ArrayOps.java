import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations ops = new ArrayOperations();

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = ops.arrayGenerator(size);
        int[] array2 = ops.arrayGenerator(size);

        System.out.print("Array 1: ");
        for (int num : array1) System.out.print(num + " ");
        System.out.println();

        System.out.print("Array 2: ");
        for (int num : array2) System.out.print(num + " ");
        System.out.println();
        System.out.println();

        int[] stats1 = ops.arrayStats(array1);
        System.out.println("Array 1 - Lowest value: " + stats1[0] + ", Greatest value: " + stats1[1]);

        int[] stats2 = ops.arrayStats(array2);
        System.out.println("Array 2 - Lowest value: " + stats2[0] + ", Greatest value: " + stats2[1]);
        System.out.println();

        int median1 = ops.medianFinder(array1.clone()); // Use clone to preserve original
        System.out.println("Median of Array 1: " + median1);

        int median2 = ops.medianFinder(array2.clone());
        System.out.println("Median of Array 2: " + median2);
        System.out.println();

        int[] doubledArray = ops.doubleArray(array1);
        System.out.print("Doubled Array 1: ");
        for (int num : doubledArray) System.out.print(num + " ");
        System.out.println();

        System.out.print("Indexes where elements differ: ");
        ops.findDifferentElements(array1, array2);

        scanner.close();
    }
}