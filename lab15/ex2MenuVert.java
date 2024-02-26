package lab15;
import java.awt.event.*;
import javax.swing.*;
public class ex2MenuVert extends JFrame implements ActionListener{
    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    public ex2MenuVert() {
        JFrame frame = new JFrame("JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,200);

        String[] countries = {"Australia", "China", "England", "Russia"};

        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addActionListener(this);

        infoLabel = new JLabel();

        JPanel panel = new JPanel();
        panel.add(countryComboBox);
        panel.add(infoLabel);

        frame.getContentPane().add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {//обработка полей
        JComboBox cb = (JComboBox)e.getSource();
        String selectedCountry = (String)cb.getSelectedItem();

        String info = "";
        //дополняем информацию
        if (selectedCountry.equals("Australia")) {
            info = "Австралия является одной из самых развитых стран мира";
        } else if (selectedCountry.equals("China")) {
            info = "Китайская экономика является второй экономикой мира по номинальному ВВП";
        } else if (selectedCountry.equals("England")) {
            info = "Англия была первой промышленно развитой страной";
        } else if (selectedCountry.equals("Russia")) {
            info = "Россия — многонациональное государство с широким этнокультурным многообразием";
        }

        infoLabel.setText(info);
    }

    public static void main(String[] args) {
        new ex2MenuVert();
    }
}
