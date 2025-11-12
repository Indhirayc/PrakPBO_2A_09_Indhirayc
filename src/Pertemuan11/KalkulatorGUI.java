/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author WINDOWS 11
 */import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public KalkulatorGUI() {
        setTitle("Kalkulator GUI");
        setSize(320, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(6, 6));

        // ===== Display =====
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Consolas", Font.BOLD, 28));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // ===== Panel Tombol =====
        JPanel panelTombol = new JPanel(new GridLayout(5, 4, 6, 6));
        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for (String teks : tombol) {
            JButton btn = new JButton(teks);
            btn.setFont(new Font("Consolas", Font.BOLD, 20));
            btn.addActionListener(this);
            panelTombol.add(btn);
        }

        add(panelTombol, BorderLayout.CENTER);
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("0123456789.".contains(cmd)) {
            if (startNewNumber) {
                display.setText(cmd.equals(".") ? "0." : cmd);
                startNewNumber = false;
            } else {
                if (cmd.equals(".") && display.getText().contains(".")) return;
                display.setText(display.getText() + cmd);
            }
        } 
        else if ("+-*/".contains(cmd)) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            startNewNumber = true;
        } 
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Tidak bisa dibagi dengan 0!", "Error", JOptionPane.ERROR_MESSAGE);
                        result = 0;
                    } else result = num1 / num2;
                    break;
            }
            display.setText(formatResult(result));
            startNewNumber = true;
        } 
        else if (cmd.equals("C")) {
            display.setText("0");
            num1 = num2 = result = 0;
            operator = "";
            startNewNumber = true;
        }
    }

    private String formatResult(double val) {
        if (val == (long) val)
            return String.format("%d", (long) val);
        else
            return String.format("%s", val);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KalkulatorGUI().setVisible(true));
    }
}