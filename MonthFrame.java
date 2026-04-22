
package Giaiptbac2;

import javax.swing.*;
import java.awt.event.*;

public class MonthFrame extends JFrame {
    public MonthFrame() {
        setTitle("Số ngày trong tháng");
        setSize(300, 200);
        setLayout(null);

        JLabel lblMonth = new JLabel("Tháng:");
        JTextField txtMonth = new JTextField();
        JButton btnCheck = new JButton("Kiểm tra");
        JLabel result = new JLabel();

        lblMonth.setBounds(20, 20, 50, 25);
        txtMonth.setBounds(80, 20, 150, 25);
        btnCheck.setBounds(80, 60, 100, 25);
        result.setBounds(20, 100, 250, 25);

        add(lblMonth); add(txtMonth);
        add(btnCheck); add(result);

        btnCheck.addActionListener(e -> {
            int m = Integer.parseInt(txtMonth.getText());
            int days;

            switch (m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31; break;
                case 4: case 6: case 9: case 11:
                    days = 30; break;
                case 2:
                    days = 28; break;
                default:
                    result.setText("Tháng không hợp lệ");
                    return;
            }
            result.setText("Số ngày: " + days);
        });

        setVisible(true);
    }
}