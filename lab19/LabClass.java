package lab19;
import java.util.Scanner;
public class LabClass {
    public  int startInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-сортировка и вывод");
        System.out.println("2-вывод");
        System.out.println("3-поиск по имени");
        System.out.println("4-выход");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3 && choice!=4) {
            System.out.println("Неверный ввод");
            choice = scanner.nextInt();
        }
        return choice;
    }
    public void output(String elements) {
        System.out.println(elements);
    }
}
