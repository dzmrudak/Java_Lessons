package by.rudakd.lesson5.task1;

import java.util.Scanner;

public class TimePeriod {

    public static int id = 1;
    public int timePeriodId;
    public int seconds;
    public int minutes;
    public int hours;

    public TimePeriod() {
        timePeriodId = id++;
        System.out.println("Period " + timePeriodId);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        seconds = scan.nextInt();
        System.out.print("Enter minutes: ");
        minutes = scan.nextInt();
        System.out.print("Enter hours: ");
        hours = scan.nextInt();
        System.out.println();
    }

    public TimePeriod(int seconds, int minutes, int hours) {
        timePeriodId = id++;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimePeriod(int seconds) {
        timePeriodId = id++;
        this.seconds = seconds;
    }

    public int getTimePeriodId() {
        return timePeriodId;
    }

    public static int getId() {
        return id;
    }


}
