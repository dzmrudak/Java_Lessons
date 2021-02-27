package by.rudakd.lesson6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ArrayService el1 = new ArrayService(5);

        System.out.println("Получить текущую длину массива");
        System.out.println("Размер массива = " + el1.getLength());
        System.out.println();

        System.out.println("Добавить элемент. Длина массива должна увеличится на 1.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите элемент, который будет занесен в массив: ");
        Integer element = scan.nextInt();
        System.out.println("Длина нового массива =" + el1.addElement(element));
        System.out.println();

        System.out.println("Получить элемент по индексу");
        System.out.println(el1.getElement(5));
        System.out.println();

        System.out.println("Удалить все текущие элементы (длина массива будет 0 после этой операции");
        el1.removeAllElements();
        System.out.println("Массив без элементов: " + el1.toString());
        System.out.println();

        System.out.println("Вернуть массив где находятся все текущие элементы");
        el1.getAllElements();
        System.out.println("Массив: " + el1.toString());
    }
    }
}
