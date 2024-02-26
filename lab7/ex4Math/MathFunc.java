package lab7.ex4Math;

public class MathFunc implements MathCalculable{
    @Override
    public double FunPow(double number, double n){
        return Math.pow(number, n);
    }
    @Override
    public double FunModul(double number){
        return Math.abs(number);
    }
    public double Line(double radius){
        return 2*radius*PI;
    }
}
