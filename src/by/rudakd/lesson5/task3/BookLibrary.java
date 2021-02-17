package by.rudakd.lesson5.task3;

import java.util.Scanner;

public class BookLibrary {

    public static Book[] booksByAuthor(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Author: ");
        String searchableAuthor = sc.nextLine();
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
            if (array[i].author.compareTo(searchableAuthor) != 0) {
                continue;
            } else {
                bookArrayByAuthor[indexByAuthor] = array[i];
                indexByAuthor++;
            }
        }
        return bookArrayByAuthor;
    }

    public static void printBooksArrayByAuthor(Book[] array) {
        Book[] arrayToPrint = booksByAuthor(array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public static Book[] booksByPublisher(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Publisher: ");
        String searchablePublisher = sc.nextLine();
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
            if (array[i].publisher.compareTo(searchablePublisher) != 0) {
                continue;
            } else {
                bookArrayByPublisher[indexByPublisher] = array[i];
                indexByPublisher++;
            }
        }
        return bookArrayByPublisher;
    }

    public static void printBooksArrayByPublisher(Book[] array) {
        Book[] arrayToPrint = booksByPublisher(array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public static Book[] booksByYear(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int searchableYear = sc.nextInt();
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
            if (array[i].year <= searchableYear) {
                continue;
            } else {
                bookArrayByYear[indexByYear] = array[i];
                indexByYear++;
            }
        }
        return bookArrayByYear;
    }
    public static void printBooksArrayByYear(Book[] array) {
        Book[] arrayToPrint = booksByYear(array);
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

}
