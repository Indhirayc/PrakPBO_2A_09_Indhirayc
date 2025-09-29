/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;

/**
 *
 * @author WINDOWS 11
 */
public class BukuKomik extends Buku {
    private String ilustrator;
    private int volume;

    public BukuKomik(String judul, String penulis, int tahunTerbit, double harga, String ilustrator, int volume) {
        super(judul, penulis, tahunTerbit, harga);
        this.ilustrator = ilustrator;
        this.volume = volume;
    }
    
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Ilustrator     : " + ilustrator);
        System.out.println("Volume         : " + volume);
        System.out.println("-----------------------------------");
    }
}
