package by.rudakd.lesson5.task1;

public class TimePeriodService {
    public static int calculateSeconds(int hours, int minutes, int seconds) {
        int amountOfSeconds;
        amountOfSeconds = (hours * 360) + (minutes * 60) + seconds;
        return amountOfSeconds;
    }

    public static void printCalculateSeconds(TimePeriod a) {
        System.out.println("The full amount of seconds of Period" + a.timePeriodId + " is " + calculateSeconds(a.hours, a.minutes, a.seconds));
        System.out.println();
    }

    public static void compareTwoTimePeriods(TimePeriod a, TimePeriod b) {
        if (calculateSeconds(a.hours, a.minutes, a.seconds) > calculateSeconds(b.hours, b.minutes, b.seconds)) {
            System.out.println("Period" + a.timePeriodId + " is longer than Period" + b.timePeriodId);
        } else if (calculateSeconds(a.hours, a.minutes, a.seconds) < calculateSeconds(b.hours, b.minutes, b.seconds)) {
            System.out.println("Period" + a.timePeriodId + " is shorter than Period" + b.timePeriodId);
        } else {
            System.out.println("Periods are equal");
        }
    }

    public static void printPeriodData(TimePeriod a) {
        if (calculateSeconds(a.hours, a.minutes, a.seconds) <= 60) {
            System.out.println("There are " + a.seconds + " seconds in the current time period");
        } else if (a.hours == 0 && a.minutes == 0) {
            int sec = a.seconds % 60;
            a.minutes = (a.seconds - sec) / 60;
            int m = a.minutes % 60;
            a.hours = (a.minutes - m) / 60;
            System.out.println("Time period" + a.timePeriodId + " consists of " + a.hours + " hr(s) " + a.minutes + " min(s) " + sec + " sec(s)");
        } else {
            System.out.println("Time period " + a.timePeriodId + " consists of " + a.hours + " hr(s) " + a.minutes + " min(s) " + a.seconds + " sec(s)");
        }
    }
}
