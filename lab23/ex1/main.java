package lab23.ex1;

import java.util.ArrayList;
import java.util.List;

// Класс ArrayQueueModule реализовывает один
//экземпляр очереди с использованием переменных класса
class ArrayQueueModule {
    private static List queue = new ArrayList<>();
    private static int size;

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(Object element) {//вставка
        queue.add(element);
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: неизменно
    public static Object element() {
        return queue.get(0);
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public static Object dequeue() {//удаление
        Object removedElement = queue.remove(0);
        size--;
        return removedElement;
    }

    // Постусловие: неизменно
    public static int size() {
        return size;
    }

    // Постусловие: неизменно
    public static boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена, size = 0
    public static void clear() {
        queue.clear();
        size = 0;
    }
}

// Класс ArrayQueueADT абстрактный тип
class ArrayQueueADT{

    private List queue = new ArrayList<>();;
    private int size;

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        queue.queue.add(element);
        queue.size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: неизменно
    public static Object element(ArrayQueueADT queue) {
        return queue.queue.get(0);
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public static Object dequeue(ArrayQueueADT queue) {
        Object removedElement = queue.queue.remove(0);
        queue.size--;
        return removedElement;
    }

    // Постусловие: неизменно
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Поступсловие: неизменно
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Постусловие: очередь очищена, size = 0
    public static void clear(ArrayQueueADT queue) {
        queue.queue.clear();
        queue.size = 0;
    }
}

// Класс ArrayQueue
class ArrayQueue {
    private List queue = new ArrayList<>();
    private int size;

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(Object element) {
        queue.add(element);
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: неизменно
    public Object element() {
        return queue.get(0);
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public Object dequeue() {
        Object removedElement = queue.remove(0);
        size--;
        return removedElement;
    }

    // Постусловие: неизменно
    public int size() {
        return size;
    }

    // Поступсловие: неизменно
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена, size = 0
    public void clear() {
        queue.clear();
        size = 0;
    }
}

// Пример использования:
public class main {
    public static void main(String[] args) {
// Тесты
        ArrayQueueModule.enqueue("element1");
        ArrayQueueModule.enqueue("element3");
        ArrayQueueModule.dequeue();
        System.out.println(ArrayQueueModule.element());

        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, "element1");
        ArrayQueueADT.enqueue(queue, "element2");
        ArrayQueueADT.dequeue(queue);
        System.out.println(ArrayQueueADT.element(queue));

        ArrayQueue q = new ArrayQueue();
        q.enqueue("element1");
        q.enqueue("element2");
        q.dequeue();
        System.out.println(q.element());
    }
}
