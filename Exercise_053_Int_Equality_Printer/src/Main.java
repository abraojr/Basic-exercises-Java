public class Main {
    public static void main(String[] args) {
        /* Crafting An Equality Printer To Explore Multiple Conditional Checks In Java
        Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
        If one of the parameters is less than 0, print text "Invalid Value".
        If all numbers are equal print text "All numbers are equal"
        If all numbers are different print text "All numbers are different".
        Otherwise, print "Neither all are equal or different".
        */

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if (x == y || x == z || y == z) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}