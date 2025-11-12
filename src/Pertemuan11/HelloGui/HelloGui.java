package Pertemuan11.HelloGui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 11
 */
import  javax.swing.*;
public class HelloGui {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
                         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                         frame.setSize(600,300);
                         frame.setLocation(200,200);
                         frame.setVisible(true);
    }
}
