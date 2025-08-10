public class Main {
    public static void main(String[] args) {
        /*  Creating An Equal Sum Checker For Strengthening Arithmetic And Comparison Operations
        Write a method hasEqualSum with 3 parameters of type int.
        The method should return boolean 'and' it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.*/

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }
}