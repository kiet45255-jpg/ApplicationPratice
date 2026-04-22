package example;
import javax.swing.*;
import java.awt.event.*;

public class PrimeFrame extends JFrame {
    public PrimeFrame() {
        setTitle("Kiểm tra số nguyên tố");
        setSize(300, 200);
        setLayout(null);

        JLabel lbl = new JLabel("Nhập số:");
        JTextField txt = new JTextField();
        JButton btnCheck = new JButton("Kiểm tra");
        JLabel result = new JLabel();

        lbl.setBounds(20, 20, 80, 25);
        txt.setBounds(100, 20, 150, 25);
        btnCheck.setBounds(100, 60, 100, 25);
        result.setBounds(20, 100, 250, 25);

        add(lbl);
        add(txt);
        add(btnCheck);
        add(result);

        btnCheck.addActionListener(e -> {
            try {
                int n = Integer.parseInt(txt.getText());

                if (isPrime(n)) {
                    result.setText(n + " là số nguyên tố");
                } else {
                    result.setText(n + " không phải số nguyên tố");
                }

            } catch (Exception ex) {
                result.setText("Vui lòng nhập số hợp lệ");
            }
        });

        setVisible(true);
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
