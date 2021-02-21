package by.rudakd.lesson6;

import java.util.Arrays;

public class ArrayService implements MySuperArray {

    public static int arrayLength = 10;
    int[] array;

    @Override
    public String toString() {
        return "ArrayService{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int[] fillArray(int arrayLength){
        array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
        return array;
    }

    //Получить текущую длину массива
    @Override
    public int getLength() {
        return array.length;
    }

    //Добавить элемент. Длина массива должна увеличится на 1.
    @Override
    public int addElement(Integer element) {
        int plusOneElementLength = array.length;
        int[] plusOneElement = new int[plusOneElementLength + 1];
        for (int i = 0; i < array.length; i++) {
            plusOneElement[i] = array[i];
            if (i == array.length - 1) {
                plusOneElementLength++;
                plusOneElement[i + 1] = element;

            }
        }
        array = plusOneElement;
        return plusOneElementLength;
    }

    //Получить элемент по индексу
    @Override
    public Integer getElement(int index) {

        for(int i = 0; i < array.length; i++) {
            if(i == index) {
                //System.out.println("Значение элемента под индексом " + index + " = " + array[i]);
                return Integer.valueOf(array[i]);
            }
        }
        return null;
    }
    //Удалить все текущие элементы (длина массива будет 0 после этой операции)
    @Override
    public void removeAllElements() {

        int removeArray = 0;
        int[] deletedArray = new int[removeArray];
        array = deletedArray;
    }

    @Override
    public Integer[] getAllElements() {
        fillArray(arrayLength);
        Integer[] arrayOfIntegers = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            arrayOfIntegers[i] = Integer.valueOf(array[i]);
        }
        return arrayOfIntegers;
    }
}
