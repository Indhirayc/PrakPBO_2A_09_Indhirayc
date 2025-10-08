/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.KendaraanOOP;

/**
 *
 * @author WINDOWS 11
 */
public class Motor extends Kendaraan {
    private int kapasitasCC;

    public Motor(String merk, int tahunProduksi, int kapasitasCC) {
        super(merk, tahunProduksi);
        this.kapasitasCC = kapasitasCC;
    }

    @Override
    public void jalankan() {
        System.out.println("Motor " + merk + " berjalan dengan dua roda.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas CC: " + kapasitasCC);
    }
}