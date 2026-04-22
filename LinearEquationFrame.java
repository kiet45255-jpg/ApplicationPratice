package example;
import javax.swing.*;
import java.awt.event.*;

public class LinearEquationFrame extends JFrame {
    public LinearEquationFrame() {
        setTitle("Giải PT bậc nhất");
        setSize(300, 200);
        setLayout(null);

        JLabel lblA = new JLabel("a:");
        JLabel lblB = new JLabel("b:");
        JTextField txtA = new JTextField();
        JTextField txtB = new JTextField();
        JButton btnSolve = new JButton("Giải");
        JLabel result = new JLabel();

        lblA.setBounds(20, 20, 50, 25);
        txtA.setBounds(80, 20, 150, 25);
        lblB.setBounds(20, 60, 50, 25);
        txtB.setBounds(80, 60, 150, 25);
        btnSolve.setBounds(80, 100, 80, 25);
        result.setBounds(20, 130, 250, 25);

        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(btnSolve); add(result);

        btnSolve.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());

            if (a == 0) {
                result.setText(b == 0 ? "Vô số nghiệm" : "Vô nghiệm");
            } else {
                result.setText("x = " + (-b / a));
            }
        });

        setVisible(true);
    }
}