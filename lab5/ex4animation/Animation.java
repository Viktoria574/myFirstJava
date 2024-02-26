package lab5.ex4animation;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Animation extends JFrame {
    private JLabel animationLabel;

    public Animation() {
        JFrame frame = new JFrame();
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationLabel = new JLabel();
        frame.add(animationLabel);

        ImageIcon[] animationFrames = new ImageIcon[5];    // Загрузка кадров анимации
        for (int i = 0; i < animationFrames.length; i++) {
            animationFrames[i] = new ImageIcon("C:\\Users\\Vika\\code\\JavaSecond\\FirstProg\\src\\lab5\\ex4animation\\"+(i+1)+".jpg");
        }
        frame.setVisible(true);

        startAnimation(animationFrames);
    }

    private void startAnimation(ImageIcon[] frames) {
        int frameIndex = 0;
        while (true) {
            animationLabel.setIcon(frames[frameIndex]); // Устанавка текущего кадра

            revalidate(); // Обновить окно
            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            frameIndex++;
            if (frameIndex >= frames.length) {
                frameIndex = 0;
            }
        }
    }
}
