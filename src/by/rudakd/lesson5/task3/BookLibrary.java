package by.rudakd.lesson5.task3;

import java.util.Scanner;

public class BookLibrary {
    public static Book[] findByAuthor(String searchableAuthor, Book[] array) {

        int countByAuthor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].author.compareTo(searchableAuthor) == 0) {
                countByAuthor++;
            }
        }
        if (countByAuthor == 0) {
            System.out.println("There are no books by " + searchableAuthor);
        }
        Book[] bookArrayByAuthor = new Book[countByAuthor];
        int indexByAuthor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].author.compareTo(searchableAuthor) == 0) {
                bookArrayByAuthor[indexByAuthor] = array[i];
                indexByAuthor++;
            }
        }
        return bookArrayByAuthor;
    }

    public static void printBooksArrayByAuthor(String searchableAuthor, Book[] array) {
        Book[] arrayToPrint = findByAuthor(searchableAuthor, array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public static Book[] findByPublisher(String searchablePublisher, Book[] array) {
        int countByPublisher = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].publisher.compareTo(searchablePublisher) == 0) {
                countByPublisher++;
            }
        }
        if (countByPublisher == 0) {
            System.out.println("There are no books within publisher " + searchablePublisher);
        }
        Book[] bookArrayByPublisher = new Book[countByPublisher];
        int indexByPublisher = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].publisher.compareTo(searchablePublisher) == 0) {
                bookArrayByPublisher[indexByPublisher] = array[i];
                indexByPublisher++;
            }
        }
        return bookArrayByPublisher;
    }

    public static void printBooksArrayByPublisher(String searchablePublisher, Book[] array) {
        Book[] arrayToPrint = findByPublisher(searchablePublisher, array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public static Book[] findByYear(int searchableYear, Book[] array) {

        int countByYear = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].year > searchableYear) {
                countByYear++;
            }
        }
        if (countByYear == 0) {
            System.out.println("There are no books published after " + searchableYear);
        }
        Book[] bookArrayByYear = new Book[countByYear];
        int indexByYear = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].year > searchableYear) {
                bookArrayByYear[indexByYear] = array[i];
                indexByYear++;
            }
        }
        return bookArrayByYear;
    }
    public static void printBooksArrayByYear(int searchableYear, Book[] array) {
        Book[] arrayToPrint = findByYear(searchableYear, array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
