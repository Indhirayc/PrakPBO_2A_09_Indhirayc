/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06;

/**
 *
 * @author WINDOWS 11
 */
// superclass untuk semua anggota kampus
// main class
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("244107020171", "M001", "Budi", "Informatika");
        Dosen dosen1 = new Dosen("19781234", "D001", "Pak Joko", "Teknik Informatika");

        TataTertib aturan1 = new TataTertib("Tidak memakai almamater", "Teguran lisan");
        TataTertib aturan2 = new TataTertib("Terlambat masuk kelas", "Surat peringatan");

        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

        Pelanggaran p1 = new Pelanggaran(mhs1, aturan1, "2025-10-03");
        Pelanggaran p2 = new Pelanggaran(dosen1, aturan2, "2025-10-02");

        sistem.catatPelanggaran(p1);
        sistem.catatPelanggaran(p2);

        sistem.lihatRiwayatPelanggaran(mhs1);
        sistem.lihatRiwayatPelanggaran(dosen1);
    }
}
