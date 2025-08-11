public class Main {
    public static void main(String[] args) {
        /* Implementing A Minutes-To-Years-And-Days Calculator For Advanced Time Conversions
        Write a method printYearsAndDays with parameter of type long named minutes.
        The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
        If the parameter is less than 0, print text "Invalid Value".
        Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

        XX represents the original value minutes.
        YY represents the calculated years.
        ZZ represents the calculated days.

        1 hour = 60 min
        1 day = 24 hours
        1 year = 365 days
        */

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long minutesInADay = 24 * 60;
            long minutesInAYear = 365 * minutesInADay;

            System.out.printf("%d min = %d y and %d d%n", minutes, (minutes / minutesInAYear), (minutes % minutesInAYear) / minutesInADay);
        }
    }
}