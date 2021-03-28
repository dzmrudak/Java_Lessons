package by.rudakd.lesson9;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        List<String> poem = new ArrayList<>();

        poem.add("So I made a bath that night of honey");
        poem.add("dipped my toes in rose and money");
        poem.add("stayed all night in that bathwater");
        poem.add("even some I swallowed");

        Collections.sort(poem, new MyComparator(""));
        for(String s: poem) {
            System.out.println(s);
        }
    }
}
