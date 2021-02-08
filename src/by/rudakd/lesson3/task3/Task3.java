package by.rudakd.lesson3.task3;
// 3.Вычислить: 1+2+4+8+…+256

public class Task3 {
    public static void main(String[] args) {
        int x = 1;
        int sumOfElements = 0;
        while(x <= 256) {
            sumOfElements += x;
            x *= 2;
        }
        System.out.println("The sum of the elements is: " + sumOfElements);
    }
}
