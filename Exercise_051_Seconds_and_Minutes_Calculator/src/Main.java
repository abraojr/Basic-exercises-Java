public class Main {
    public static void main(String[] args) {
        /* Seconds and Minutes Challenge
        In this challenge, we're going to create a method, that takes time, represented in seconds, as the parameter.
        We'll then want to transform the seconds into hours.
        Next, you'll display the time in hours with the remaining minutes and seconds in a String.
        We'll do this transformation in two steps, which allows us to use overloaded methods.

        We want to create two methods with the same name:  getDurationString
        The first method has one parameter of type int, named seconds.
        The second method has two parameters, named minutes and seconds, both int.
        Both methods return a String in the format shown:

        XXh YYm ZZs

        where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
        The first method should in turn call the second method to return its results.

        1 min = 60 sec
        1 hour = 60 min = 3600 sec

        */

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = (seconds % 60);

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        } else if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hour = minutes / 60;
        int remainingMinutes = (minutes % 60);

        return String.format("%dh %dm %ds", hour, remainingMinutes, seconds);
    }
}