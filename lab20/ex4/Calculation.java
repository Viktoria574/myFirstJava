package lab20.ex4;

public class Calculation {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    public static <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
    public static <T extends Number> double subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
    public static void main(String[] args){
        System.out.println("Sum:" + Calculation.sum(5, 7));
        System.out.println("Subtraction:" + Calculation.subtraction(8.6, 2.1));
        System.out.println("Multiply:" + Calculation.multiply(3.5, 2));
        System.out.println("Divide:" + Calculation.divide(10, 2.0));
    }
}
