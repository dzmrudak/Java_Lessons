package by.rudakd.lesson3.task8;
// Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Task8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int fact = 1;
        for (; b >= a; fact *= b--){ }
        System.out.println("Факториал числа в границах от 10 до 15 = " + fact);
    }
}
