import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /* Implement Min Finder: Reading and Storing Data for Minimum Value Discovery
         Write a method called readInteger() that has no parameters and returns an int.
         It needs to read in an integer from the user - this represents how many elements the user needs to enter.
         Write another method called readElements() that has one parameter of type int
         The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
         And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
         The scenario is:
                1. readInteger() is called.
                2. The number returned by readInteger() is then used to call readElements().
                3. The array returned from readElements() is used to call findMin().
                4. findMin() returns the minimum number.
        */

        System.out.print("How many elements do you want to enter? ");
        int size = readInteger();

        System.out.println("Enter the integers of the array:");
        int[] intArray = readElements(size);

        System.out.printf("The minimum value of the array is: %d", findMin(intArray));
    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static int[] readElements(int arraySize) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            integers[i] = sc.nextInt();
        }

        sc.close();

        return integers;
    }

    private static int findMin(int[] array) {
        /* Solution 1:
        Arrays.sort(array);
        return array[0];*/

        // Solution 2:
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }
}