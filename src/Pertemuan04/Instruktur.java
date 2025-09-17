/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Instruktur {
    private int idInstruktur;
    private String nama;
    private String keahlian;

    public Instruktur(int idInstruktur, String nama, String keahlian) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public String getNama() { return nama; }
}