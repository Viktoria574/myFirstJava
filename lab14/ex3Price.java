package lab14;

import java.util.regex.*;

public class ex3Price {
    public static void main(String[] args) {
        String inputText = "5.98 USD, 44 ERR, 0.004 EU, 100 RUB.";

        String regex = "\\d+(\\.\\d{2})?\\s*(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            String price = matcher.group();
            System.out.println(price);
        }
    }
}
