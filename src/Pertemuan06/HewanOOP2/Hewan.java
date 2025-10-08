/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP2;

/**
 *
 * @author WINDOWS 11
 */
public class Hewan {
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Konstruktor Hewan dipanggil");
    }
    
    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
    
}
