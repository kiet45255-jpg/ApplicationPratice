import javax.swing.*;
import java.awt.event.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Máy tính 2 số");
        setSize(320, 250);
        setLayout(null);

        JLabel lbl1 = new JLabel("Số 1:");
        JLabel lbl2 = new JLabel("Số 2:");
        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();

        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("/");

        JLabel result = new JLabel();

        lbl1.setBounds(20, 20, 50, 25);
        txt1.setBounds(80, 20, 180, 25);
        lbl2.setBounds(20, 60, 50, 25);
        txt2.setBounds(80, 60, 180, 25);

        btnAdd.setBounds(20, 100, 60, 30);
        btnSub.setBounds(90, 100, 60, 30);
        btnMul.setBounds(160, 100, 60, 30);
        btnDiv.setBounds(230, 100, 60, 30);

        result.setBounds(20, 150, 280, 25);

        add(lbl1); add(txt1);
        add(lbl2); add(txt2);
        add(btnAdd); add(btnSub); add(btnMul); add(btnDiv);
        add(result);

        // xử lý chung
        ActionListener handler = e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                double res = 0;

                if (e.getSource() == btnAdd) res = a + b;
                else if (e.getSource() == btnSub) res = a - b;
                else if (e.getSource() == btnMul) res = a * b;
                else if (e.getSource() == btnDiv) {
                    if (b == 0) {
                        result.setText("Không thể chia cho 0");
                        return;
                    }
                    res = a / b;
                }

                result.setText("Kết quả: " + res);

            } catch (Exception ex) {
                result.setText("Nhập số hợp lệ");
            }
        };

        btnAdd.addActionListener(handler);
        btnSub.addActionListener(handler);
        btnMul.addActionListener(handler);
        btnDiv.addActionListener(handler);

        setVisible(true);
    }
}