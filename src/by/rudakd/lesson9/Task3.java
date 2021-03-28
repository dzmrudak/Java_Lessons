package by.rudakd.lesson9;
// 3. Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> randomNumbers = new LinkedList<>();
        randomNumbers.add(1 + (int) (Math.random() * 10));
        randomNumbers.add(1 + (int) (Math.random() * 10));
        randomNumbers.add(1 + (int) (Math.random() * 10));
        randomNumbers.add(1 + (int) (Math.random() * 10));
        randomNumbers.add(1 + (int) (Math.random() * 10));

        System.out.println(randomNumbers);
        deleteRepeatedElements(randomNumbers);
        System.out.println(randomNumbers);
    }

    private static void deleteRepeatedElements(LinkedList<Integer> randomNumbers) {
        for(int i = 0; i < randomNumbers.size(); i++){
            for(int j = 0; j < randomNumbers.size(); j++){
                if(j != i && randomNumbers.get(j).equals(randomNumbers.get(i))){
                    randomNumbers.remove(j);
                }
            }
        }
    }


}
