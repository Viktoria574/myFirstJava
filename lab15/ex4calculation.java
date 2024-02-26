package lab15;
import javax.swing.*;
import java.awt.*;
public class ex4calculation {
    private JFrame frame;
    private JTextField display;

    public ex4calculation() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setPreferredSize(new Dimension(200, 30));
        display.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        JButton[] buttons = new JButton[17];
        //объявляем все кнопки
        char buttonInfo[] = {'7','8','9','/','4','5','6','*','1','2','3','-','0','.','=','+','C'};
        for (int i = 0; i < 17; i++) {
            buttons[i] = new JButton(String.valueOf(buttonInfo[i]));
            buttonPanel.add(buttons[i]);
            if (String.valueOf(buttonInfo[i]).equals("=")) {
                buttons[i].addActionListener(e -> {
                    display.setText(calculate(display.getText() + e.getActionCommand()));
                });
            } else if (String.valueOf(buttonInfo[i]).equals("C")) {
                buttons[i].addActionListener(e -> {
                    display.setText("");
                });
            }
            else {
                buttons[i].addActionListener(e -> {
                    display.setText(display.getText() + e.getActionCommand());
                });
            }
        }

        frame.getContentPane().add(display, BorderLayout.NORTH);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static String calculate(String text) {
        if (text.equals("=")) return "0";
        double result = 0;
        double value = 0;
        StringBuilder element = new StringBuilder();
        String lastAction = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)) || text.charAt(i) == '.') {
                element.append(text.charAt(i));

            } else if ("+-/*=".matches("(\\S*)" + text.charAt(i) + "(\\S*)")) {
                if (lastAction.isEmpty()) {
                    try {
                        result = Double.parseDouble(element.toString());
                    } catch (Exception e) {
                        return "Ошибка";
                    }

                } else {
                    try {
                        value = Double.parseDouble(element.toString());
                    } catch (Exception e) {
                        return "Ошибка";
                    }
                    switch (lastAction) {
                        case "+" -> result += value;
                        case "-" -> result -= value;
                        case "*" -> result *= value;
                        case "/" -> {
                            if (value == 0) return "Ошибка";
                            result /= value;
                        }
                    }
                }
                element = new StringBuilder();
                lastAction = Character.toString(text.charAt(i));

            }

        }
        return Double.toString(result);

    }

    public static void main(String[] args) {
        new ex4calculation();
    }
}
