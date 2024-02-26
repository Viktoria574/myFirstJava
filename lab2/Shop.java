package lab2;
import java.lang.*;
import java.util.Scanner;
import java.util.*;
import java.util.Vector;
public class Shop {
    Scanner in=new Scanner(System.in);
    ArrayList<Comp> Computers=new ArrayList();
    public Shop(int num){
        System.out.printf("Введите %d компьютеров и их цену:", num);
        //Computers= new Comp[num];
        for(int i=0; i<num; i++) {
            int coast = in.nextInt();
            String name = in.next();
            this.Computers.add(new Comp(name, coast));
        }
    }
    public void AddCom(){
        System.out.println("Введите имя компьютера, которого Вы хотите добавить в магазин:");
        int coast = in.nextInt();
        String name = in.next();
        this.Computers.add(new  Comp(name, coast));
    }
    public void DelCom(){
        System.out.println("Введите имя компьютера, которого Вы хотите удалить в магазине:");
        String name = in.next();
        for (int i=0;i<Computers.size(); i++) {
            if ((Computers.get(i).GetName()).equals(name)){
                Computers.remove(i);
                i--;
            };
        }
    }
    public void FindCom(){
        System.out.println("Введите имя компьютера, которого Вы хотите найти в магазине:");
        String name = in.next();
        for (int i=0;i<Computers.size(); i++) {
            if ((Computers.get(i).GetName()).equals(name)){
                System.out.print("Kомпьютер найден!");
                i=Computers.size();
            }
            if (i==Computers.size()-1){
                System.out.print("Kомпьютер не найден(");
            }
        }
    }
}
