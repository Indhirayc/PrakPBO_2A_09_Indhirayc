/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan09.Percobaan1;

/**
 *
 * @author WINDOWS 11
 */
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.print("Namaku " + this.nama + ", ");
        System.out.print("sekarang aku mengajak hewan peliharaanku berjalan-jalan...\n");
        this.hewanPeliharaan.bergerak();
    }
}