package lab2;
import java.util.Scanner;
public class Words10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=in.nextLine();
        int counter=0;
        for(char s: line.toCharArray()){
            if (s==' '){
                counter++;
            }
        }
        System.out.printf("Количество слов : %d", counter+1);
    }
}
