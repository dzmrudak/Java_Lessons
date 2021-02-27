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
        while ((a.m % 2 == 0 && a.n % 2 == 0) || (a.m % 3 == 0 && a.n % 3 == 0)) { //Проверяем на сократимость дроби
            if (a.m % 2 == 0 && a.n % 2 == 0) { // Для четных сократимых дробей
                while (a.m % 2 == 0 && a.n % 2 == 0) {
                    a.m /= 2;
                    a.n /= 2;
                }
            } else if (a.m % 3 == 0 && a.n % 3 == 0) { // Для нечетных сократимых дробей
                while (a.m % 3 == 0 && a.n % 3 == 0) {
                    a.m /= 3;
                    a.n /= 3;
                }
            }
        }
        return a;
    }
}
