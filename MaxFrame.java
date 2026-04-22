package Doannhom;

import javax.swing.*;
import java.awt.event.*;

public class MaxFrame extends JFrame {
    public MaxFrame() {
        setTitle("Tìm số lớn nhất");
        setSize(300, 250);
        setLayout(null);

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton btnFind = new JButton("Tìm max");
        JLabel result = new JLabel();

        t1.setBounds(20, 20, 200, 25);
        t2.setBounds(20, 60, 200, 25);
        t3.setBounds(20, 100, 200, 25);
        btnFind.setBounds(60, 140, 120, 30);
        result.setBounds(20, 180, 250, 25);

        add(t1); add(t2); add(t3);
        add(btnFind); add(result);

        btnFind.addActionListener(e -> {
            try {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = Double.parseDouble(t3.getText());

                double max = Math.max(a, Math.max(b, c));

                result.setText("Số lớn nhất: " + max);

            } catch (Exception ex) {
                result.setText("Nhập số hợp lệ");
            }
        });

        setVisible(true);
    }
}
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMenu();
        });
    }
}
