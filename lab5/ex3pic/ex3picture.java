package lab5.ex3pic;
import javax.swing.*;
import java.awt.*;
public class ex3picture {
    public static void main(String[] args) {
        String imagePath = "C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\lab5\\ex3pic\\Cats.jpg";

        JFrame frame = new JFrame();
        frame.setSize(900, 596);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel imageLabel = new JLabel(); // Создание компонента для отображения картинки
        imageLabel.setIcon(new ImageIcon(imagePath));

        frame.add(imageLabel);
        frame.setVisible(true);
    }
}
