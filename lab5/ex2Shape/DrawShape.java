package lab5.ex2Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
public class DrawShape extends JPanel{
    private static final int NUM_SHAPES = 20;
    private Shape[] shapes;
    public DrawShape() {
        Random rand = new Random();
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = 1 + rand.nextInt(500);
            int y = 1 + rand.nextInt(500);
            int size = 50 + rand.nextInt(51); // Random size between 50 and 100
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (rand.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, size);
            } else {
                shapes[i] = new Rectangle(color, x, y, size, size);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }
}
