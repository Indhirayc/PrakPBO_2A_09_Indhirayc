package Pertemuan11.HelloGui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 11
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInputForm extends JFrame {
    private JLabel aJLabel;
    private JLabel bJLabel;
    private JLabel cJLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton btnKali;
    private JButton btnTambah; // <-- tombol baru
    private JPanel panel;

    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 200;

    // Membuat label dan text field
    private void createTextField() {
        aJLabel = new JLabel("Nilai A: ");
        bJLabel = new JLabel("Nilai B: ");
        cJLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    // Membuat tombol dan event listener
    private void createButton() {
        // Tombol untuk perkalian
        btnKali = new JButton("Kali");
        class KaliListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a * b;
                cJLabel.setText("Hasil: " + c);
            }
        }
        btnKali.addActionListener(new KaliListener());

        // Tombol untuk penambahan
        btnTambah = new JButton("Tambah");
        class TambahListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a + b;
                cJLabel.setText("Hasil: " + c);
            }
        }
        btnTambah.addActionListener(new TambahListener());
    }

    // Membuat panel untuk menampung komponen
    private void createPanel() {
        panel = new JPanel();
        panel.add(aJLabel);
        panel.add(aField);
        panel.add(bJLabel);
        panel.add(bField);
        panel.add(btnKali);
        panel.add(btnTambah); // <-- tombol baru ditambahkan ke panel
        panel.add(cJLabel);
        add(panel);
    }

    // Konstruktor utama
    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // Main method
    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
