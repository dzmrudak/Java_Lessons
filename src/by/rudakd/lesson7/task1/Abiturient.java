package by.rudakd.lesson7.task1;
//1.Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//Создать массив объектов. Вывести:
//a) список абитуриентов, имеющих неудовлетворительные оценки;
//b) список абитуриентов, у которых сумма баллов выше заданной;
//c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов
// (вывести также полный список абитуриентов, имеющих полупроходную сумму).

import java.util.Arrays;
import java.util.Scanner;

public class Abiturient {
    private static int id = 1;
    private int abiturientId;
    private String name;
    private String surname;
    private String fatherName;
    private String address;
    private String telNumber;
    private int[] marks;
    protected int sumOfMarks;
    private final int NUMBER_OF_MARKS = 4;

    public Abiturient(String name, String surname, String fatherName, String address, String telNumber, int[] marks) {
        this.abiturientId = id++;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.address = address;
        this.telNumber = telNumber;
        this.marks = new int[NUMBER_OF_MARKS];
    }

    private static void sumOfMarks(Abiturient[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].sumOfMarks = 0;
            for (int j = 0; j < a[i].marks.length; j++) {
                a[i].sumOfMarks += a[i].marks[j];
            }
        }
    }

    @Override
    public String toString() {
        return "\nAbiturient{" +
                "abiturientId=" + abiturientId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public static Abiturient[] studentsWithNegativeMarks(Abiturient[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].marks.length; j++) {
                if (a[i].marks[j] < 3) {
                    count++;
                    break;
                }
            }
        }
        Abiturient[] negativeMarks = new Abiturient[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].marks.length; j++) {
                if (a[i].marks[j] < 3) {
                    negativeMarks[index] = a[i];
                    index++;
                    break;
                }
            }
        }
        return negativeMarks;
    }

    public static Abiturient[] studentsWithBiggerSum(int neededSum, Abiturient[] a) {
        int count = 0;
        int index = 0;
        sumOfMarks(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i].sumOfMarks > neededSum) {
                count++;
            }
        }

        Abiturient[] biggerSum = new Abiturient[count];

        for (int i = 0; i < a.length; i++) {
            if (a[i].sumOfMarks > neededSum) {
                biggerSum[index] = a[i];
                index++;
            }
        }
        return biggerSum;
    }

    public static void studentsWithHighestSum(int numberOfStudents, Abiturient[] a) {
        sumOfMarks(a);
        Sorting.shuttleSortingDESC(a);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(a[i]);
        }
    }

    public static void halfEnteredSum(int halfSum, Abiturient[] a) {
        sumOfMarks(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i].sumOfMarks == halfSum) {
                System.out.println(a[i]);
            }
        }
    }
}
