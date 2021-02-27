package by.rudakd.lesson5.task2;

import java.util.Scanner;

public class CustomerListInInterval {

    public static void printSortedArrayOfCustomers(Customer[] array) {
        ArraySorting.shuttleSorting(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Customer[] customerListInInterval(int startOfInterval, int endOfInterval, Customer[] array) {

        int countOfNewArrayLength = 0;
        int indexOfNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i].creditCardId >= startOfInterval) && (array[i].creditCardId <= endOfInterval)) {
                countOfNewArrayLength++;;
            }
        }
        Customer[] arrayInInterval = new Customer[countOfNewArrayLength];
        for (int i = 0; i < array.length; i++) {
            if ((array[i].creditCardId >= startOfInterval) && (array[i].creditCardId <= endOfInterval)) {
                arrayInInterval[indexOfNewArray] = array[i];
                indexOfNewArray++;
            }
        }
        return arrayInInterval;
    }

    public static void printArrayInInterval(int startOfInterval, int endOfInterval, Customer[] array) {
        Customer[] arrayToPrint = customerListInInterval(startOfInterval, endOfInterval, array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
