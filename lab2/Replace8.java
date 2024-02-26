package lab2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Replace8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество элеметов в массиве:");
        int num=in.nextInt();
        String[] mas=new String[num];
        System.out.println("Введите "+num+" элементов:");
        for (int i=0; i<num; i++){
            mas[i]=in.next();
        }
        System.out.println(Arrays.toString(mas));
        for (int i=0; i<num/2;i++){
            Collections.swap(Arrays.asList(mas), i, num-1-i);
        }
        System.out.println(Arrays.toString(mas));
    }
}
