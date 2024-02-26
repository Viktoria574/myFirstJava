package lab2;
import java.lang.*;
import java.util.Scanner;

public class HomeForDogs {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество собак в приюте:");
        int num=in.nextInt();
        Dog[] dogs= new Dog[num];
        for (int i=0; i<num; i++){
            System.out.println("Введите кличку собаки:");
            String name=in.next();
            System.out.println("Сколько лет собаки:");
            int years=in.nextInt();
            dogs[i]= new Dog(name, years);
        }
        System.out.print(dogs[0].getName());
    }
}
