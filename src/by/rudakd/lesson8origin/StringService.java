package by.rudakd.lesson8origin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringService {

    // 1. Напишите метод для поиска самой длинной строки в массиве.
    public static void theLongestString(String[] string) {
        String theLongestStr = string[0];
        int index = 0;
        for (int i = 1; i < string.length; i++) {
            if (string[i - 1].length() < string[i].length()) {
                theLongestStr = string[i];
                index = i + 1;
            }
        }
        System.out.println("The longest string is #" + index + ": " + theLongestStr);
    }

    // 2. Напишите метод, который проверяет является ли слово палиндром.
    public static void isPalindrome(String str) {
        char newStr[] = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            newStr[i] = str.charAt(str.length() - i - 1);
            if (newStr[i] == str.charAt(i)) {
                count++;
            }
        }
        if (count == str.length()) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }

    // 3. Напишите метод, заменяющий в тексте все вхождения слова "бяка" на "вырезано цензурой".
    public static String replaceCensored(String str) {
        String censoredString = str.replaceAll("бяка|Бяка", "<ВЦ>");
        return censoredString;
    }

    // 4. Имеются две строки. Напишите метод, возвращающий кол-во вхождений одной строки в другую.
    public static int numberOfEntrance(String str1, String str2) {
        int entranceNumber = 0;
        Pattern p = Pattern.compile(str2);
        Matcher m = p.matcher(str1);
        while (m.find()) {
            entranceNumber++;
        }
        return entranceNumber;
    }

    // 5. Написать метод, который проверяет является ли строка ip-адресом.
    public static void isIPAddress(String str) {
        if (str.matches("([0-5]{1,3})((\\.[0-5]{1,3}){3})$")) {
            System.out.println("The string is an IP address");
        } else {
            System.out.println("The string is not an IP address");
        }
    }
}
