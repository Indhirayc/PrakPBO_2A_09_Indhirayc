/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06;

/**
 *
 * @author WINDOWS 11
 */
public class TataTertib {
    private String peraturan;
    private String sanksi;

    public TataTertib(String peraturan, String sanksi) {
        this.peraturan = peraturan;
        this.sanksi = sanksi;
    }

    public String getPeraturan() {
        return peraturan;
    }

    public String getSanksi() {
        return sanksi;
    }
    
    public void terapkanSanksi (AnggotaKampus anggota){
        System.out.println("Sanksi untuk " + anggota.getNama() + ": " + sanksi);
    }
}
