package lab24;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument factory) {
        this.documentFactory = factory;
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createNew();
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createOpen();
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (document != null) {
                    document.save();
                }
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        JFrame frame = new JFrame("Editor");
        frame.setJMenuBar(menuBar);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();
        Editor editor = new Editor(factory);
        editor.createMenu();
    }
}
