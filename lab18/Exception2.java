package lab18;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }catch(NumberFormatException  e){
            System.out.println("It's not an integer number");
        }catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }finally{
            System.out.println("The division was successfully done!");
        }
    }

    public static void main(String[] args) {
        Exception2 ob= new Exception2();
        ob.exceptionDemo();
    }
}
