package lab16;
import javax.swing.*;
import java.awt.*;
import java.math.*;
import java.util.Random;

import static java.lang.Math.random;
public class ex1Game extends JFrame{
    private JTextField display;
    private int attempts = 3;

    public ex1Game() {
        Random random = new Random();
        int randomValue = random.nextInt(0,21);

        JFrame frame = new JFrame("Угадайка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        display = new JTextField();
        display.setPreferredSize(new Dimension(500, 80));
        display.setText("Количество оставшихся попыток: " + attempts);
        display.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 7));
        for (int i = 0; i < 21; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttonPanel.add(button);
            button.addActionListener(e -> {
                if (attempts > 0) {
                    attempts--;
                    display.setText("Количество оставшихся попыток: " + attempts);
                    if (Integer.parseInt(e.getActionCommand()) == randomValue) {
                        display.setText(display.getText() + "Вы угадали!");
                        attempts=-1;
                    }
                    else if (Integer.parseInt(e.getActionCommand()) > randomValue) {
                        display.setText(display.getText() + "Загаданное число меньше Вашего числа.");
                    } else if (Integer.parseInt(e.getActionCommand()) < randomValue) {
                        display.setText(display.getText() + "Загаданное число больше Вашего числа.");
                    }
                }
                if(attempts == 0) {
                    display.setText(display.getText() + "Вы проиграли:(");
                    attempts--;
                }
            });
        }

        frame.add(display, BorderLayout.WEST);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ex1Game();
    }
}
