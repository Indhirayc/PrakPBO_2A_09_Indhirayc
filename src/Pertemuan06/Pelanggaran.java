/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06;

/**
 *
 * @author WINDOWS 11
 */
public class Pelanggaran {
    private AnggotaKampus pelanggar;
    private TataTertib peraturanDilanggar;
    private String tanggal;

    public Pelanggaran(AnggotaKampus pelanggar, TataTertib peraturanDilanggar, String tanggal) {
        this.pelanggar = pelanggar;
        this.peraturanDilanggar = peraturanDilanggar;
        this.tanggal = tanggal;
    }

    public AnggotaKampus getPelanggar() {
        return pelanggar;
    }

    public TataTertib getPeraturanDilanggar() {
        return peraturanDilanggar;
    }

    public String getTanggal() {
        return tanggal;
    }
}
