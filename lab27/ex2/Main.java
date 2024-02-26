package lab27.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> people = createMap();

        int sameFirstNameCount = getSameFirstNameCount(people);
        int sameLastNameCount = getSameLastNameCount(people);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Козлов", "Алексей");
        map.put("Смирнов", "Александр");
        map.put("Андреев", "Алексей");
        map.put("Николаев", "Дмитрий");
        map.put("Кузнецов", "Павел");
        map.put("Зайцев", "Александр");
        map.put("Соловьев", "Андрей");

        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        int count = 0;
        Set<String> values = new HashSet<>(map.values());

        for (String value : values) {
            if (Collections.frequency(map.values(), value) > 1) {
                count+=Collections.frequency(map.values(), value);
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        int count = 0;
        Set<String> keys = new HashSet<>(map.keySet());

        for (String key : keys) {
            if (Collections.frequency(map.keySet(), key) > 1) {
                count+=Collections.frequency(map.keySet(), key);
            }
        }

        return count;
    }
}