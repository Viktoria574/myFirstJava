package lab25;

import java.util.regex.Pattern;

public class ex3CheckIp {
    public static void main(String[] args) {
        String[] massiveIp = {"127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"};

        String regex = "([0-9]{1,3}[.]){3}[0-9]{1,3}";
        Pattern pattern = Pattern.compile(regex);

        for(String str:massiveIp) {
            System.out.println(str+" "+pattern.matcher(str).matches());
        }
    }
}
