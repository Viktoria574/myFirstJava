package lab5.ex1football;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadrid extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    private int milanScore;
    private int madridScore;

    public MilanMadrid() {
        setSize(300, 200);
        setTitle("Football Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// устанавливаем реакцию окна на закрытие по умолчанию

        milanScore = 0;
        madridScore = 0;

        JPanel panel = new JPanel(new GridLayout(3, 2));
        //добавляем кнопки и их функционал
        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent milan) {
                milanScore++;
                updateLabels("milan");
            }
        });
        panel.add(milanButton);

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent madrid) {
                madridScore++;
                updateLabels("madrid");
            }
        });
        panel.add(madridButton);

        resultLabel = new JLabel("Result: 0 X 0");
        panel.add(resultLabel);

        lastScorerLabel = new JLabel("Last Scorer: N/A");
        panel.add(lastScorerLabel);

        winnerLabel = new JLabel("Winner: DRAW");
        panel.add(winnerLabel);

        add(panel);

        setVisible(true);
    }

    private void updateLabels(String actionEvent) {//добавление надписей на экран
        if(actionEvent.equals("madrid"))
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        else
            lastScorerLabel.setText("Last Scorer: AC Milan");
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }


}
