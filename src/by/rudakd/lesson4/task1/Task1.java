package by.rudakd.lesson4.task1;
// 1.Создать двухмерный квадратный массив, и заполнить его «бабочкой»

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int arrayLength = array.length;
        int countColumns = 0;
        //Заполнение массива "бабочкой"
        for (int i = 0; i < array.length; i++) {
            for (int j = countColumns; j < arrayLength; j++) {
                array[i][j] = 1;
            }
            if (i < 2) {
                arrayLength--;
                countColumns++;
            } else {
                arrayLength++;
                countColumns--;
            }
        }
        // Выводи массива в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
