package by.rudakd.lesson9;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    private final int referenceLength;

    public MyComparator(String reference) {
        super();
        this.referenceLength = reference.length();
    }

    public int compare(String s1, String s2) {
        int dist1 = Math.abs(s1.length() - referenceLength);
        int dist2 = Math.abs(s2.length() - referenceLength);

        return dist1 - dist2;
    }
}