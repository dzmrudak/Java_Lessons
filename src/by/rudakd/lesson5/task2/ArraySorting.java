package by.rudakd.lesson5.task2;

public class ArraySorting {

    private static void swap(Customer[] array, int ind1, int ind2) {
        Customer tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static Customer[] shuttleSorting(Customer[] array) {
        for (int i = 1; i < array.length; i++) {
            if ((array[i].surname).compareTo(array[i - 1].surname) < 0) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if ((array[z].surname).compareTo(array[z - 1].surname) < 0) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
    }
}
