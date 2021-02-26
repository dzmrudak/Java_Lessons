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
        int count = 0;
        int maxElement = 0;
        int minElement = 0;
        // Заполнение массива рандомными значениями от 0 до 20
        for(int k = 0; k < array.length; k++){
            array[k] =  (int)(Math.random() * 21);
            count++;
        }
        System.out.println("Массив array: "+ Arrays.toString(array));
        // Если массив не пустой, присвоим значение первого элемента массива минимальному элементу
        if(count != 0) {
            minElement = array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxElement) maxElement = array[i]; //Определение значения максимального элемента массива
            if(array[i] < minElement) minElement = array[i]; //Определение значения минимального элемента массива
        }
        System.out.println("maxElement = " + maxElement);
        System.out.println("minElement = " + minElement);
        for(int i = 0; i < array.length; i++) {
            if(array[i] != maxElement && array[i] != minElement) {
                sumOfElements += array[i];
            }
        }
        System.out.println("Сумма элементов между минимальным и максимальным значениями = " + sumOfElements);
    }
}
