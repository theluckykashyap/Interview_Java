package BasicJava.Arrray;

import java.util.Arrays;

public class TimeComplexityExample {
    public static void main(String[] args) {
        // Create an array
        //int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Accessing array elements
        long startTime = System.currentTimeMillis();
        for (int num : numbers) {
            // Perform any operation here
            // Replace this with the specific operation you want to measure
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Accessing array elements - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Length of the array
        startTime = System.currentTimeMillis();
        int length = numbers.length;
        endTime = System.currentTimeMillis();
        System.out.println("Length of the array - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Append an element to the array
        startTime = System.currentTimeMillis();
        int[] newNumbers = new int[length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, length);
        newNumbers[length] = 6;
        endTime = System.currentTimeMillis();
        System.out.println("Append an element - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Insert an element at a specific index
        startTime = System.currentTimeMillis();
        int insertIndex = 800;
        int insertValue = 7;
        int[] modifiedNumbers = new int[length + 1];
        System.arraycopy(numbers, 0, modifiedNumbers, 0, insertIndex);
        modifiedNumbers[insertIndex] = insertValue;
        System.arraycopy(numbers, insertIndex, modifiedNumbers, insertIndex + 1, length - insertIndex);
        endTime = System.currentTimeMillis();
        System.out.println("Insert an element at a specific index - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Remove an element from the array
        startTime = System.currentTimeMillis();
        int removeIndex = 9000;
        int[] reducedNumbers = new int[length - 1];
        System.arraycopy(numbers, 0, reducedNumbers, 0, removeIndex);
        System.arraycopy(numbers, removeIndex + 1, reducedNumbers, removeIndex, length - removeIndex - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Remove an element from the array - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Searching for an element in the array
        startTime = System.currentTimeMillis();
        boolean isPresent = false;
        int searchElement = 5;
        for (int num : numbers) {
            if (num == searchElement) {
                isPresent = true;
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Searching for an element in the array - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Sorting the array
        startTime = System.currentTimeMillis();
        int[] sortedNumbers = Arrays.copyOf(numbers, length);
        Arrays.sort(sortedNumbers);
        endTime = System.currentTimeMillis();
        System.out.println("Sorting the array - Elapsed time: " + (endTime - startTime) + " milliseconds");

        // Reversing the array
        startTime = System.currentTimeMillis();
        int[] reversedNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            reversedNumbers[i] = numbers[length - 1 - i];
        }
        endTime = System.currentTimeMillis();
        System.out.println("Reversing the array - Elapsed time: " + (endTime - startTime) + " milliseconds");

    }
}
