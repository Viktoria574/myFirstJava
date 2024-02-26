package lab6.ex11temp;
import java.util.Scanner;
public class Tempreture implements Convertable{
    @Override
    public void convert(float temperature){
        double kelvin = temperature + 273.15;
        double fahrenheit = (temperature * 9 / 5) + 32;

        System.out.println("Температура в Кельвинах: " + kelvin);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Tempreture ob=new Tempreture();
        System.out.println("Введите температуру по Цельсию:");
        int C = in.nextInt();
        ob.convert(C);
    }
}
