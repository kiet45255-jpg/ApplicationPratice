
package Giaiptbac2;

import javax.swing.*;
import java.awt.event.*;

public class RectangleFrame extends JFrame {
    public RectangleFrame() {
        setTitle("Diện tích HCN");
        setSize(300, 200);
        setLayout(null);

        JLabel lblD = new JLabel("Dài:");
        JLabel lblR = new JLabel("Rộng:");
        JTextField txtD = new JTextField();
        JTextField txtR = new JTextField();
        JButton btnCalc = new JButton("Tính");
        JLabel result = new JLabel();

        lblD.setBounds(20, 20, 50, 25);
        txtD.setBounds(80, 20, 150, 25);
        lblR.setBounds(20, 60, 50, 25);
        txtR.setBounds(80, 60, 150, 25);
        btnCalc.setBounds(80, 100, 80, 25);
        result.setBounds(20, 130, 250, 25);

        add(lblD); add(txtD);
        add(lblR); add(txtR);
        add(btnCalc); add(result);

        btnCalc.addActionListener(e -> {
            double d = Double.parseDouble(txtD.getText());
            double r = Double.parseDouble(txtR.getText());
            result.setText("Diện tích: " + (d * r));
        });

        setVisible(true);
    }
}