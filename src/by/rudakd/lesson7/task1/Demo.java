package by.rudakd.lesson7.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Abiturient abiturient1 = new Abiturient("Ivan", "Ivanov", "Ivanovich", "AAA", "9999999", new int[] {1, 2, 3, 4}); // 10
        Abiturient abiturient2 = new Abiturient("Petr", "Petrov", "Petrovich", "BBB", "9999999", new int[] {1, 2, 3, 4}); // 26
        Abiturient abiturient3 = new Abiturient("Nikolai", "Nikolaev", "Nikolaevich", "CCC", "9999999", new int[] {9, 10, 1, 2}); // 22
        Abiturient abiturient4 = new Abiturient("Dzmitry", "Dzmitriev", "Dzmitrievich", "DDD", "9999999", new int[] {3, 4, 5, 6}); // 18

        Abiturient[] arrayOfApplicants = new Abiturient[] {abiturient1, abiturient2, abiturient3, abiturient4};
        System.out.println("Список всех абитуриентов");
        System.out.println(Arrays.toString(arrayOfApplicants));
        System.out.println();

        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки");
        System.out.println(Arrays.toString(Abiturient.studentsWithNegativeMarks(arrayOfApplicants)));
        System.out.println();

        System.out.println("Список абитуриентов, у которых сумма баллов выше заданной");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите необходимую сумму: ");
        int neededSum = scan.nextInt();
        System.out.println(Arrays.toString(Abiturient.studentsWithBiggerSum(neededSum, arrayOfApplicants)));
        System.out.println();

        System.out.println("Выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов");
        System.out.printf("Введите необходимое число студентов с самым высоким баллом: ");
        int numberOfStudents = scan.nextInt();
        Abiturient.studentsWithHighestSum(numberOfStudents, arrayOfApplicants);
        System.out.println();

        System.out.println("Полный список абитуриентов, имеющих полупроходную сумму: ");
        System.out.printf("Введите полупроходной балл: ");
        int halfSum = scan.nextInt();
        Abiturient.halfEnteredSum(halfSum, arrayOfApplicants);
    }
}
