package lab2;
import java.lang.*;
import java.util.Scanner;
public class Tester {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество компьютеров в магазине:");
        int num=in.nextInt();
        Shop object= new Shop(num);//создание объекта
        //object.AddCom();//добавление компьютера
        //object.DelCom();//удаление компьютера
        object.FindCom();
    }
}
