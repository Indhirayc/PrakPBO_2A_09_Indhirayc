/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.KendaraanOOP;

/**
 *
 * @author WINDOWS 11
 */
abstract class Kendaraan {
    protected String merk;
    protected int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Abstract method (harus dioverride oleh subclass)
    public abstract void jalankan();

    // Method non-abstract
    public void info() {
        System.out.println("Merk       : " + merk);
        System.out.println("Tahun      : " + tahunProduksi);
    }
}
