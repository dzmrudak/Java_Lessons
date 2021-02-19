package by.rudakd.lesson5.task4;

import java.util.Scanner;

public class ArrayOfFractions {
    public static Fraction[] createArray(Fraction[] a) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a sign (1 - for '+'; (-1) - for '-'): ");
            int sign = scan.nextInt();
            while ((sign != 1) && (sign != (-1))) {
                System.out.print("Enter a sign (1 - for '+'; (-1) - for '-'): ");
                sign = scan.nextInt();
            }

            System.out.print("Enter an intPart: ");
            int intPart = scan.nextInt();
            System.out.print("Enter m: ");
            int m = scan.nextInt();
            System.out.print("Enter a n: ");
            int n = scan.nextInt();
            Fraction fraction = new Fraction(sign, intPart, m, n);
            a[i] = fraction;
            FractionService.getIntPart(a[i]);
        }
        return a;
    }

    public static void printArray(Fraction[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static Fraction[] addNextElemArray(Fraction[] a) {

        for(int i = 1; i < a.length; i++) {
            if ((i - 1) % 2 == 0) {
                a[i - 1] = FractionService.additionObject(a[i], a[i - 1]);
            }
            else {
                FractionService.getIntPart(a[i]);
            }
        }
        for(int i = 0; i < a.length; i++){ //Выделение целой части и сокращение дробей
            FractionService.getIntPart(a[i]);
        }
        return a;
    }
}
