package by.rudakd.lesson5.task1;


public class Main {
    public static void main(String[] args) {
        TimePeriod timePeriod1 = new TimePeriod(362);
        TimePeriod timePeriod2 = new TimePeriod(1, 2, 3);
        TimePeriod timePeriod3 = new TimePeriod(); // Ручной ввод секунд, минут, часов

        TimePeriodService.printCalculateSeconds(timePeriod1);
        TimePeriodService.printCalculateSeconds(timePeriod2);
        TimePeriodService.printCalculateSeconds(timePeriod3);
        TimePeriodService.compareTwoTimePeriods(timePeriod2, timePeriod3);
        TimePeriodService.printPeriodData(timePeriod2);
    }
}
