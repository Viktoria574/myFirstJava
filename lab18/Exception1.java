package lab18;

public class Exception1 {
    public void exceptionDemo() {
        try{//определяет блок кода, где может произойти исключение
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {//обрабатывает исключение
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        Exception1 ob= new Exception1();
        ob.exceptionDemo();
    }
}
