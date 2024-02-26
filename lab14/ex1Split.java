package lab14;

import java.util.Scanner;
import java.util.regex.Pattern;
public class ex1Split {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = in.nextLine();
        String regex = "\\s+"; //один или несколько пробелов

        Pattern pattern = Pattern.compile(regex);
        String[] elements = pattern.split(inputString);

        System.out.println("Разделенные элементы:");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
