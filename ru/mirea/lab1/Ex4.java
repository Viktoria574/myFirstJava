package ru.mirea.lab1;
import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество цифр в массиве:");
        int num=in.nextInt();
        int[] mas=new int[num];
        System.out.printf("Введите  %d цифр:", num);
        int Sum=0;
        int help=num;
        int max=0, min=1000;
        while(help>0){
            mas[num-help]=in.nextInt();
            Sum+=mas[num-help];
            help-=1;
        }
        for(int j=0; j<num; j++){
            if (max<mas[j]){
                max=mas[j];
            }
            if(min>mas[j]){
                min=mas[j];
            }
        }
        System.out.printf("Сумма: %d Максимальное: %d Минимальное: %d", Sum, max, min);
    }
}
