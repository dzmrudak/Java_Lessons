package by.rudakd.lesson4.task2;
// 2. Найти сумму элементов на главной диагонали матрицы n*n. Число n задается пользователем.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int arraySize = scan.nextInt();
        int[][] array = new int[arraySize][arraySize];
        int sumMainDiagonal = 0;

        //Заполнение массива случайными числами от 0 до 9 и вывод на консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Определение суммы элементов на главной диагонали
        for (int k = 0; k < array.length; k++) {
            for (int m = k; m < array.length; m++) {
                sumMainDiagonal += array[k][m];
                break;
            }
        }
        // Вывод суммы элементов главной диагонали на консоль
        System.out.println("Сумма элементов на главное диагонали = " + sumMainDiagonal);
    }
}
