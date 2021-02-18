package by.rudakd.lesson5.task4;

public class Fraction {
    public int sign;
    public int intPart;
    public int m;
    public int n;

    public Fraction(int sign, int intPart, int m, int n) {
        this.sign = sign;
        this.intPart = intPart;
        this.m = sign * (m + n * intPart);
        this.n = n;
    }

    public Fraction() {
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
}
