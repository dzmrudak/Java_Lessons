package by.rudakd.lesson9;
// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;


public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayOfMarks = new ArrayList<>();
        arrayOfMarks.add(1 + (int) (Math.random() * 10));
        arrayOfMarks.add(1 + (int) (Math.random() * 10));
        arrayOfMarks.add(1 + (int) (Math.random() * 10));
        arrayOfMarks.add(1 + (int) (Math.random() * 10));
        arrayOfMarks.add(1 + (int) (Math.random() * 10));

        System.out.println(arrayOfMarks);
        findTheHighestMark(arrayOfMarks);

    }

    public static void findTheHighestMark(ArrayList<Integer> array){
        Iterator<Integer> iter = array.iterator();
        Integer highestMark = array.get(0);
        while(iter.hasNext()){
            Integer nextElement = iter.next();
            if(highestMark.compareTo(nextElement) < 0) {
                highestMark = nextElement;
            }
        }
        System.out.println("highest mark = " + highestMark);
    }
}
