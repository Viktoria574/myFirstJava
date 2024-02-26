package lab18;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in);
        while (true) {
            String key = myScanner.next();
            try {
                printDetails( key );
            }
            catch (Exception ex) {
                System.out.println("Exception. Repeat input.\n");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo3 throwsDemo = new ThrowsDemo3();
        try {
            throwsDemo.getKey();
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
