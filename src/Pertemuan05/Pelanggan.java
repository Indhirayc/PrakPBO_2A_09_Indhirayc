/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;
import java.util.ArrayList;
/**
 *
 * @author WINDOWS 11
 */
public class Pelanggan {
    private String nama;
    private String idPelanggan;
    private ArrayList<Buku> keranjang;

    public Pelanggan(String nama, String idPelanggan) {
        this.nama = nama;
        this.idPelanggan = idPelanggan;
        this.keranjang = new ArrayList<>();
    }

    public void beliBuku(Buku buku) {
        keranjang.add(buku);
        System.out.println(nama + " membeli:");
        buku.tampilInfo(); // langsung panggil void
        System.out.println();
    }

    public void daftarBelanja() {
        System.out.println("Keranjang belanja " + nama + ":");
        double total = 0;
        for (Buku b : keranjang) {
            b.tampilInfo();
            System.out.println();
            total += b.getHarga();
        }
        System.out.println("Total Belanja " + nama + ": Rp" + total);
        System.out.println("--------------------------------------");
        System.out.println();
    }
}