package by.rudakd.lesson8origin;

public class Task8 {
    public static void main(String[] args) {

        String ipAddress = "255.255.255.0";
        String byaka = "Бяка Бяка три четыре бяка пять";
        String palindrome = "tenet";

        String[] arrayString = new String[3];
        arrayString[0] = "123";
        arrayString[1] = "123678";
        arrayString[2] = "12313";


        // 1. Напишите метод для поиска самой длинной строки в массиве.
        StringService.theLongestString(arrayString);

        // 2. Напишите метод, который проверяет является ли слово палиндром.
        StringService.isPalindrome(palindrome);

        // 3. Напишите метод, заменяющий в тексте все вхождения слова "бяка" на "вырезано цензурой".
        System.out.println(StringService.replaceCensored(byaka));

        // 4. Имеются две строки. Напишите метод, возвращающий кол-во вхождений одной строки в другую.
        System.out.println("Number of entrance = " + StringService.numberOfEntrance(byaka, "Бяка"));

        // 5. Написать метод, который проверяет является ли строка ip-адресом.
        StringService.isIPAddress(ipAddress);
    }
}
