package by.rudakd.lesson5.task1;

public class TimePeriodService {
    public static void printCalculateSeconds(TimePeriod a) {
        System.out.println("The full amount of seconds of Period" + a.periodCounter + " is " + a.calculateSeconds());
    }

    public static void printPeriodData(TimePeriod a) {
        if (a.calculateSeconds() <= 60) {
            System.out.println("There are " + a.seconds + " seconds in the current time period");
        } else if (a.hours == 0 && a.minutes == 0) {
            int sec = a.seconds % 60;
            a.minutes = (a.seconds - sec) / 60;
            int m = a.minutes % 60;
            a.hours = (a.minutes - m) / 60;
            System.out.println("Time period" + a.id + " consists of " + a.hours + " hr(s) " + a.minutes + " min(s) " + sec + " sec(s)");
        } else {
            System.out.println("Time period " + a.id + " consists of " + a.hours + " hr(s) " + a.minutes + " min(s) " + a.seconds + " sec(s)");
        }
    }
}
