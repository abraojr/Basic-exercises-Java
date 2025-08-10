public class Main {
    public static void main(String[] args) {
        /*  Devising A Teen Number Checker For Mastery Of Conditional Range Checking
        We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
        Write a method named hasTeen with 3 parameters of type int.
        The method should return boolean 'and' it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise, return false.

        Write another method named isTeen with 1 parameter of type int.
        The method should return boolean 'and' it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise, return false.
        */

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int x) {
        return x >= 13 && x <= 19;
    }
}