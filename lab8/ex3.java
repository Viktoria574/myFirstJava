package lab8;

import java.util.Scanner;

public class ex3 {
    public static void pri(int a, int b, int fix){
        if (a == b+fix) {return ;}
        System.out.print(a+" ");
        pri(a+fix, b, fix);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first=in.nextInt();
        System.out.println("Введите второе число:");
        int second=in.nextInt();
        int fix=0;
        if (first<second){fix=1;}
        else{fix=-1;}
        ex3.pri(first, second, fix);
    }
}
