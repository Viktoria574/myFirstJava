package lab22;

public class tester {
    public static void main(String[] args) {
        Calculator rpnCalculator = new Calculator();
        CalculatorView rpnCalculatorView = new CalculatorView();
        CalculatorController rpnCalculatorController = new CalculatorController(rpnCalculator, rpnCalculatorView);

        rpnCalculatorController.updateView();
    }
}
