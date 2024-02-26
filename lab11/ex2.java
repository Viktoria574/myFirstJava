package lab11;

import java.util.Date;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt() - 1900;
        System.out.println("Введите месяц:");
        int month = sc.nextInt()-1;
        System.out.println("Введите день:");
        int day = sc.nextInt();
        Date userDate = new Date(year,month,day);
        Date currDate = new Date();
        System.out.println((currDate.getTime()>userDate.getTime())?
                "Текущее время больше":"Пользовательское время больше");
    }
}
