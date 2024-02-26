package lab26;

import java.util.Scanner;

// Структура для хранения данных о читательском абонементе
class Reader {
    private int cardNumber;
    private String name, address;
    public Reader(int cardNumber, String name, String address) {
        this.cardNumber=cardNumber;
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
};

// Структура для хранения пар "ключ-хеш"
class HashPair {
    private int key, hash;
    public HashPair(int key, int hash) {
        this.key=key;
        this.hash=hash;
    }

    public int getHash() {
        return hash;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
};

// Класс хеш-таблицы
class HashTable {

    private int TABLE_SIZE = 100;

    Reader[] data = new Reader[TABLE_SIZE]; // Массив для хранения полезных данных
    HashPair[] hashTable = new HashPair[TABLE_SIZE]; // Массив для хранения пар ключ-хеш

    //Конструктор
    public HashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = new HashPair(-1,-1);
            data[i] = new Reader(-1,"","");
        }
    }

    // Метод для вычисления первого хеша
    int hashFunction1(int key) {
        return key % TABLE_SIZE;
    }

    // Метод для вычисления второго хеша
    int hashFunction2(int key) {
        // Выбираем произвольное простое число меньше, чем размер таблицы
        int prime = 13;
        return prime - (key % prime);
    }

    // Метод для вставки данных
    void insertData(int key, String name, String address) {
        int hash1 = hashFunction1(key);
        int hash2 = hashFunction2(key);
        int hashIndex = hash1;


        // Поиск свободной позиции в хеш-таблице
        while (hashTable[hashIndex].getKey() != -1) {
            hashIndex = (hashIndex + hash2) % TABLE_SIZE;
            if (hashIndex == hash1) {
                System.out.println("[!] Хеш-таблица заполнена, вставка невозможна.\n");
                return;
            }
        }

        // Вставка данных в хеш-таблицу и массив
        hashTable[hashIndex].setKey(key);
        hashTable[hashIndex].setHash(hash1);
        data[hashIndex].setCardNumber(key);
        data[hashIndex].setName(name);
        data[hashIndex].setAddress(address);

        System.out.println("Данные успешно добавлены.\n");
    }

    // Метод для удаления данных по ключу
    void removeData(int key) {
        int hashIndex = findHashIndexByKey(key);
        if (hashIndex == -1) {
            System.out.println("[!] Данные с указанным ключом не найдены.\n");
            return;
        }

        // Удаление данных из хеш-таблицы и массива
        hashTable[hashIndex].setKey(-1);
        hashTable[hashIndex].setHash(-1);
        data[hashIndex].setCardNumber(-1);
        data[hashIndex].setName("");
        data[hashIndex].setAddress("");

        System.out.println("Данные успешно удалены.\n");
    }

    // Метод для поиска данных по ключу
    void searchData(int key) {
        int hashIndex = findHashIndexByKey(key);
        if (hashIndex == -1) {
            System.out.println("[!] Данные с указанным ключом не найдены.\n");
            return;
        }

        // Вывод данных
        System.out.println("Номер читательского: " + data[hashIndex].getCardNumber() + "\n");
        System.out.println("ФИО: " + data[hashIndex].getName() + "\n");
        System.out.println("Адрес: " + data[hashIndex].getAddress() + "\n");
        System.out.println("\n");
    }

    // Метод для вывода всех данных
    void printData() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (hashTable[i].getKey() != -1) {
                System.out.println("Номер читательского: " + data[i].getCardNumber() + "\n");
                System.out.println("ФИО: " + data[i].getName() + "\n");
                System.out.println("Адрес: " + data[i].getAddress() + "\n");
                System.out.println("\n");
            }
        }
    }

    // Вспомогательный метод для поиска индекса хеша по ключу
    private int findHashIndexByKey(int key) {
        int hash1 = hashFunction1(key);
        int hashIndex = hash1;

        while (hashTable[hashIndex].getKey() != -1) {
            if (hashTable[hashIndex].getKey() == key) {
                return hashIndex;
            }

            hashIndex = (hashIndex + hashFunction2(key)) % TABLE_SIZE;

            if (hashIndex == hash1) {
                break;
            }
        }

        return -1;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable table = new HashTable();


        table.insertData(10000, "Полякова Виктория Ивановна", "г. Тула, ул. Королева, д. 33");
        table.insertData(12345, "Курбанаев Денис Алексеевич", "г. Москва, ул. Проспект Вернадского, д. 78");
        table.insertData(64555, "Балкизов Андемир Иванович", "г. Нальчик, ул. Ленина, д. 1");
        table.insertData(22200, "Иолович Евгения Ивановна", "г. Москва, ул. Уличная, д. 3");

        String choice, name, address;
        int key;

        while (true) {
            System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ:" + "\n" +
                    "ВСТАВКА / УДАЛЕНИЕ / ПОИСК / ВЫВОД" + "\n");
            choice = scanner.next();

            if (choice.equals("ВСТАВКА")) {
                System.out.println("Введите ключ" + "\n");
                key = scanner.nextInt();
                if (key < 10000 || key > 99999) {
                    System.out.println("[!] Некорректный ключ." + "\n");
                    continue;
                }
                System.out.println("Введите имя" + "\n");
                name = scanner.next();
                System.out.println("Введите адрес" + "\n");
                address = scanner.next();

                table.insertData(key, name, address);
            }

            else if (choice.equals("УДАЛЕНИЕ")) {
                System.out.println("Введите ключ" + "\n");
                key = scanner.nextInt();
                if (key < 10000 || key > 99999) {
                    System.out.println("[!] Некорректный ключ." + "\n");
                    continue;
                }
                System.out.println("Удаление данных с ключом " + key + ":" + "\n");
                table.removeData(key);
            }

            else if (choice.equals("ПОИСК")) {
                System.out.println("Введите ключ" + "\n");
                key = scanner.nextInt();
                if (key < 10000 || key > 99999) {
                    System.out.println("[!] Некорректный ключ." + "\n");
                    continue;
                }
                System.out.println("Поиск по ключу " + key + ":" + "\n");
                table.searchData(key);

            }

            else if (choice.equals("ВЫВОД")) {
                table.printData();
            }

            else {
                System.out.println("[!] Некорректный ввод команды." + "\n");
            }
        }
    }
}
