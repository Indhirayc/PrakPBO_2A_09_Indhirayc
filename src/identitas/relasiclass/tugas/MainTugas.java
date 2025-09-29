/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.tugas;

/**
 *
 * @author WINDOWS 11
 */
public class MainTugas {
    public static void main(String[] args) {
        Anggota a1 = new Anggota("A001", "Andi");
        Buku b1 = new Buku("Pemrograman Java", "Budi Santoso", 75000);
        Petugas p1 = new Petugas("P001", "Siti");

        Peminjaman pinjam1 = new Peminjaman(a1, b1, p1, 5);

        System.out.println(pinjam1.info());
    }
}