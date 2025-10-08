/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.KendaraanOOP;

/**
 *
 * @author WINDOWS 11
 */
public class Truk extends Kendaraan {
    private int kapasitasMuatan;

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void jalankan() {
        System.out.println("Truk " + merk + " berjalan membawa muatan berat.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " kg");
    }
}
