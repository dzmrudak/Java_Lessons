package by.rudakd.lesson5.task4;
//4.Реализовать методы сложения, вычитания, умножения и деления объектов.
//Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
//Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным индексом
// путем добавления следующего за ним элемента.
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Fraction fract1 = new Fraction(1, 1, 2, 3);
        Fraction fract2 = new Fraction(1, 1, 2, 3);
        Fraction fract3 = new Fraction(1, 1, 2, 3);
        Fraction fract4 = new Fraction(1, 1, 2, 3);
        Fraction fract5 = new Fraction(1, 1, 2, 3);
        Fraction fract6 = new Fraction(1, 1, 2, 3);
        //Применение методов сложения, вычитания, умножения, деления
        System.out.println(FractionService.additionObject(fract1, fract2));
        System.out.println(FractionService.subtractionObject(fract1, fract2));
        System.out.println(FractionService.multiplicationObject(fract1, fract2));
        System.out.println(FractionService.divisionObject(fract1, fract2));

        System.out.println();

        //Инициализация массива размером amountOfFractions, ручной ввод
        System.out.print("Enter the amount of fractions: ");
        Scanner sc = new Scanner(System.in);
        int amountOfFractions = sc.nextInt();
        Fraction[] arrayOfFractions = new Fraction[amountOfFractions];
        //Создание массива дробей и ввод/вывод значений на экран
        ArrayOfFractions.createArray(arrayOfFractions);
        ArrayOfFractions.printArray(arrayOfFractions);

        //Инициализация массива объектов
        Fraction[] arrayOfFractions2 = new Fraction[6];
        //Заполнение массива объектов
        arrayOfFractions2[0] = fract1;
        arrayOfFractions2[1] = fract2;
        arrayOfFractions2[2] = fract3;
        arrayOfFractions2[3] = fract4;
        arrayOfFractions2[4] = fract5;
        arrayOfFractions2[5] = fract6;

        // Передача массива в метод, который изменяет каждый элемент массива с четным индексом
        // путем добавления следующего за ним элемента
        ArrayOfFractions.addNextElemArray(arrayOfFractions2);
        // Вывод массива на экран
        ArrayOfFractions.printArray(arrayOfFractions2);
    }
}
