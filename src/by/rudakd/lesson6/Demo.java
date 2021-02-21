package by.rudakd.lesson6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ArrayService el1 = new ArrayService();

        //Получить текущую длину массива
        el1.fillArray(el1.arrayLength);
        System.out.println(el1.toString());
        System.out.println("Размер массива = " + el1.getLength());

        //Добавить элемент. Длина массива должна увеличится на 1.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите элемент, который будет занесен в массив: ");
        Integer element = scan.nextInt();
        System.out.println("Длина нового массива =" + el1.addElement(element));
        System.out.println(el1.toString());

        //Получить элемент по индексу
        System.out.print("Введите значение искомого индекса: ");
        int index = scan.nextInt();
        System.out.println("Элемент под индексом " + index + " = " + el1.getElement(index));


        //Удалить все текущие элементы (длина массива будет 0 после этой операции)
        el1.removeAllElements();
        System.out.println("Массив без элементов: " + el1.toString());

        //Вернуть массив где находятся все текущие элементы
        el1.getAllElements();
        System.out.println("Массив с восстановленными элементами: " + el1.toString());





    }
}
