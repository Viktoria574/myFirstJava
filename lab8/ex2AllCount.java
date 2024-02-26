package lab8;

import java.util.Scanner;

public class ex2AllCount {
    public static void trio(int k){
        if (k == 0) {return ;}
        trio(k-1);
        System.out.print(k+" ");
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //ex1trio ob=new ex1trio();
        System.out.println("Введите количество цифp:");
        int num=in.nextInt();
        ex2AllCount.trio(num);
    }
}
