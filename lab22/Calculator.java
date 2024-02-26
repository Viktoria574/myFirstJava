package lab22;
import javax.swing.*;
import java.util.Stack;
public class Calculator {
    private JFrame frame;
    private JTextField display;
    private double result;

    public double getResult() {
        return result;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JFrame getFrame() {
        return frame;
    }

    public String calculate(String text) {
        if (text.contains("Ошибка")) return "0";
        if (text.equals("=")) return "0";
        Stack<Double> stack = new Stack<Double>();
        for(String el: text.split(" ")) {
            try{
                if(Character.isDigit((el.charAt(0)))) {
                    stack.push(Double.parseDouble(el));
                }
                else if("+-/*".matches("(\\S*)" + el + "(\\S*)")) {
                    double upValue = stack.pop();
                    double downValue = stack.peek();
                    try{
                        stack.pop();
                    }
                    catch (Exception exception) {
                        return "Ошибка. Стэк пуст.";
                    }
                    switch (el) {
                        case "+":
                            stack.push(downValue+upValue);
                            break;
                        case "-":
                            stack.push(downValue-upValue);
                            break;
                        case "*":
                            stack.push(downValue*upValue);
                            break;
                        case "/":
                        {
                            if(upValue==0) {
                                return "Ошибка. Деление на ноль.";
                            }
                            stack.push(downValue/upValue);
                            break;
                        }
                    }
                }
            }
            catch (Exception exception) {
                return "Ошибка. Некорректный ввод.";
            }
        }
        this.result=stack.peek();
        return Double.toString(stack.pop());
    }
}
