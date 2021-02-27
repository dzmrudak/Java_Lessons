package by.rudakd.lesson5.task1;


public class Main {
    public static void main(String[] args) {
        TimePeriod timePeriod1 = new TimePeriod(1, 2, 3);
        TimePeriod timePeriod2 = new TimePeriod(0, 0, 6);
        TimePeriod timePeriod3 = new TimePeriod(0, 0, 5);

        TimePeriodService.printCalculateSeconds(timePeriod1);
        TimePeriodService.printCalculateSeconds(timePeriod2);
        TimePeriodService.printCalculateSeconds(timePeriod3);
        System.out.println();
        timePeriod2.compareTwoTimePeriods(timePeriod3);
        TimePeriodService.printPeriodData(timePeriod2);
    }
}
