/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.tugas;

/**
 *
 * @author WINDOWS 11
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private Petugas petugas;
    private int lama; 
    private int biayaHarian = 2000; 

    public Peminjaman(Anggota anggota, Buku buku, Petugas petugas, int lama) {
        this.anggota = anggota;
        this.buku = buku;
        this.petugas = petugas;
        this.lama = lama;
    }

    public int hitungBiayaTotal() {
        return biayaHarian * lama;
    }

    public String info() {
        String info = "=== Data Peminjaman ===\n";
        info += anggota.info();
        info += buku.info();
        info += petugas.info();
        info += "Lama Pinjam: " + lama + " hari\n";
        info += "Total Biaya: Rp " + hitungBiayaTotal() + "\n";
        return info;
    }
}