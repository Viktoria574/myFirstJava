package lab18;
import java.util.Scanner;

public class ThrowsDemo2 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            return "The string is empty";
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo2 ob= new ThrowsDemo2();
        ob.printMessage("vika");
    }
}
