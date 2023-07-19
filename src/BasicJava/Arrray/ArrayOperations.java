package BasicJava.Arrray;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length);

        // Append an element to the array
        int[] newNumbers = Arrays.copyOf(numbers, length + 1);
        newNumbers[length] = 6;
        System.out.println("After appending 6: " + Arrays.toString(newNumbers));

        // Insert an element at a specific index
        int insertIndex = 3;
        int insertValue = 7;
        int[] modifiedNumbers = new int[length + 1];
        System.arraycopy(numbers, 0, modifiedNumbers, 0, insertIndex);
        modifiedNumbers[insertIndex] = insertValue;
        System.arraycopy(numbers, insertIndex, modifiedNumbers, insertIndex + 1, length - insertIndex);
        System.out.println("After inserting 7 at index 3: " + Arrays.toString(modifiedNumbers));

        // Remove an element from the array
        int removeIndex = 2;
        int[] reducedNumbers = new int[length - 1];
        System.arraycopy(numbers, 0, reducedNumbers, 0, removeIndex);
        System.arraycopy(numbers, removeIndex + 1, reducedNumbers, removeIndex, length - removeIndex - 1);
        System.out.println("After removing element at index 2: " + Arrays.toString(reducedNumbers));

        // Searching for an element in the array
        int searchElement = 5;
        boolean isPresent = false;
        for (int num : numbers) {
            if (num == searchElement) {
                isPresent = true;
                break;
            }
        }
        System.out.println("Is 5 present in the array? " + isPresent);

        // Sorting the array
        int[] sortedNumbers = Arrays.copyOf(numbers, length);
        Arrays.sort(sortedNumbers);
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));

        // Reversing the array
        int[] reversedNumbers = Arrays.copyOf(numbers, length);
        for (int i = 0; i < length / 2; i++) {
            int temp = reversedNumbers[i];
            reversedNumbers[i] = reversedNumbers[length - 1 - i];
            reversedNumbers[length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedNumbers));

        // Slicing the array
        int[] slicedArray = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Sliced array: " + Arrays.toString(slicedArray));

        // Updating an element in the array
        int updateIndex = 1;
        int updateValue = 8;
        int[] updatedNumbers = Arrays.copyOf(numbers, length);
        updatedNumbers[updateIndex] = updateValue;
        System.out.println("After updating element at index 1: " + Arrays.toString(updatedNumbers));

        // Clearing the array
        int[] emptyArray = new int[0];
        System.out.println("Array after clearing: " + Arrays.toString(emptyArray));
    }
}
