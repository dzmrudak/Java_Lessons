package by.rudakd.lesson5.task3;

import java.util.Arrays;
import java.util.Scanner;

public class BookLibrary {
    public static void booksByAuthor(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Author: ");
        String searchableAuthor = sc.nextLine();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].author.compareTo(searchableAuthor) == 0) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books by " + searchableAuthor);
        }
        System.out.println();
    }
    public static void booksByPublisher(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Publisher: ");
        String searchablePublisher = sc.nextLine();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].publisher.compareTo(searchablePublisher) == 0) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books within publisher " + searchablePublisher);
        }
        System.out.println();
    }

    public static void booksByYear(Book[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int searchableYear = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].year > searchableYear) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books published after " + searchableYear);
        }
        System.out.println();
    }

}
