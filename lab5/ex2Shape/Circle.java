package lab5.ex2Shape;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Circle extends Shape {
    private int diameter;

    public Circle(Color color, int x, int y, int diameter) {
        super(color, x, y);
        this.diameter = diameter;
    }

    void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fill(new Ellipse2D.Double(x, y, diameter, diameter));
    }
}
