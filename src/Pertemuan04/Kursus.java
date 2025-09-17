/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
import java.util.ArrayList;

public class Kursus {
    private int idKursus;
    private String nama;
    private String deskripsi;
    private Instruktur instruktur;
    private ArrayList<Konten> daftarKonten = new ArrayList<>();

    public Kursus(int idKursus, String nama, String deskripsi, Instruktur instruktur) {
        this.idKursus = idKursus;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.instruktur = instruktur;
    }

    public String getNama() { return nama; }
    public Instruktur getInstruktur() { return instruktur; }

    public void tambahKonten(Konten konten) {
        daftarKonten.add(konten);
    }

    public ArrayList<Konten> getDaftarKonten() {
        return daftarKonten;
    }
}
