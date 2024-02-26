package lab11;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
public class ex4writeDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, месяц и год:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println("Введите часы и минуты:");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        Date date = new Date(year - 1900, month - 1, day, hour, minute);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);

        System.out.println("Созданный объект Date: " + date.toString());
        System.out.println("Созданный объект Calendar: " + calendar.getTime());
    }
}
