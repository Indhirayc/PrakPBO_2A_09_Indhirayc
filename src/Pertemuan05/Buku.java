/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan05;
/**
 *
 * @author WINDOWS 11
 */
public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;

    public Buku(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getJudul() { 
        return judul; 
    }
    
    public String getPenulis() { 
        return penulis; 
    }
    
    public int getTahunTerbit() { 
        return tahunTerbit; 
    }
    
    
    public void tampilInfo() {
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
        System.out.println("Harga          : " + harga);
    }
}