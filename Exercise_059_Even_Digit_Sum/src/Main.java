public class Main {
    public static void main(String[] args) {

        /*  Calculating The Sum Of All Even Digits In An Integer
        Write a method named getEvenDigitSum with one parameter of type int called number.
        The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value.
        */

        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-1));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) return -1;

        int evenSum = 0;

        while (number != 0) {

            int digit = number%10;

            if (digit % 2 == 0) evenSum += digit;

            number /= 10;
        }

        return evenSum;
    }
}