package lab3;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество вещественных чисел:");
        int n=in.nextInt();
        int[] numbers=new int[n];
        Random rand = new Random();
        for(int i=0; i<n; i++){
            numbers[i] = rand.nextInt(n);
            System.out.print(numbers[i]+" ");
        }
        System.out.print("\n");
        ArrayList<Integer> chet = new ArrayList<Integer>();
        for (int j=0; j<n; j++){
            if (numbers[j]%2==0 && numbers[j]!=0){
                chet.add(numbers[j]);
                System.out.print(chet.get(chet.size()-1)+" ");
            }
        }
    }
}
