package by.rudakd.lesson3.task7;
// 7.Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.

import java.util.Scanner;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        int sumOfElements = 0;
        // Заполнение массива рандомными значениями от 0 до 20
        for(int k = 0; k < array.length; k++){
            array[k] =  (int)(Math.random() * 21);
        }
        System.out.println("Массив array: "+ Arrays.toString(array));
        //Сортировка массива array челночным способом (Shuttle Sort):
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                for (int j = i - 1; (j - 1) >= 0; j--){
                    if(array[j] < array[j - 1]) {
                        int tmp1 = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp1;
                    } else break;
                }
            }
        }
        for(int z = 1; z < array.length - 1; z++){
            sumOfElements += array[z];
        }
        System.out.println("Отсортированный массив array: "+ Arrays.toString(array));
        System.out.println("Сумма элементов между минимальным и максимальным значениями = " + sumOfElements);
    }
}
