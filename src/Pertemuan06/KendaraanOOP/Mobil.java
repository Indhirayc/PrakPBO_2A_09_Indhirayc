/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.KendaraanOOP;

/**
 *
 * @author WINDOWS 11
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void jalankan() {
        System.out.println("Mobil " + merk + " berjalan dengan empat roda.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
