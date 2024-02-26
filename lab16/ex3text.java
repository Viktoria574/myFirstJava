package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ex3text extends JFrame{
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public ex3text() {
        JFrame frame = new JFrame("Области окна");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setTitle("JTextArea Example");
        JMenuBar menuBar = new JMenuBar();


        // Создание меню выбора цвета
        colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");
        //Добавляем функционал меню
        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        redItem.addActionListener(new ColorActionListener(Color.RED));
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));
        //Добавляем кнопки в меню
        menuBar.add(colorMenu);
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Создание меню выбора шрифта
        fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontActionListener("Courier New"));

        menuBar.add(fontMenu);
        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);


        // Создание компонента JTextArea
        textArea = new JTextArea();
        textArea.setFont(new Font("Courier New", Font.PLAIN, 30));
        textArea.setPreferredSize(new Dimension(400, 80));
        textArea.setEditable(true);

        // Добавление компонентов на форму
        setJMenuBar(menuBar);
        add(textArea);

        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.PLAIN, 30);
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        new ex3text();
    }

}
