package by.rudakd.lesson3.task2;
// 2.Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины

import java.util.Arrays;

public class Task2 {
    // В функции numLength реализован алгоритм нахождения длины числа
    public static int numLength(int number){
        int count = 0;
        if(number > 0) {
            while(number > 0) {
                number /= 10;
                count++;
            }
        } else System.out.println("Введите число больше нуля!");
        return count;
    }

    public static void main(String[] args) {
        // Заполняем массив числами разной длины
        int[] array = {123, 1234, 1, 12345, 12, 5, 2};
        // Сортировка массива по возрастанию в зависимости от длины числа
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(numLength(array[j]) > numLength(array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив array в порядке возрастания значений длины элементов: " + Arrays.toString(array));
        // Сортировка массива по убыванию в зависимости от длины числа
        for(int k = 0; k < array.length - 1; k++){
            for(int m = 0; m < array.length - 1 - k; m++){
                if(numLength(array[m]) < numLength(array[m + 1])) {
                    int temp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = temp;
                }
            }
        }
        System.out.println("Массив array в порядке убывания значений длины элементов: " + Arrays.toString(array));
    }
}
