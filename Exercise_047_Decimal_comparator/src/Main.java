public class Main {
    public static void main(String[] args) {
        /*  Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean 'and' it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.*/

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (long) (a * 1000) == (long) (b * 1000);
    }
}