package by.rudakd.lesson3.task6;
//6.Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал
// дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?

public class Task6 {
    public static void main(String[] args) {
        double startDistance = 10;
        double dailyProgress = 1.1;
        int period = 7;
        double summaryDistance = 0;

        for(int i = 0; i < period; i++) {
            summaryDistance += startDistance;
            startDistance *= dailyProgress;
        }
        System.out.println("Суммарная дистанция = " + (double)Math.round(summaryDistance * 1000) / 1000 + "км");
    }
}
