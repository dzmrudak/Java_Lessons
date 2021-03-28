package by.rudakd.lesson5.task4;

public class FractionService {

    public static Fraction getIntPart(Fraction a) { // Метод выделения целой части и сокращение дроби
        if (a.m / a.n >= 1) { // Проверка на определение целой части
            a.intPart = a.m / a.n;
            if ((a.m % a.n) == 0) {
                a.m = 0;
                a.n = 1;
            } else {
                a.m = a.m - (a.intPart * a.n); // определение знаменателя дроби без целой части
            }
        }
        int divisionStartValue = Math.min(Math.abs(a.n), Math.abs(a.m));
        for (int i = divisionStartValue; i >= 2; i--)
            if (a.n % i == 0 && a.m % i == 0) {
                a.n /= i;
                a.m /= i;
            }
        return a;
    }
}
