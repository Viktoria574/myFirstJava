package lab8;

import java.util.Scanner;

public class ex1trio {
    public static void trio(int k){
        if (k == 0) {return ;}
        trio(k-1);
        for(int i=0; i<k;i++){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите ервое число:");
        int num=in.nextInt();
        ex1trio.trio(num);
    }
}
