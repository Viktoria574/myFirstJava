package lab22;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;
public class CalculatorController {
    private Calculator model;
    private CalculatorView view;

    public CalculatorController(Calculator model, CalculatorView view) {
        this.model=model;
        this.view=view;

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField();
        display.setPreferredSize(new Dimension(200, 70));
        display.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        JButton[] buttons = new JButton[18];
        Object buttonInfo[] = {'7','8','9','/','4','5','6','*','1','2','3','-','0','.','=','+','C', "Space"};
        for (int i = 0; i < 18; i++) {
            buttons[i] = new JButton(String.valueOf(buttonInfo[i]));
            buttonPanel.add(buttons[i]);
            if (String.valueOf(buttonInfo[i]).equals("=")) {
                buttons[i].addActionListener(e -> {
                    display.setText(model.calculate(display.getText()));
                });
            } else if (String.valueOf(buttonInfo[i]).equals("C")) {
                buttons[i].addActionListener(e -> {
                    display.setText("");
                });
            }
            else if(String.valueOf(buttonInfo[i]).equals("Space")) {
                buttons[i].addActionListener(e -> {
                    display.setText(display.getText() + " ");
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

        model.setFrame(frame);
    }

    public void updateView() {
        view.printResult(model.getFrame());
    }
}
