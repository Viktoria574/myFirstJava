package ru.mirea.lab1;
import java.util.Scanner;

public class Ex6
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Первые 10 чисел гармонического ряда 1/n:");
        float num;
        for(float i=1; i<11; i++){
            num=1/i;
            System.out.printf("%.2f ", num);
        }
    }
}