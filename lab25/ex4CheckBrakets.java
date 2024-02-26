package lab25;

import java.util.regex.Pattern;

public class ex4CheckBrakets {
    public static void main(String[] args) {
        String[] Brak = {"(3*+*5)*–*9*×*4", "((3*+*5)*–*9*×*4"};

        String regex = "^(?:[^()]*\\([^()]*\\))*[^()]*$";
        Pattern pattern = Pattern.compile(regex);

        for(String str:Brak) {
            System.out.println(str+" "+pattern.matcher(str).matches());
        }
    }
}
