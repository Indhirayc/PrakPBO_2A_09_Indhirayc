/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;

/**
 *
 * @author WINDOWS 11
 */
public class BukuSekolah extends Buku {
    private String mataPelajaran;
    private String jenjang;

    public BukuSekolah(String judul, String penulis, int tahunTerbit, double harga, String mataPelajaran, String jenjang) {
        super(judul, penulis, tahunTerbit, harga);
        this.mataPelajaran = mataPelajaran;
        this.jenjang = jenjang;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Mata Pelajaran : " + mataPelajaran);
        System.out.println("Jenjan         : " + jenjang);
        System.out.println("-----------------------------------");
    }
}
