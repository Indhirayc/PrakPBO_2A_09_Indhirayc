/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentitas.relasiclass.percobaan2;

/**
 *
 * @author WINDOWS 11
 */
public class Sopir {
    private String nama;
    private int biaya;

    // Constructor default
    public Sopir() {
    }

    // Setter & Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    // Method hitung biaya sopir per hari
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}