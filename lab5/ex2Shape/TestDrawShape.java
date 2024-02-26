package lab5.ex2Shape;

import javax.swing.*;
public class TestDrawShape {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        DrawShape panel = new DrawShape();
        frame.add(panel);

        frame.setVisible(true);
    }
}
