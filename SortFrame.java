/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Giaiptbac2;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class SortFrame extends JFrame {
    public SortFrame() {
        setTitle("Sắp xếp 3 số");
        setSize(300, 250);
        setLayout(null);

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton btnSort = new JButton("Sắp xếp");
        JLabel result = new JLabel();

        t1.setBounds(20, 20, 200, 25);
        t2.setBounds(20, 60, 200, 25);
        t3.setBounds(20, 100, 200, 25);
        btnSort.setBounds(60, 140, 120, 25);
        result.setBounds(20, 180, 250, 25);

        add(t1); add(t2); add(t3);
        add(btnSort); add(result);

        btnSort.addActionListener(e -> {
            int[] arr = {
                Integer.parseInt(t1.getText()),
                Integer.parseInt(t2.getText()),
                Integer.parseInt(t3.getText())
            };
            Arrays.sort(arr);
            result.setText(arr[0] + " - " + arr[1] + " - " + arr[2]);
        });

        setVisible(true);
    }
}