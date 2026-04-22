
package Giaiptbac2;

import javax.swing.*;
import java.awt.event.*;

public class TaxiFrame extends JFrame {
    public TaxiFrame() {
        setTitle("Tính tiền taxi");
        setSize(300, 200);
        setLayout(null);

        JLabel lbl = new JLabel("Số km:");
        JTextField txtKm = new JTextField();
        JButton btnCalc = new JButton("Tính tiền");
        JLabel result = new JLabel();

        lbl.setBounds(20, 20, 80, 25);
        txtKm.setBounds(100, 20, 150, 25);
        btnCalc.setBounds(100, 60, 100, 25);
        result.setBounds(20, 100, 250, 25);

        add(lbl);
        add(txtKm);
        add(btnCalc);
        add(result);

        btnCalc.addActionListener(e -> {
            try {
                double km = Double.parseDouble(txtKm.getText());

                if (km < 0) {
                    result.setText("Dữ liệu sai (km < 0)");
                } else {
                    double money = km * 10000;
                    result.setText("Tiền: " + money + " VND");
                }

            } catch (Exception ex) {
                result.setText("Nhập số hợp lệ");
            }
        });

        setVisible(true);
    }
}