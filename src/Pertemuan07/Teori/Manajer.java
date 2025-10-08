/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Teori;

/**
 *
 * @author WINDOWS 11
 */
public class Manajer {
    protected String nama;
    protected int gaji;

    public Manajer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 1000000; // kenaikan gaji untuk manajer biasa
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}