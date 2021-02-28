package by.rudakd.lesson7.task1;

public class Sorting {

    private static void swap(Abiturient[] array, int ind1, int ind2) {
        Abiturient tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static Abiturient[] shuttleSortingDESC(Abiturient[] array) {
        for (int i = 1; i < array.length; i++) {
            if ((array[i].sumOfMarks) > (array[i - 1].sumOfMarks)) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if ((array[z].sumOfMarks) > (array[z - 1].sumOfMarks)) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static Abiturient[] shuttleSortingASC(Abiturient[] array) {
        for (int i = 1; i < array.length; i++) {
            if ((array[i].sumOfMarks) < (array[i - 1].sumOfMarks)) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if ((array[z].sumOfMarks) < (array[z - 1].sumOfMarks)) {
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
