package lab14;

import java.util.regex.*;
public class ex4Example {
    public static void main(String[] args) {
        String inputText1 = "(1 + 8) - 9 / 4";
        String inputText2 = "6 / 5 - 2 * 9";

        String regex = "\\d\\s*\\+";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Строка 1: " + pattern.matcher(inputText1).find());
        System.out.println("Строка 2: " + pattern.matcher(inputText2).find());
    }
}
