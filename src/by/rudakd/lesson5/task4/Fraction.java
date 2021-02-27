package by.rudakd.lesson5.task4;

public class Fraction {
    public int sign;
    public int intPart;
    public int m;
    public int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n != 0) {
            this.n = n;
        } else {
            System.out.println("Знаменатель не может равняться нулю");
            System.exit(0);
        }
    }

    public Fraction(int sign, int intPart, int m, int n) {
        this.sign = sign;
        this.intPart = intPart;
        this.m = sign * (m + n * intPart);
        setN(n);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "sign=" + sign +
                ", intPart=" + intPart +
                ", m=" + m +
                ", n=" + n +
                '}';
    }

    public Fraction additionObject(Fraction b) { // Метод сложения
        int denominator = this.n * b.n;
        int numerator = b.n * this.m + this.n * b.m;
        int sign = 1;
        int intPart = 0;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction sum = new Fraction(sign, intPart, numerator, denominator);
        return FractionService.getIntPart(sum);
    }

    public Fraction subtractionObject(Fraction b) { // Метод вычитания
        int denominator = this.n * b.n;
        int numerator = b.n * this.m - this.n * b.m;
        int intPart = 0;
        int sign = 1;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction sub = new Fraction(sign, intPart, numerator, denominator);
        return FractionService.getIntPart(sub);
    }

    public Fraction multiplicationObject(Fraction b) { // Метод умножения
        int denominator = this.n * b.n;
        int numerator = this.m * b.m;
        int intPart = 0;
        int sign = 1;
        if (numerator < 0) { // Определение знака дроби
            sign = (-1);
        }
        Fraction mult = new Fraction(sign, intPart, numerator, denominator);
        return FractionService.getIntPart(mult);
    }

    public Fraction divisionObject(Fraction b) { // Метод деления
        int denominator = this.n * b.m;
        int numerator = this.m * b.n;
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
        return FractionService.getIntPart(div);
    }
}
