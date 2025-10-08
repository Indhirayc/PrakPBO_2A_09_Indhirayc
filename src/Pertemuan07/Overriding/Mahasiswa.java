/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Overriding;

/**
 *
 * @author WINDOWS 11
 */
public class Mahasiswa extends Manusia {
    @Override
    void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar semalaman");
    }
}