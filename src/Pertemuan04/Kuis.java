/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Kuis extends Konten {
    private int jumlahSoal;

    public Kuis(int idKonten, String isi, String levelKesulitan, int jumlahSoal) {
        super(idKonten, "Kuis", isi, levelKesulitan);
        this.jumlahSoal = jumlahSoal;
    }

    @Override
    public void tampilkan() {
        System.out.println("Kuis: " + getIsi() + " - " + jumlahSoal + " soal (Level: " + getLevelKesulitan() + ")");
    }
}