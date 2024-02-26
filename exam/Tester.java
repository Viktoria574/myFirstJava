package exam;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Sort<Integer> integerSorter = new Sort<>();
        List<Integer> list = new LinkedList<>(Arrays.asList(25, 46, 15, 26, 12));
        integerSorter.bubbleSort(list);

        System.out.println("Сортировка пузырьком для целых чисел: ");
        for (var item : list)
            System.out.print(item + " ");

        System.out.println();

        Sort<Double> doubleSorter = new Sort<>();
        List<Double> list1 = new ArrayList<>(Arrays.asList(25.1, 46.52, 15.14, 26.2, 12.61));
        doubleSorter.quickSort(list1, 0, list1.size() - 1);

        System.out.println("Быстрая сортировка для десятичных чисел: ");
        for (var item : list1)
            System.out.print(item + " ");
    }
}
