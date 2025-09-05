/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Barangs {
    public String kode, namabarang;
    public int hargaDasar;
    public double diskon;
    
    public double hitungHargaJual() {
        return hargaDasar - (diskon * hargaDasar);
    }
    
    public void tampilData() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namabarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + (diskon * 100) + "%");
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
