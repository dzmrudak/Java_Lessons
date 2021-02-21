package by.rudakd.lesson6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ArrayService el1 = new ArrayService();
//        for (int i = 0; i < el1.array.length; i++) {
//            el1.array[i] = (int) (Math.random() * 10);
//        }
        el1.fillArray(el1.arrayLength);
        System.out.println(el1.toString());
        System.out.println("Размер массива = " + el1.getLength());

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите элемент, который будет занесен в массив: ");
        Integer element = scan.nextInt();
        System.out.println("Длина нового массива =" + el1.addElement(element));
        System.out.println(el1.toString());

        System.out.print("Введите значение искомого индекса: ");
        int index = scan.nextInt();
        System.out.println("Элемент под индексом " + index + " = " + el1.getElement(index));

        el1.removeAllElements();
        System.out.println("Массив без элементов: " + el1.toString());

        el1.getAllElements();
        System.out.println("Массив с восстановленными элементами: " + el1.toString());





    }
}
