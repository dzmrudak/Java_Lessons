package by.rudakd.lesson5.task1;

import java.util.Scanner;

public class TimePeriod {

    public static int id = 1;
    public int periodCounter;
    public int seconds;
    public int minutes;
    public int hours;

    public TimePeriod(int seconds, int minutes, int hours) {
        periodCounter = id++;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public TimePeriod(int seconds) {
        periodCounter = id++;
        this.seconds = seconds % 60;
        this.minutes = (seconds - this.seconds) / 60;
        this.hours = (this.minutes - (this.minutes % 60)) / 60;
    }

    public int getTimePeriodId() {
        return periodCounter;
    }

    public static int getId() {
        return id;
    }

    public int calculateSeconds() {
        return (this.hours * 3600) + (this.minutes * 60) + this.seconds;
    }

    @Override
    public int compareTo(TimePeriod b) {
        if (this.calculateSeconds() > b.calculateSeconds()) {
            System.out.println("Period" + periodCounter + " is longer than Period" + b.periodCounter);
        } else if (this.calculateSeconds() < b.calculateSeconds()) {
            System.out.println("Period" + periodCounter + " is shorter than Period" + b.periodCounter);
        } else {
            System.out.println("Periods are equal");
        }
        return 0;
    }
}
