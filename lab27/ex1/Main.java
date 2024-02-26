package lab27.ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(7);

        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
