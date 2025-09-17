/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Artikel extends Konten {
    private String penulis;

    public Artikel(int idKonten, String isi, String levelKesulitan, String penulis) {
        super(idKonten, "Artikel", isi, levelKesulitan);
        this.penulis = penulis;
    }

    @Override
    public void tampilkan() {
        System.out.println("Artikel oleh " + penulis + ": " + getIsi() + " (Level: " + getLevelKesulitan() + ")");
    }
}