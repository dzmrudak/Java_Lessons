package by.rudakd.lesson5.task2;

import java.util.Scanner;

public class CustomerListInInterval {

    public static void printSortedArrayOfCustomers(Customer[] array) {
        ArraySorting.shuttleSorting(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Customer[] customerListInInterval(Customer[] array) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial value of the Interval: ");
        int startOfInterval = sc.nextInt();
        System.out.print("Enter the end value of the Interval: ");
        int endOfInterval = sc.nextInt();
        while (endOfInterval < startOfInterval) {
            System.out.println();
            System.out.println("The endOfInterval should be >= the startOfInterval");
            System.out.print("Enter the end value of the Interval: ");
            endOfInterval = sc.nextInt();
        }

        int countOfNewArrayLength = 0;
        int indexOfNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i].creditCardId < startOfInterval) || (array[i].creditCardId > endOfInterval)) {
                continue;
            } else {
                countOfNewArrayLength++;
            }
        }
        Customer[] arrayInInterval = new Customer[countOfNewArrayLength];
        for (int i = 0; i < array.length; i++) {
            if ((array[i].creditCardId < startOfInterval) || (array[i].creditCardId > endOfInterval)) {
                continue;
            } else {
                arrayInInterval[indexOfNewArray] = array[i];
                indexOfNewArray++;
            }
        }
        return arrayInInterval;
    }

    public static void printArrayInInterval(Customer[] array) {
        Customer[] arrayToPrint = customerListInInterval(array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
