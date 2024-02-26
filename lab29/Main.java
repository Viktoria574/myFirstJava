package lab29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static TableOrderManager tableOrderManager = new TableOrderManager();
    static InternetOrderManager internetOrderManager = new InternetOrderManager();
    public static void generateOrders() {
        Random rand = new Random();

        Address address;
        String[] cityName = { "Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург",
                "Нижний Новгород", "Казань", "Самара", "Омск", "Ростов-на-Дону", "Уфа" };

        String[] streetName = { "Ленина", "Гагарина", "Кирова", "Маркса",
                "Советская", "Пушкина", "Октябрьская", "Проспект мира", "Горького", "Фрунзе" };

        String[] buildingLetter = { "A", "B","C" };

        String[] firstName = { "Иван", "Александр", "Дмитрий", "Максим",
                "Артем", "Николай", "Сергей", "Михаил", "Андрей", "Алексей" };

        String[] secondName = { "Иванов", "Петров", "Сидоров", "Смирнов",
                "Кузнецов", "Васильев", "Попов", "Морозов", "Новиков", "Федоров" };

        for(int i=0;i<10;i++) {
            Item[] items = new Item[10];
            Item item;
            for(int j=0;j<10;j++) {
                if(rand.nextBoolean())
                    item = new Dish(rand.nextInt(0,100), "блюдо "+rand.nextInt(0,10)," ");
                else
                    item = new Drink(rand.nextInt(0,100), "напиток "+rand.nextInt(0,10)," ", DrinkTypeEnum.COFFEE);
                items[j] = item;
            }
            address = new Address(cityName[rand.nextInt(0,10)], rand.nextInt(10000,99999), streetName[rand.nextInt(0,10)], rand.nextInt(1,10), buildingLetter[rand.nextInt(0,3)], rand.nextInt(1,10));
            try{
                tableOrderManager.AddOrder(
                        address,
                        new TableOrder(
                                items,
                                new Customer(
                                        firstName[rand.nextInt(0,10)],
                                        secondName[rand.nextInt(0,10)],
                                        rand.nextInt(0,10),
                                        address)));
            }
            catch (Exception ex){
                System.out.println("Exception");
            }
        }

        for(int i=0;i<10;i++) {
            Item[] items = new Item[10];
            Item item;
            for(int j=0;j<10;j++) {
                if(rand.nextBoolean())
                    item = new Dish(rand.nextInt(0,100), "блюдо "+rand.nextInt(0,10)," ");
                else
                    item = new Drink(rand.nextInt(0,100), "напиток "+rand.nextInt(0,10)," ", DrinkTypeEnum.COFFEE);
                items[j] = item;
            }
            address = new Address(cityName[rand.nextInt(0,10)], rand.nextInt(10000,99999), streetName[rand.nextInt(0,10)], rand.nextInt(1,10), buildingLetter[rand.nextInt(0,3)], rand.nextInt(1,10));
            try{
                internetOrderManager.AddOrder(
                        address,
                        new InternetOrder(
                                items,
                                new Customer(
                                        firstName[rand.nextInt(0,10)],
                                        secondName[rand.nextInt(0,10)],
                                        rand.nextInt(0,10),
                                        address)));
            }
            catch (Exception ex){
                System.out.println("Exception");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        generateOrders();

        String choice1, choice2, choice3, cityName, streetName, buildingLetter, firstName, secondName;
        int zipCode, buildingNumber, apartmentNumber, age, tableNumber;
        Address address;


        System.out.println("Выберите тип заказа [интернет / вживую]: ");
        choice1 = scanner.next();
        if (choice1.equals("интернет")) {
            System.out.println("Введите адрес [название города, название улицы]: ");
            cityName = scanner.next();
            streetName = scanner.next();
            address = new Address(cityName, 10000, streetName, 1, "А", 1);

            System.out.println("Введите личные данные [Имя, Фамилия, Возраст]: ");
            firstName = scanner.next();
            secondName = scanner.next();
            age = scanner.nextInt();

            Customer customer = new Customer(firstName, secondName, age, address);
            InternetOrder internetOrder = new InternetOrder(null, customer);

            while (true) {
                System.out.println("Выберите позицию [блюдо / напиток / выход]: ");
                choice2 = scanner.next();
                if (choice2.equals("блюдо")) {
                    internetOrder.Add(new Dish(1, "пользовательское блюдо", ""));
                } else if (choice2.equals("напиток")) {
                    internetOrder.Add(new Drink(1, "пользовательский напиток", "", DrinkTypeEnum.SODA));
                } else break;
            }

            try {
                internetOrderManager.AddOrder(address, internetOrder);
            } catch (Exception ex) {
                System.out.println("Exception");
            }
        }
        else {
            System.out.println("Введите номер столика: ");
            tableNumber = scanner.nextInt();
            address = new Address(tableNumber);

            System.out.println("Введите личные данные [Имя, Фамилия, Возраст]: ");
            firstName = scanner.next();
            secondName = scanner.next();
            age = scanner.nextInt();

            Customer customer = new Customer(firstName,secondName,age,address);
            TableOrder tableOrder = new TableOrder(null, customer);

            while (true) {
                System.out.println("Выберите позицию [блюдо / напиток / выход]: ");
                choice2 = scanner.next();
                if(choice2.equals("блюдо")) {
                    tableOrder.Add(new Dish(1, "пользовательское блюдо", ""));
                }
                else if(choice2.equals("напиток")) {
                    tableOrder.Add(new Drink(1,"пользовательский напиток", "", DrinkTypeEnum.SODA));
                }
                else break;
            }

            try {
                tableOrderManager.AddOrder(address, tableOrder);
            } catch (Exception ex) {
                System.out.println("Exception");
            }
        }

        //////////////////////////////////

        System.out.println("МАССИВ ИНТЕРНЕТ ЗАКАЗОВ: ");
        for(int i=0;i<internetOrderManager.GetOrdersArray().length;i++) {
            System.out.println(internetOrderManager.GetOrdersArray()[i].GetCustomer().toString());
            for(int j=0;j<internetOrderManager.GetOrdersArray()[i].GetOrderArray().length;j++) {
                System.out.println(internetOrderManager.GetOrdersArray()[i].GetOrderArray()[j].toString());
            }
        }
        System.out.println("МАССИВ ЖИВЫХ ЗАКАЗОВ: ");
        for(int i=0;i<tableOrderManager.GetOrdersArray().length;i++) {
            System.out.println(tableOrderManager.GetOrdersArray()[i].GetCustomer().toString());
            for(int j=0;j<tableOrderManager.GetOrdersArray()[i].GetOrderArray().length;j++) {
                System.out.println(tableOrderManager.GetOrdersArray()[i].GetOrderArray()[j].toString());
            }
        }
        System.out.println("Количество живых заказов с названием \"блюдо 1\": " + tableOrderManager.GetNumberOfPosition("блюдо 1"));
        System.out.println("Количество интернет заказов с названием \"блюдо 1\": " + internetOrderManager.GetNumberOfPosition("блюдо 1"));

        System.out.print("Суммарная стоимость живых заказов: ");
        System.out.printf("%.2f", tableOrderManager.GetOrdersCost());
        System.out.print("\nСуммарная стоимость интернет заказов: ");
        System.out.printf("%.2f", internetOrderManager.GetOrdersCost());


        //Сериализация

        try{
            FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\first.out");
            FileOutputStream fos2 = new FileOutputStream("C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\second.out");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);//сохранение объекта во внешний файл
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
            oos1.writeObject(tableOrderManager);
            oos1.flush();//принудительная запись
            oos1.close();//освобождаем
            oos2.writeObject(internetOrderManager);
            oos2.flush();
            oos2.close();
        } catch (Exception ex) {
            System.out.println("IOException");
        }

        //Десериализация
        try {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\first.out");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\second.out");
            ObjectInputStream oin1 = new ObjectInputStream(fis1);
            ObjectInputStream oin2 = new ObjectInputStream(fis2);

            TableOrderManager TOM_deserialized = (TableOrderManager) oin1.readObject();
            InternetOrderManager IOM_deserialized = (InternetOrderManager) oin2.readObject();

            System.out.println("\n\n\n\t\t\t\tДЕСЕРИАЛИЗИРОВАННЫЕ СПИСКИ ЗАКАЗОВ");

            System.out.println("МАССИВ ИНТЕРНЕТ ЗАКАЗОВ: ");
            for(int i=0;i<IOM_deserialized.GetOrdersArray().length;i++) {
                System.out.println(IOM_deserialized.GetOrdersArray()[i].GetCustomer().toString());
                for(int j=0;j<IOM_deserialized.GetOrdersArray()[i].GetOrderArray().length;j++) {
                    System.out.println(IOM_deserialized.GetOrdersArray()[i].GetOrderArray()[j].toString());
                }
            }
            System.out.println("МАССИВ ЖИВЫХ ЗАКАЗОВ: ");
            for(int i=0;i<TOM_deserialized.GetOrdersArray().length;i++) {
                System.out.println(TOM_deserialized.GetOrdersArray()[i].GetCustomer().toString());
                for(int j=0;j<TOM_deserialized.GetOrdersArray()[i].GetOrderArray().length;j++) {
                    System.out.println(TOM_deserialized.GetOrdersArray()[i].GetOrderArray()[j].toString());
                }
            }

        } catch (Exception ex) {
            System.out.println("IOException");
        }


    }
}