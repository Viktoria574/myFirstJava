package lab16;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
public class ex11place {
    TextArea textArea = new TextArea();
    public ex11place() {
        JFrame frame = new JFrame("Области окна");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        HashMap<String, String> map = new HashMap<String,String>();
        //Проименуем территорию нашего поля
        map.put(BorderLayout.NORTH, "САО");
        map.put(BorderLayout.SOUTH, "ЮАО");
        map.put(BorderLayout.WEST, "ЗАО");
        map.put(BorderLayout.EAST, "ВАО");
        map.put(BorderLayout.CENTER, "ЦАО");

        for (String element: map.keySet()) {
            JPanel panel = new JPanel();
            panel.setBorder(new LineBorder(Color.GRAY));
            panel.addMouseListener(new MouseAdapter() {//обрабатываем перемещение мыши, определяем где она находится
                @Override
                public void mouseEntered(MouseEvent e) {
                    textArea.setText("         Вы пришли в " + map.get(element));
                }
            });
            if (element == BorderLayout.CENTER) {
                panel.add(textArea, BorderLayout.CENTER);
            }
            frame.add(panel, element);
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ex11place();
    }
}
