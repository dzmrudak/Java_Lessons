package by.rudakd.lesson5.task2;

import java.util.Scanner;

public class CustomerListInInterval {
    public static void customerListInInterval(Customer[] array) {

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

        for (int i = 0; i < array.length; i++) {
            if ((array[i].creditCardId < startOfInterval) || (array[i].creditCardId > endOfInterval)) {
                continue;
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
