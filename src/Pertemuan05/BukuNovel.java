/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;

/**
 *
 * @author WINDOWS 11
 */
public class BukuNovel extends Buku {
    private String genre;

    public BukuNovel(String judul, String penulis, int tahunTerbit, double harga, String genre) {
        super(judul, penulis, tahunTerbit, harga);
        this.genre = genre;
    }
    
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Genre          : " + genre);
        System.out.println("-----------------------------------");
    }
}
