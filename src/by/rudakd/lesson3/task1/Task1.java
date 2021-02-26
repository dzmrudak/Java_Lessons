package by.rudakd.lesson3.task1;
// 1.Найти максимальный элемент в массиве заданной длины.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength = scan.nextInt();
        int array[] = new int[arrayLength];
        if (arrayLength == 0) {
            System.out.println("Массив пуст");
        } else {
            int maxElement = array[0];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 21); //заполнение массива случайными целыми числами от 0 до 20
                System.out.print(array[i] + " "); //Вывод массива на экран
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j] > maxElement) maxElement = array[j]; //Определение значения максимального элемента массиав
            }
            System.out.println("\nThe maximum value of the array is: " + maxElement);
        }
    }
}
