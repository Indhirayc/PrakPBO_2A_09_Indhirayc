/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan09.Percobaan2;

/**
 *
 * @author WINDOWS 11
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silakan perkenalkan diri Anda...");
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
    }
}