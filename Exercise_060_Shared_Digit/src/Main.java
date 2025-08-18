public class Main {
    public static void main(String[] args) {

        /*  Checking For A Shared Digit Between Two Numbers
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
        */
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) return false;

        int xRightmostDigit = x % 10;
        int yRightmostDigit = y % 10;
        int xLeftmostDigit = x / 10;
        int yLeftmostDigit = y / 10;

        return (xRightmostDigit == yRightmostDigit || xRightmostDigit == yLeftmostDigit) || (xLeftmostDigit == yRightmostDigit || xLeftmostDigit == yLeftmostDigit);
    }
}