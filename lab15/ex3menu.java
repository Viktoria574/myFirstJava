package lab15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex3menu extends JFrame {
    JMenuBar menuBar = new JMenuBar();//создание строки меню
    ex3menu(){
        JFrame frame = new JFrame("My First Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,70);
        frame.setJMenuBar(menuBar);
        JTextField line;

        //Создание пунктов меню
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        //Добавление пунктов меню на экран
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        //Созданиепунктов подменю
        JMenu saveMenu = new JMenu("Save");
        JMenu closeMenu = new JMenu("Close");
        JMenu copyMenu = new JMenu("Copy");
        JMenu cutMenu = new JMenu("Cut");
        JMenu insertMenu = new JMenu("Insert");


        //Добавление пунктов подменю на экран
        fileMenu.add(saveMenu);
        fileMenu.add(closeMenu);
        editMenu.add(copyMenu);
        editMenu.add(cutMenu);
        editMenu.add(insertMenu);

        //Добавление кнопок
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(300,70));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);

        //Добавление текстового поля
        line = new JTextField("This is the area you can write text", 20);
        //line.setToolTipText("Длиное поле");
        // Настройка шрифта
        line.setFont(new Font("Dialog", Font.PLAIN, 14));
        line.setHorizontalAlignment(JTextField.CENTER);
        panel.add(line);
        frame.pack();

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ex3menu();
    }
}
