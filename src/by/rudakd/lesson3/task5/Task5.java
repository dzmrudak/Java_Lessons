package by.rudakd.lesson3.task5;
// 5.Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа

public class Task5 {
    public static void main(String[] args) {
        int quotient = 2;
        int amount = 1;
        for (int period = 3; period <= 24; period += 3) {
            amount *= quotient;
            System.out.println("Количество амеб через " + period + " часа(ов) равно " + amount);
        }
    }
}
