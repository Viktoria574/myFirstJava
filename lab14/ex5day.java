package lab14;

import java.util.regex.*;
public class ex5day {
    public static void main(String[] args) {
        String inputString1 = "29/02/2000";
        String inputString2 = "30/04/2003";
        String inputString3 = "01/01/2003";
        String inputString4 = "29/02/2001";
        String inputString5 = "30-04-2003";
        String inputString6 = "1/1/1899";

        String regex = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|1[0-2])/(|[1-9][0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Строка 1: " + pattern.matcher(inputString1).matches());
        System.out.println("Строка 2: " + pattern.matcher(inputString2).matches());
        System.out.println("Строка 3: " + pattern.matcher(inputString3).matches());
        System.out.println("Строка 4: " + pattern.matcher(inputString4).matches());
        System.out.println("Строка 5: " + pattern.matcher(inputString5).matches());
        System.out.println("Строка 6: " + pattern.matcher(inputString6).matches());
    }
}
