package by.rudakd.lesson3.task8;
// Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Task8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double fact = 1;
        double searchableFact = 1;
        for (int num = 1; num <= b; num++){
            fact *= num;
            if(num >= a) {
                searchableFact *= fact;
            }
        }
        System.out.println(searchableFact);
    }
}
