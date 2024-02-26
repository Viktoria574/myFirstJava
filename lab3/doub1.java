package lab3;
import java.util.Scanner;

public class doub1 {
    public static void main(String[] args) {
        //1
        System.out.println(Double.valueOf("10.5"));

        //2
        System.out.println(Double.parseDouble("10.5"));

        //3
        Double doubleV = 10.5;
        int intV = doubleV.intValue();
        byte byteV = doubleV.byteValue();
        short shortV = doubleV.shortValue();
        long longV = doubleV.longValue();
        float floatV = doubleV.floatValue();
        boolean booleanV = !doubleV.equals(0);

        //4
        System.out.println("doubleV: " + doubleV + "\nintV: " +intV +"\nshortV: " +shortV +"\nlongV: " +longV +"\nfloatV: " +floatV +"\nbooleanV: "+ booleanV);

        //5
        String d = Double.toString(3.14);
    }
}
