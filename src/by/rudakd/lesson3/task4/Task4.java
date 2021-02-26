package by.rudakd.lesson3.task4;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scan.nextInt();
        System.out.print("Enter B: ");
        int b = scan.nextInt();
        int composition = 0;
        int count = 0;

         do {
            composition += a;
            count++;
        } while (count < b);
        System.out.println("\nA * B = " + composition);
    }
}
