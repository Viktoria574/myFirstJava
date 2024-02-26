//Задание 3
package ru.mirea.lab1;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество цифр в массиве:");
        int num=in.nextInt();
        int[] mas=new int[num];
        System.out.printf("Введите  %d цифр:", num);
        int Sum=0;
        for(int i=0; i<num; i++){
            mas[i]=in.nextInt();
            Sum+=mas[i];
        }
        System.out.printf("Сумма: %d Среднее: %d", Sum, Sum/num);
    }
}
