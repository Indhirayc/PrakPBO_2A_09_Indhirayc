/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        // Buat beberapa buku
        BukuNovel novel = new BukuNovel("Laskar Pelangi", "Andrea Hirata", 2005, 85000, "Drama");
        BukuKomik komik = new BukuKomik("Naruto", "Masashi Kishimoto", 1999, 45000, "Masashi Kishimoto", 72);
        BukuSekolah sekolah = new BukuSekolah("Matematika Kelas 10", "Tim Penulis", 2020, 60000, "Matematika", "SMA");

        // Buat toko buku
        TokoBuku toko = new TokoBuku("Toko Buku Mariposa");
        toko.tambahBuku(novel);
        toko.tambahBuku(komik);
        toko.tambahBuku(sekolah);

        toko.tampilkanBuku();

        // Buat pelanggan & beli buku
        Pelanggan p1 = new Pelanggan("Siti", "P001");
        Pelanggan p2 = new Pelanggan("Budi", "P002");

        p1.beliBuku(novel);
        p1.beliBuku(komik);

        p2.beliBuku(komik); // Buku Naruto juga dibeli pelanggan lain

        p1.daftarBelanja();
        p2.daftarBelanja();
    }
}
