import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Address");
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel streetLabel = new JLabel("Street:");
        streetLabel.setBounds(30, 50, 70, 25);
        frame.add(streetLabel);

        JTextField streetField = new JTextField();
        streetField.setBounds(100, 50, 150, 25);
        frame.add(streetField);

        JLabel numberLabel = new JLabel("Number:");
        numberLabel.setBounds(30,150,40,40);
        frame.add(numberLabel);

        JTextField numberField = new JTextField();
        numberField.setBounds(100, 150, 150, 25);
        frame.add(numberField);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(30,200,40,40);
        frame.add(cityLabel);

        JTextField cityField = new JTextField();
        cityField.setBounds(100, 200, 150, 25);
        frame.add(cityField);

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(30,250,40,40);
        frame.add(countryLabel);

        JTextField countryField = new JTextField();
        countryField.setBounds(100, 250, 150, 25);
        frame.add(countryField);




        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(100, 300, 80, 30);
        frame.add(saveBtn);

        // Always call visible after adding everything
        frame.setVisible(true);
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Address adresa =new Address(
                        streetField.getText(),
                        numberField.getText(),
                        cityField.getText(),
                        countryField.getText()

                );
                try {
                    FileWriter writer = new FileWriter("adress.txt",true);
                    writer.write(adresa.toString());
                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });


    }
}
