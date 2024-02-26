package lab14;
import java.util.regex.Pattern;
public class ex2Check {
    public static void main(String[] args) {
        String inputString1 = "abcdefghijklmnopqrstuv18340";
        String inputString2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Строка 1: " + pattern.matcher(inputString1).matches());
        System.out.println("Строка 2: " + pattern.matcher(inputString2).matches());
    }
}
