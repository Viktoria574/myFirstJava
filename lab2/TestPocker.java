package lab2;
import java.util.Scanner;
public class TestPocker {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество игроков:");
        int n=in.nextInt();
        Pocker9 object= new Pocker9(n);
    }
}
