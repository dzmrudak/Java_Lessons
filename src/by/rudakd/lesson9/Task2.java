package by.rudakd.lesson9;
// 2. Имеется текст. Следует составить частотный словарь.

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please, enter some text");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        // Move a text to an array
        String[] tokens = text.split(" ");
        System.out.println(Arrays.toString(tokens));
//        // Turn every word to lower case
//        for(String token: tokens) {
//            String word = token.toLowerCase();
//            Integer count = wordMap.get(word);
//            if(count == null){
//                wordMap.put(word, 1);
//            } else {
//                wordMap.put(word, count + 1);
//            }
//        }
//
//        printMap(wordMap);
    }

    private static void printMap(Map<String, Integer> wordMap) {
        // to sort words in text using a TreeMap<>() data structure
        Map<String, Integer> wordTreeMap = new TreeMap<>(wordMap);
        Set<String> keys = wordTreeMap.keySet();
        for(String key: keys){
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));
        }
    }
}
