public class Main {
    public static void main(String[] args) {

        /*  Identifying Palindromic Numbers For Enhanced Numeric Validation
        Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.
        */

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return number == reverse;
    }
}