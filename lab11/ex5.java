package lab11;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
public class ex5 {
    public static void main(String[] args) {
        int numOfElements = 10000;

        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList<>();

        System.out.println("Количество элементов: "+ numOfElements);

        long arrayListInsertionTime = measureInsertionTime(arrayList, numOfElements);
        System.out.println("Время вставки в ArrayList: " + arrayListInsertionTime + " мс");

        long linkedListInsertionTime = measureInsertionTime(linkedList, numOfElements);
        System.out.println("Время вставки в LinkedList: " + linkedListInsertionTime + " мс");

        measureInsertionTime(arrayList, numOfElements);
        measureInsertionTime(linkedList, numOfElements);

        long arrayListDeletionTime = measureDeletionTime(arrayList, numOfElements);
        System.out.println("Время удаления из ArrayList: " + arrayListDeletionTime + " мс");

        long linkedListDeletionTime = measureDeletionTime(linkedList, numOfElements);
        System.out.println("Время удаления из LinkedList: " + linkedListDeletionTime + " мс");

        long arrayListAdditionTime = measureAdditionTime(arrayList, numOfElements);
        System.out.println("Время добавления в ArrayList: " + arrayListAdditionTime + " мс");

        long linkedListAdditionTime = measureAdditionTime(linkedList, numOfElements);
        System.out.println("Время добавления в LinkedList: " + linkedListAdditionTime + " мс");

        long arrayListSearchTime = measureSearchTime(arrayList, numOfElements);
        System.out.println("Время поиска в ArrayList: " + arrayListSearchTime + " мс");

        long linkedListSearchTime = measureSearchTime(linkedList, numOfElements);
        System.out.println("Время поиска в LinkedList: " + linkedListSearchTime + " мс");
    }

    //Метод для замера времени вставки в структуру данных
    private static long measureInsertionTime(List list, int numOfElements) {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        for (int j = 0; j < numOfElements; j++) {
            int element = random.nextInt();
            list.add(element);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //Метод для замера времени удаления из структуры данных
    private static long measureDeletionTime(List list, int numOfElements) {
        long startTime = System.currentTimeMillis();

        for (int j = 0; j < numOfElements; j++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //Метод для замера времени добавления в структуру данных
    private static long measureAdditionTime(List list, int numOfElements) {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        for (int j = 0; j < numOfElements; j++) {
            int element = random.nextInt();
            int randomIndex = random.nextInt(list.size());
            list.add(randomIndex, element);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //Метод для замера времени поиска в структуре данных
    private static long measureSearchTime(List list, int numOfElements) {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        for (int j = 0; j < numOfElements; j++) {
            int element = random.nextInt();
            list.contains(element);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
