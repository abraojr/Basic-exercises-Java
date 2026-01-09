import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

         /* Reverse an Array: Mastering In-Place Swaps for Efficient Reordering
         Write a method called reverse() with an int array as a parameter.

         The method should not return any value. In other words, the method is allowed to modify the array parameter.
         To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

         For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
         The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
         and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
        */

        int[] array = new int[]{1, 2, 3, 4, 5};
        reverse(array);

        int[] originalArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array = " + Arrays.toString(originalArray));
        System.out.println("Reversed copy array = " + Arrays.toString(reverseCopy(originalArray)));
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    // Extra: Creating a reverse copy of an array
    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }

    /* OUTPUT:
           Array = [1, 2, 3, 4, 5]
           Reversed array = [5, 4, 3, 2, 1]
           Original array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
           Reversed copy array = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     */
}