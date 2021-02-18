package by.rudakd.lesson5.task4;

public class FractionService {

    public static Fraction additionObject(Fraction a, Fraction b) { // Метод сложения
        int denominator = a.n * b.n;
        int numerator = b.n * a.m + a.n * b.m;
        int sign = 1;
        int intPart = 0;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction sum = new Fraction(sign, intPart, numerator, denominator);
        return getIntPart(sum);
    }

    public static Fraction subtractionObject(Fraction a, Fraction b) { // Метод вычитания
        int denominator = a.n * b.n;
        int numerator = b.n * a.m - a.n * b.m;
        int intPart = 0;
        int sign = 1;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction sub = new Fraction(sign, intPart, numerator, denominator);
        return getIntPart(sub);
    }

    public static Fraction multiplicationObject(Fraction a, Fraction b) { // Метод умножения
        int denominator = a.n * b.n;
        int numerator = a.m * b.m;
        int intPart = 0;
        int sign = 1;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction mult = new Fraction(sign, intPart, numerator, denominator);
        return getIntPart(mult);
    }

    public static Fraction divisionObject(Fraction a, Fraction b) { // Метод деления
        int denominator = a.n * b.m;
        int numerator = a.m * b.n;
        int intPart = 0;
        int sign = 1;
        if ((numerator < 0) && (denominator < 0)) { // Определение знака дроби
            numerator *= -1;
            denominator *= -1;
        }
        else if (denominator < 0) {
            sign = -1;
        }
        else if (numerator < 0) {
            sign = -1;
        }
        Fraction div = new Fraction(sign, intPart, numerator, denominator);
        if ((div.m < 0) && (div.n < 0)) { // Определение знака дроби после переопределения объекта
            div.m *= -1;
            div.n *= -1;
        }
        return getIntPart(div);
    }

    public static Fraction getIntPart(Fraction a) { // Метод выделения целой части и сокращение дроби
        if (a.m / a.n >= 1) { // Проверка на определение целой части
            a.intPart = a.m / a.n;
            if ((a.m % a.n) == 0) {
                a.m = 1;
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
