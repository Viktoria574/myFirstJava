package lab3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
public class ex1 {

    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        double[] numbers;
        System.out.println("Введите количество вещественных чисел:");
        int length=in.nextInt();
        numbers= new double[length];
        for (int i=0; i<length; i++){
            numbers[i]=Math.random();
            System.out.printf("%.2f ", numbers[i]);
        }
        int counter=1;
        double help=0;
        while(counter!=0){
            counter=0;
            for(int j=0; j<length-1; j++){
                if(numbers[j]>numbers[j+1]){
                    help=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=help;
                    counter++;
                }
            }
        }
        System.out.println("\nОтсортированный массив:");
        for (int i=0; i<length; i++){
            System.out.printf("%.2f ", numbers[i]);
        }
    }
}
