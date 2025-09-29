/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentitas.relasiclass.percobaan2;

/**
 *
 * @author WINDOWS 11
 */
public class Mobil {
    private String merk;
    private int biaya;

    // Constructor default
    public Mobil() {
    }

    // Setter & Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    // Method hitung biaya sewa mobil per hari
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}