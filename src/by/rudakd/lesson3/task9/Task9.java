package by.rudakd.lesson3.task9;
// 9.Реализовать бинарный поиск в массиве.
import java.util.Scanner;

public class Task9 {
    // В функции binarySearch реализован алгоритм поиска индекса, в котором содержится значение key
    public static int binarySearch (int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        // Заполнение массива числами от 0 до 9
        for(int k = 0; k < array.length; k++){
            array[k] =  (int)(Math.random() * 10);
            System.out.print(array[k] + " ");
        }
        System.out.printf("\n");
        // Сортировка массива по возрастание челночным способом
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
        //Вывод отсортированного массива на экран
        for(int z = 0; z < array.length; z++){
            System.out.print(array[z] + " ");
        }
        System.out.printf("\n");
        int first = 0;
        int last = array.length - 1;
        System.out.print("Введите искомое значение: ");
        int key = scan.nextInt();
        if(binarySearch(array, key, first, last) >= 0){
            System.out.println("Элемент Key находится под индексом #" + binarySearch(array, key, first, last));
        } else System.out.println("Элемент Key не найден");
    }
}
