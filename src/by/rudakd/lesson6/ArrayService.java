package by.rudakd.lesson6;

import java.util.Arrays;

public class ArrayService implements MySuperArray {

    private Integer[] array;

    public ArrayService(int n) {
        this.array = new Integer[n];
    }

    public ArrayService() {
        this.array = new Integer[0];
    }

    @Override
    public String toString() {
        return "ArrayService{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    //Получить текущую длину массива
    @Override
    public int getLength() {
        return array.length;
    }

    //Получить элемент по индексу
    @Override
    public Integer getElement(int index) {
        if(index > this.array.length) {
            System.out.println("Выход за пределы массива: индекс " + index);
            return null;
        }
        return this.array[index];
    }

    //Удалить все текущие элементы (длина массива будет 0 после этой операции)
    @Override
    public void removeAllElements() {
        this.array = new Integer[0];
    }

    @Override
    public Integer[] getAllElements() {
        return this.array;
    }

    //Добавить элемент. Длина массива должна увеличится на 1.
    @Override
    public int addElement(Integer element) {
        int plusOneElementLength = this.array.length;
        Integer[] plusOneElement = new Integer[plusOneElementLength + 1];
        for (int i = 0; i < this.array.length; i++) {
            plusOneElement[i] = this.array[i];
            if (i == this.array.length - 1) {
                plusOneElementLength++;
                plusOneElement[i + 1] = element;

            }
        }
        this.array = plusOneElement;
        return plusOneElementLength;
    }
}
