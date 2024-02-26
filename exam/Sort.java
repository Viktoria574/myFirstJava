package exam;

import java.util.Comparator;
import java.util.List;
public class Sort <T extends Number> implements Comparator<T>{
    public void bubbleSort(List<T> list) {//сортировка пузырьком
        int len = list.size();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int compare(T a, T b) {//равнение элементов
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    public void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int index = help(list, low, high);
            quickSort(list, low, index - 1);
            quickSort(list, index + 1, high);
        }
    }

    private int help(List<T> list , int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(list.get(j),pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<T> list, int i, int j) {
        var temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
