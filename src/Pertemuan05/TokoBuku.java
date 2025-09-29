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
public class TokoBuku {
    private String nama;
    private ArrayList<Buku> daftarBuku;

    public TokoBuku(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di " + nama + ":");
        for (Buku b : daftarBuku) {
            b.tampilInfo(); // langsung panggil void
            System.out.println();
        }
    }
}
